import React, {useState} from 'react';
import {Button, Checkbox, Form, Input} from 'antd';

const LoginForm = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [remember, setRemember] = useState(false);

    const handleUsernameChange = e => {
        setUsername(e.target.value);
    };

    const handlePasswordChange = e => {
        setPassword(e.target.value);
    };

    const handleRememberChange = e => {
        setRemember(e.target.checked);
    };

    const handleWechatLogin = () => {
        // TODO: Handle WeChat login logic
    };

    const handlePhoneLogin = () => {
        // TODO: Handle phone login logic
    };

    const handleSubmit = e => {
        e.preventDefault();
        // TODO: Handle form submission logic
    };

    return (
        <div style={{ display: 'flex',backgroundImage:'../logo.svg' , justifyContent: 'center', alignItems: 'center', height: '100vh' }}>
            <Form onSubmit={handleSubmit} >
                <Form.Item style={{textAlign: 'center'}}>
                    <Input value={username} onChange={handleUsernameChange} placeholder="请输入用户名"/>
                </Form.Item>
                <Form.Item>
                    <Input.Password value={password} onChange={handlePasswordChange} placeholder="请输入密码"/>
                </Form.Item>
                <Form.Item>
                    <Checkbox checked={remember} onChange={handleRememberChange}>
                        记住我
                    </Checkbox>
                    <a href="#">忘记密码</a>
                </Form.Item>
                <Form.Item>
                    <Button type="primary" htmlType="submit">
                        登录
                    </Button>
                </Form.Item>
                <Form.Item>
                    <div style={{textAlign: 'center'}}>
                        <span>其他登录方式：</span>
                        <Button onClick={handleWechatLogin}>微信登录</Button>
                        <Button onClick={handlePhoneLogin}>手机登录</Button>
                    </div>
                </Form.Item>
            </Form>

        </div>
    );
};

export default LoginForm;
