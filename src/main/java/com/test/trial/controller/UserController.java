package com.test.trial.controller;

import com.test.trial.modl.User;
import com.test.trial.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    userService userservice;

    @RequestMapping("")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home.jsp");
        List<User> userList = userservice.getAll();
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }

    @RequestMapping("display")
    public ModelAndView displayById(@RequestParam("userId") int userId, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("display.jsp");
        modelAndView.addObject("user", userservice.getById(userId));
        session.setAttribute("userId", userId);
        return modelAndView;
    }

    @RequestMapping("create")
    public ModelAndView createUser(@RequestParam("userName") String userName) {
        userservice.createUser(userName);
        return home();
    }

    @RequestMapping("delete")
    public ModelAndView deleteUser(HttpSession session) {
        userservice.deleteUser((int)session.getAttribute("userId"));
        return home();
    }

    @RequestMapping("updatePage")
    public ModelAndView updatePage(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("update.jsp");
        modelAndView.addObject("user", userservice.getById((int) session.getAttribute("userId")));
        return modelAndView;
    }

    @RequestMapping("update")
    public ModelAndView updateUser(@RequestParam("userName") String userName, HttpSession session) {
        userservice.updateUser((int) session.getAttribute("userId"), userName);
        return home();
    }

}
