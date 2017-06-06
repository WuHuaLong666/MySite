package com.javaDataBase;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.Statement;

public class Datademo {
    public static final String DBDRIVER ="com.mysql.jdbc.Driver";
    public static final String DBURL ="jdbc:mysql://localhost:3306/demo";
    public static final String DBUSER ="root";
    public static final String DBPWD ="root";
	

	public static void main(String[] args) throws Exception {
		//注册驱动
    	Class.forName(DBDRIVER);
		//建立连接
		
		Connection conn= DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		
		//创建执行sql的语句
		//String str="update school set address='bj'where id=4;";
		String str="update school set address='bj';";
		Statement st= conn.createStatement();
		//执行操作
		int i=st.executeUpdate(str);
		System.out.println("i="+i);
		//关闭输出
		st.close();
		conn.close();
		
		
		
	}

}
