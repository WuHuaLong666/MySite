package com.javaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcidDemmo {
	    public static final String DBDRIVER ="com.mysql.jdbc.Driver";
	    public static final String DBURL ="jdbc:mysql://localhost:3306/demo";
	    public static final String DBUSER ="root";
	    public static final String DBPWD ="root";

	public static void main(String[] args)  {
		PreparedStatement ps=null;
		Connection conn=null;
		
		//注册驱动
		//执行插入数据库操作
		int i;
		try {
			Class.forName(DBDRIVER);
			//建立连接
			
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
			
			
			
			//创建执行sql的语句
			String str="update school set name=?,address=? where id=?;";//?是占位符
			//创建preperadstatement语句对象
			 ps=conn.prepareStatement(str);
			//设定值
			ps.setString(1, "mdc");
			ps.setString(2, "la");
			ps.setInt(3, 5);
		    i = ps.executeUpdate();
			System.out.println("i ="+i);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        //打印输出
		
		
		
	
		try {
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}


