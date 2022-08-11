package com.bbs.service;

import com.bbs.entity.Message;

import java.util.List;

/**
 * @author Tricloud
 * @date 2021/5/12 17:04
 */
public interface MessageService {
    /**
     * 发帖
     * @param message;
     * @return true or false;
     */
    public boolean addMessage(Message message);

    /**
     * 看帖
     * @return list;
     */
    public List<Message> showMessage();

    /**
     * 删帖
     * @param messageID;
     * @return true or false;
     */
    public boolean deleteMessage(String messageID);

    /**
     * 改贴
     */
    public boolean updateMessage(Message message);

    /**
     * 看自己贴
     * @param messageAuthor;
     * @return list;
     */
    public List<Message> myMessage(String messageAuthor);
}
