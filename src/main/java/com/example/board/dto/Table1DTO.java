package com.example.board.dto;

import java.util.Arrays;

public class Table1DTO {
	
	String column1;
	int column2;
	Object column3;
	byte[] column4;
	
	public String getColumn1() {
		return column1;
	}
	public void setColumn1(String column1) {
		this.column1 = column1;
	}
	public int getColumn2() {
		return column2;
	}
	public void setColumn2(int column2) {
		this.column2 = column2;
	}
	public void setColumn3(String column3) {
		this.column3 = column3;
	}
	public Object getColumn3() {
		return column3;
	}
	public void setColumn3(Object column3) {
		this.column3 = column3;
	}
	public byte[] getColumn4() {
		return column4;
	}
	public void setColumn4(byte[] column4) {
		this.column4 = column4;
	}
	@Override
	public String toString() {
		return "Table1DTO [column1=" + column1 + ", column2=" + column2 + ", column3=" + column3 + ", column4="
				+ Arrays.toString(column4) + "]";
	}
	
	
	
	
}
