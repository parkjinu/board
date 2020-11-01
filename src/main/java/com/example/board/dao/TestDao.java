package com.example.board.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.board.dto.Table1DTO;

public interface TestDao {
    public String selectTest() throws SQLException;
    
    
    
    public Table1DTO selectTable1Count() throws SQLException;
    public int selectTable1Count2(int column2) throws SQLException;
    public List<Table1DTO> selectTable1List() throws SQLException;
    public Table1DTO selectTable1(int column2) throws SQLException;
    
    public int insertTable1(Table1DTO table1dto) throws SQLException;
    public int updateTable1(Table1DTO table1dto) throws SQLException;
    public int deleteTable1(int column2) throws SQLException;
}
