package com.javaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavepointDemo {
	    public static final String DBDRIVER ="com.mysql.jdbc.Driver";
	    public static final String DBURL ="jdbc:mysql://localhost:3306/demo";
	    public static final String DBUSER ="root";
	    public static final String DBPWD ="root";

	public static void main(String[] args) throws Exception  {
		Statement st=null;
		Connection conn=null;
		Savepoint sp=null;
		
		
		//注册驱动
    	
			Class.forName(DBDRIVER);
			//建立连接
			
			conn= DriverManager.getConnection(DBURL,DBUSER,DBPWD);
			
			//取消自动提交
			conn.setAutoCommit(false);
			
			st=conn.createStatement();
			//创建执行sql的语句
			
		
			try {
				String str="insert into school(name,address) values";
				st.executeUpdate(str + "('ncdx','jx');");
				st.executeUpdate(str + "('bjdx','bj');");
				//设置保存点
				sp =conn.setSavepoint();
				st.executeUpdate(str + "('lndx','ln');" );
				sp=conn.setSavepoint();
				st.executeUpdate(str + "('hljdx','hlj');" );
				//提交事务
				conn.commit();
				//执行操作
				

			} catch (Exception e) {
				if(sp != null){
					conn.rollback(sp);
					conn.commit();
				}else{
					conn.rollback();
				}
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		//关闭输出
		    
			st.close();
			conn.close();
	
	}

}
