package com.hp.controller;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DelServlet",urlPatterns = "/DelServlet")
public class DelServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req ,HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req ,resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");

        String is_del = req.getParameter("is_del");
        System.out.println("is_del = " + is_del);
        Map hashMap=new HashMap<>();
        hashMap.put("code",0);
        hashMap.put("msg","修改成功");
        hashMap.put("is_del","使用");

        String s = JSON.toJSONString(hashMap);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
