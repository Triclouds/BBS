package com.bbs.dao;

import com.bbs.entity.Users;
import com.bbs.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Tricloud
 * @date 2021/5/10 10:06
 */
public class UsersDao {
    /**
     * 根据账号密码查询用户是否存在
     */
    public Users findUser(Users users, Connection conn) throws SQLException {
        String sql = "select id, account, password, telephone, image from users where account = ? and password = ?";
        System.out.println(users);
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, users.getAccount());
        ps.setString(2, users.getPassword());
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            Users returnUser = new Users();
            returnUser.setId(rs.getInt(1));
            returnUser.setAccount(rs.getString(2));
            returnUser.setPassword(rs.getString(3));
            returnUser.setTelephone(rs.getString(4));
            returnUser.setImage(rs.getString(5));
            return returnUser;
        }
        return null;
    }
    /**
     * 添加用户
     */
    public void addUser(Users users, Connection conn) throws SQLException {
        String sql = "insert into users(account, password, telephone, image) values(?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, users.getAccount());
        ps.setString(2, users.getPassword());
        ps.setString(3, users.getTelephone());
        ps.setString(4, users.getImage());
        ps.execute();
        JDBCUtils.close(null, ps, null);
    }
}
