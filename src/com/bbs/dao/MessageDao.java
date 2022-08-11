package com.bbs.dao;

import com.bbs.entity.Message;
import com.bbs.util.JDBCUtils;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tricloud
 * @date 2021/5/12 17:11
 */
public class MessageDao {
    /**
     * 发帖
     */
    public Message addMessage(Message message, Connection conn) throws SQLException {
        String sql = "insert into message(messageTitle, messageAuthor, messageContent) values (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, message.getMessageTitle());
            ps.setString(2, message.getMessageAuthor());
            ps.setString(3, message.getMessageContent());
            ps.execute();
            JDBCUtils.close(null, ps, null);
        }
        return null;
    }
    /**
     * 看帖
     */
    public List<Message> showMessage(Connection conn) throws SQLException {
        String sql = "select messageID, messageTitle, messageAuthor, messageContent, messageTime from message order by messageTime desc";
        PreparedStatement ps = conn.prepareStatement(sql);
        return getMessages(conn, ps);
    }
    /**
     * 删帖
     */
    public void deleteMessage(String messageID, Connection conn) throws SQLException {
        String sql = "delete from message where messageID = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, messageID);
            ps.execute();
            JDBCUtils.close(null, ps, null);
        }
    }

    /**
     * 改贴
     */
    public void updateMessage(){

    }
    /**
     * 看自己贴
     */
    public List<Message> myMessage(String messageAuthor, Connection conn) throws SQLException {
        String sql = "select messageID, messageTitle, messageAuthor, messageContent, messageTime from message where messageAuthor = ? order by messageTime desc";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, messageAuthor);
        ps.execute();
        return getMessages(conn, ps);
    }

    /**
     * 获取信息
     * @param conn;
     * @param ps;
     * @return list
     * @throws SQLException
     */
    private List<Message> getMessages(Connection conn, PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();
        List<Message> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
        Date date = null;
        String mesTime = null;
        while (rs.next()){
            Message m = new Message();
            m.setMessageID(rs.getInt("messageID"));
            m.setMessageTitle(rs.getString("messageTitle"));
            m.setMessageAuthor(rs.getString("messageAuthor"));
            m.setMessageContent(rs.getString("messageContent"));
            date = rs.getTimestamp("messageTime");
            mesTime = sdf.format(date);
            m.setMessageTime(mesTime);
            list.add(m);
        }
        JDBCUtils.close(rs, null, conn);
        return list;
    }
}
