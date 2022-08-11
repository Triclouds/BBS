package com.bbs.controller.message;

import com.bbs.entity.Message;
import com.bbs.service.MessageService;
import com.bbs.service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Tricloud
 * @date 2021/5/13 16:49
 */
@WebServlet("/show")
public class ShowMessage extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入程序");
        MessageService messageService = new MessageServiceImpl();
        List<Message> list = messageService.showMessage();
        System.out.println(list);
        req.setAttribute("list", list);
        req.getRequestDispatcher("/allMessage.jsp").forward(req, resp);
    }
}