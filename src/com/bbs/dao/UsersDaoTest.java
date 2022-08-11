package com.bbs.dao;

import com.bbs.entity.Message;
import com.bbs.entity.Users;
import com.bbs.service.MessageService;
import com.bbs.service.UsersService;
import com.bbs.service.impl.MessageServiceImpl;
import com.bbs.service.impl.UsersServiceImpl;
import com.bbs.util.JDBCUtils;
import com.bbs.util.MD5Utils;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;


/**
 * @author Tricloud
 * @date 2021/5/10 10:28
 */
class UsersDaoTest {
    public static void main(String[] args) throws SQLException {
        UsersService usersService = new UsersServiceImpl();
        String pwd = MD5Utils.getMD5("123456");
        Users users = new Users(null, "sanyun", pwd, null, null);
        System.out.println(users);
        Users users1 = usersService.showUsers(users);
        System.out.println(users1.getAccount());
        System.out.println(users1.getPassword());
        System.out.println(users1.getTelephone());
        System.out.println(users1.getImage());
//        boolean flag = usersService.addUser(users);
//        if (flag){
//            System.out.println("注册成功");
//        }
//        else {
//            System.out.println("账号已存在");
//        }
//        Users users1 = new Users(null,"yun","123456");
//        usersService.addUser(users1);

        MessageService messageService = new MessageServiceImpl();
        List l = messageService.showMessage();
//        Message message = new Message(null, "什么是李聪", "sanyun", "如果你不知道什么是李聪的话，我现在就带你研究", null);
//        messageService.addMessage(message);
//        List l = messageService.showMessage();
        System.out.println(l);
//        Message message = null;
////        for (int i = 0; i < l.size(); i++) {
////            message = (Message) l.get(i);
////            System.out.println(message.toString());
////        }
//        Iterator<Message> iterator = l.iterator();
//        while (iterator.hasNext()){
//            message = iterator.next();
////            System.out.println(message.toString());
//            System.out.println(message.getMessageID() + "\t" + message.getMessageTitle() +  "\t" + message.getMessageAuthor() + "\t" + message.getMessageContent() + "\t" + message.getMessageTime());
//        }
//        boolean b = messageService.deleteMessage("1");
//        if(b) {
//            System.out.println("删除成功");
//        }
    }
}