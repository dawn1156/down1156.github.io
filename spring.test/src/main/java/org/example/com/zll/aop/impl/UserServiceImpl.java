package org.example.com.zll.aop.impl;

import org.example.com.zll.aop.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean register(String userName, String blogUrl, String sex) {
        System.out.println("业务方法comment执行完成");
        return false;
    }

    @Override
    public void comment(String userName, String comments) {
        System.out.println("业务方法comment执行完成");

    }
}
