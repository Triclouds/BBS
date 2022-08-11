package com.bbs.controller.users;

import com.bbs.entity.Users;
import com.bbs.service.UsersService;
import com.bbs.service.impl.UsersServiceImpl;
import com.bbs.util.MD5Utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Tricloud
 * @date 2021/5/11 16:18
 */
@MultipartConfig
@WebServlet("/Register")
public class Register extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        //添加用户
        String account = req.getParameter("account");
        String password = req.getParameter("password_1");
        String pwd = MD5Utils.getMD5(password);
        String telephone = req.getParameter("telephone");
        //用户头像上传
        Part part = req.getPart("userImg");
        String fileName = "default_head.png";
        if (part != null && part.getSize() > 0) {
            String realFileName = part.getSubmittedFileName();
            String type = realFileName.substring(realFileName.lastIndexOf("."));
            fileName = UUID.randomUUID() + type;
            String image = getServletContext().getRealPath("/images/upload/") +
                           fileName;
            part.write(image);
        }

        UsersService usersService = new UsersServiceImpl();
        Users users = new Users(null, account, pwd, telephone, fileName);
        boolean flag = usersService.addUser(users);
        if(flag){
            req.setAttribute("data", "注册成功！");
            resp.sendRedirect("/BBS/login.jsp");
        }else {
            req.setAttribute("data", "账号或密码错误");
            resp.sendRedirect("/BBS/Register.jsp");
        }
    }
}
