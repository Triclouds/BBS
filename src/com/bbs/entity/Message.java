package com.bbs.entity;

/**
 * @author Tricloud
 * @date 2021/5/12 17:00
 */
public class Message {
    Integer messageID;
    String messageTitle;
    String messageAuthor;
    String messageContent;
    String messageTime;

    public Integer getMessageID() {
        return messageID;
    }

    public void setMessageID(Integer messageID) {
        this.messageID = messageID;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageID=" + messageID +
                ", messageTitle='" + messageTitle + '\'' +
                ", messageAuthor='" + messageAuthor + '\'' +
                ", messageContent='" + messageContent + '\'' +
                ", messageTime='" + messageTime + '\'' +
                '}';
    }

    public Message(Integer messageID, String messageTitle, String messageAuthor, String messageContent, String messageTime) {
        super();
        this.messageID = messageID;
        this.messageTitle = messageTitle;
        this.messageAuthor = messageAuthor;
        this.messageContent = messageContent;
        this.messageTime = messageTime;
    }

    public Message() {
        super();
    }
}
