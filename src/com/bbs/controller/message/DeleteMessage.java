package com.bbs.controller.message;

import com.bbs.service.MessageService;
import com.bbs.service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tricloud
 * @date 2021/5/13 20:29
 */
public class DeleteMessage extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MessageService messageService = new MessageServiceImpl();
        messageService.showMessage();
        messageService.deleteMessage("");
    }
}
