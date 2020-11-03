package com.example.board.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.dao.TestDao;
import com.example.board.dto.Table1DTO;

@Controller
//@MapperScan(basePackages = "com.example.board.dao")
public class TestController {

    @Autowired
    private TestDao testDao;
    
//	테스트 데이터
    private String c1 = "title";
    private String c2 = "1001";
    private String c4 = "contents";

    @RequestMapping("/test")
    public String test(Model model) throws SQLException {
        model.addAttribute("test", testDao.selectTest());
        return "test";
    }

    
    
    @RequestMapping("/table1")
    public String table1(HttpServletRequest req, Model model) throws SQLException {
    	List<Table1DTO> list = testDao.selectTable1List();
    	model.addAttribute("test", testDao.selectTest());
    	return "test";
    }
    
    @RequestMapping("/insertTable1")
    public String insertTable1(HttpServletRequest req, Model model) throws SQLException {
    	Table1DTO table1DTO = new Table1DTO();
    	table1DTO.setColumn1(c1);
    	int column2 = Integer.parseInt(c2);
    	table1DTO.setColumn2(column2);
    	table1DTO.setColumn4((c4).getBytes());
    	
    	testDao.insertTable1(table1DTO);
    	model.addAttribute("test", testDao.selectTest());
    	return "test";
    }

    @RequestMapping("/updateTable1")
    public String updateTable1(HttpServletRequest req, Model model) throws SQLException {
    	Table1DTO table1DTO = new Table1DTO();
    	table1DTO.setColumn1(c1 + "_u");
    	int column2 = Integer.parseInt(c2);
    	table1DTO.setColumn2(column2);
    	table1DTO.setColumn4((c4).getBytes());
    	
    	testDao.updateTable1(table1DTO);
    	model.addAttribute("test", testDao.selectTest());
    	return "test";
    }
    
    @RequestMapping("/deleteTable1")
    public String deleteTable1(HttpServletRequest req, Model model) throws SQLException {
    	int column2 = Integer.parseInt(c2);
    	
    	testDao.deleteTable1(column2);
    	model.addAttribute("test", testDao.selectTest());
    	return "test";
    }

}
