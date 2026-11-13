package com.ysh.usercenter.service;

import com.baomidou.mybatisplus.spring.service.IService;
import com.ysh.usercenter.entity.User;
import jakarta.servlet.http.HttpServletRequest;

public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param planetCode    星球编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request      请求
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser 原始用户信息
     * @return 脱敏后的信息
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request 请求
     * @return result
     */
    int userLogout(HttpServletRequest request);
}
