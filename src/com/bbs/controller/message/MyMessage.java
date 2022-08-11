package com.bbs.controller.message;

import com.bbs.entity.Message;
import com.bbs.service.MessageService;
import com.bbs.service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author Tricloud
 * @date 2021/5/16 16:40
 */
@WebServlet("/showme")
public class MyMessage extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        MessageService messageService = new MessageServiceImpl();
        HttpSession session = req.getSession();
        String messageAuthor = (String) session.getAttribute("account");
        List<Message> myList = messageService.myMessage(messageAuthor);
        req.setAttribute("myList", myList);
        req.getRequestDispatcher("/myMessage.jsp").forward(req, resp);
    }
}
