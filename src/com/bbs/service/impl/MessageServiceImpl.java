package com.bbs.service.impl;

import com.bbs.dao.MessageDao;
import com.bbs.entity.Message;
import com.bbs.service.MessageService;
import com.bbs.util.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Tricloud
 * @date 2021/5/12 17:09
 */
public class MessageServiceImpl implements MessageService {
    MessageDao messageDao = new MessageDao();
    @Override
    public boolean addMessage(Message message) {
        Connection conn = JDBCUtils.getConn();
        Message message1 = null;
        try {
            assert conn != null;
            message1 = messageDao.addMessage(message,conn);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        if (message1 == null) {
            System.out.println("发帖成功");
            return true;
        }else {
            System.out.println("发帖失败");
        }
        return false;
    }

    @Override
    public List<Message> showMessage() {
        Connection conn = JDBCUtils.getConn();
        List<Message> list = null;
        try {
            assert conn != null;
            list = messageDao.showMessage(conn);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } finally {
            JDBCUtils.close(null, null, conn);
        }
        return list;
    }

    @Override
    public boolean deleteMessage(String messageID) {
        Connection conn = JDBCUtils.getConn();
        try {
            assert conn != null;
            messageDao.deleteMessage(messageID, conn);
            return true;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } finally {
            JDBCUtils.close(null, null, conn);
        }
        return false;
    }

    @Override
    public boolean updateMessage(Message message) {
        Connection conn = JDBCUtils.getConn();

        return false;
    }

    @Override
    public List<Message> myMessage(String messageAuthor) {
        Connection conn = JDBCUtils.getConn();
        List<Message> list = null;
        try {
            assert conn != null;
            list = messageDao.myMessage(messageAuthor, conn);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(null, null, conn);
        }
        return list;
    }
}