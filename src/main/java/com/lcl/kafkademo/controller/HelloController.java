package com.lcl.kafkademo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {
    @RequestMapping(value="/hello123",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "Hello, World!";
    }

    @RequestMapping(value="/hello321",method = RequestMethod.POST)
    @ResponseBody
    public String sayHello(HttpServletRequest request, HttpServletResponse response){
        String user=request.getParameter("name");
        String pass=request.getParameter("pass");
        System.out.println("neme="+user+",pass="+pass);
        return "接收到数据";
    }

}
