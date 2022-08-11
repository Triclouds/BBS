package com.bbs.util;

import java.sql.*;

/**
 * @author Tricloud
 * @date 2021/5/10 9:51
 */
public class JDBCUtils {
    /**
     * 获取数据库连接
     */
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/BBS?serverTimezone=GMT%2B8";
    public static final String INFO = "root";
    public static final String PWD = "Tricloud";

    public static Connection getConn(){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,INFO,PWD);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭数据库连接
     */
    public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
