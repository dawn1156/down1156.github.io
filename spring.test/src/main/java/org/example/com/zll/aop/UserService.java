package org.example.com.zll.aop;


/**
 * 用户信息业务逻辑接口
 * @author pan_junbiao
 **/
public interface UserService
{
    /**
     * 用户注册
     */
    public boolean register(String userName, String blogUrl, String sex);

    /**
     * 用户评论
     */
    public void comment(String userName,String comments);
}
