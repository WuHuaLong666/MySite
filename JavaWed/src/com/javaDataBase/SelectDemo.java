package com.javaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
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
		String str="select * from school;";
		Statement st= conn.createStatement();
		System.out.println("id"+"\t\t"+"name"+"\t\t"+"address");
	     //执行查询数据库的操作
		ResultSet rs=st.executeQuery(str);
		//处理执行结果
		while (rs.next()) {
		/*int id=	rs.getInt("id");
		String name =rs.getString("name");
		String address=rs.getString("address");*/
			//使用索引取必须从1开始
			int id=	rs.getInt(1);
			String name =rs.getString(2);
			String address=rs.getString(3);
		System.out.println("----------------------------------------------");
		System.out.print(id+"\t\t");
		System.out.print(name+"\t\t");
		System.out.println(address+"\t\t");
			
		}
		//st.executeUpdate(str);
		rs.close();
		st.close();
		conn.close();
	}

}
