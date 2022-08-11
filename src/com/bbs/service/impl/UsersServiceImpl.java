package com.bbs.service.impl;

import com.bbs.dao.UsersDao;
import com.bbs.entity.Users;
import com.bbs.service.UsersService;
import com.bbs.util.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Tricloud
 * @date 2021/5/10 10:39
 */
public class UsersServiceImpl implements UsersService {
    UsersDao usersDao = new UsersDao();

    /**
     * 查询用户
     */
    @Override
    public boolean checkUser(Users users) {
        Connection conn = JDBCUtils.getConn();
        try {
            assert conn != null;
            users = usersDao.findUser(users,conn);
            if(users != null){
                return true;
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return false;
    }

    /**
     * 添加用户
     * @param users;
     * @return true or false;
     */
    @Override
    public boolean addUser(Users users) {
        Connection conn = JDBCUtils.getConn();
        //查询用户是否存在
        try {
            assert conn != null;
            conn.setAutoCommit(false);
            Users users1 = usersDao.findUser(users,conn);
            if (users1 == null) {
                usersDao.addUser(users,conn);
                conn.commit();
                System.out.println("添加成功");
                return true;
            }else {
                System.out.println("用户已存在");
            }
        } catch (SQLException throwable) {
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwable.printStackTrace();
        } finally {
            JDBCUtils.close(null,null,conn);
        }
        return false;
    }

    @Override
    public Users showUsers(Users users){
        Connection conn = JDBCUtils.getConn();
        try {
            assert conn != null;
            System.out.println(users);
            Users user = usersDao.findUser(users, conn);
            System.out.println(user);
            return user;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
