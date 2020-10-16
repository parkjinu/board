package com.example.board.controller;

import com.example.board.dao.TestDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
//@MapperScan(basePackages = "com.example.board.dao")
public class TestController {

    @Autowired
    private TestDao testDao;

    @RequestMapping("/test")
    public String test(Model model) throws SQLException {
        model.addAttribute("test", testDao.selectTest());
        return "test";
    }

}
