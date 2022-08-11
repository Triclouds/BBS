package com.bbs.service;

import com.bbs.entity.Users;

/**
 * @author Tricloud
 * @date 2021/5/10 9:47
 */
public interface UsersService {
    /**
     * 检查账号密码是否正确
     * @param users;
     * @return true or false;
     */
    public boolean checkUser(Users users);

    /**
     * 添加用户
     * @param users;
     * @return true or false;
     */
    public boolean addUser(Users users);

    /**
     * 显示用户信息
     * @param users;
     * @return list of users;
     */
    public Users showUsers(Users users);
}