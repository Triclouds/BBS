package com.bbs.controller.message;

import com.bbs.entity.Message;
import com.bbs.service.MessageService;
import com.bbs.service.impl.MessageServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Tricloud
 * @date 2021/5/12 20:00
 */
@WebServlet("/addmessage")
public class AddMessage extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        //发帖
        HttpSession session = req.getSession();
        String author = (String) session.getAttribute("account");
        if (author == null) {
            author = "匿名用户";
        }
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        Message message = new Message(null, title, author, content, null);
        MessageService messageService = new MessageServiceImpl();
        messageService.addMessage(message);
        resp.sendRedirect("/BBS/show");
    }
}
