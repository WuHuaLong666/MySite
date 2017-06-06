package com.javaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreperadStatementDemo {
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
		String str="insert into school(id,name,address) values(?,?,?);";//?是占位符
		//创建preperadstatement语句对象
		PreparedStatement ps=conn.prepareStatement(str);
		//设定值
		ps.setInt(1, 5);
		ps.setString(2, "ncdx");
		ps.setString(3, "jx");
		//执行插入数据库操作
		int i=ps.executeUpdate();
		
		
        //打印输出
		System.out.println("i ="+i);
		
		
		
	
		ps.close();
		conn.close();
		
	}

}

	



