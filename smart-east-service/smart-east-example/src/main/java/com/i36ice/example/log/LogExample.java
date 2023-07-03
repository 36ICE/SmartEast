package com.i36ice.example.log;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExample {
    private static final Logger logger = Logger.getLogger(LogExample.class.getName());

    public static void main(String[] args) {
        // Configure the logger
        logger.setLevel(Level.INFO);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);

        // Log a message
        logMessage("Hello, world!");

        // Log an exception
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "An error occurred", e);
            logMessage("occurred");
        }
    }

    private static void logMessage(String message) {
        StackWalker stackWalker = StackWalker.getInstance();
        stackWalker.forEach(frame -> {
            String methodName = frame.getMethodName();
            System.out.println("Method: " + methodName);
        });
        stackWalker
                .walk(stackFrameStream -> stackFrameStream.skip(1).findFirst())
                .ifPresent(frame -> logger.info("[" + frame.getClassName() + ":" +
                        frame.getMethodName() + "():" + frame.getLineNumber() + "] " + message));
    }

    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}