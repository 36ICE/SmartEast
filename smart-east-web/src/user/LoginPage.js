import React from 'react';
import {Button, Form, Input} from 'antd';
import {LockOutlined, UserOutlined} from '@ant-design/icons';

function LoginForm() {
    const onFinish = (values) => {
        console.log('Received values of form: ', values);
    };

    return (
        <div className="login-form">
            <h1>登录</h1>
            <Form name="normal_login" initialValues={{ remember: true }} onFinish={onFinish}>
                <Form.Item name="username" rules={[{ required: true, message: '请输入用户名!' }]}>
                    <Input prefix={<UserOutlined className="site-form-item-icon" />} placeholder="用户名" />
                </Form.Item>
                <Form.Item name="password" rules={[{ required: true, message: '请输入密码!' }]}>
                    <Input.Password prefix={<LockOutlined className="site-form-item-icon" />} placeholder="密码" />
                </Form.Item>
                <Form.Item>
                    <Button type="primary" htmlType="submit" block>
                        登录
                    </Button>
                </Form.Item>
            </Form>
            <div className="other-login-methods">
                <Button style={{ marginRight: '10px' }}>使用微信登录</Button>
                <Button>使用手机号登录</Button>
            </div>
        </div>
    );
}

export default LoginForm;
