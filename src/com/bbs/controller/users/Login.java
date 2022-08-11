package com.bbs.controller.users;

import com.bbs.entity.Users;
import com.bbs.service.UsersService;
import com.bbs.service.impl.UsersServiceImpl;
import com.bbs.util.MD5Utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Tricloud
 * @date 2021/5/10 17:14
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断账号密码是否正确
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        String pwd = MD5Utils.getMD5(password);
        UsersService usersService = new UsersServiceImpl();
        Users users = new Users(null, account, pwd, null, null);
        boolean flag = usersService.checkUser(users);
        Users users1 = usersService.showUsers(users);
        String telephone = null;
        telephone = users1.getTelephone();
        String image = users1.getImage();
        HttpSession session = req.getSession();
        if(flag){
            session.setAttribute("account", account);
            session.setAttribute("telephone", telephone);
            session.setAttribute("image", image);
            resp.sendRedirect("/BBS/show");
        }else {
            resp.getWriter().write("账号或密码错误");
            System.out.println("账号或密码错误");
            req.setAttribute("data", "账号或密码错误");
//            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
