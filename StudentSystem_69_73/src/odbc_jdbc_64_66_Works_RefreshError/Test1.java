package odbc_jdbc_64_66_Works_RefreshError;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {


	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection ct = null;
		Statement sm = null;
		
		try{//�?��?用preparedStatement
			//1.必须有这�?�，把驱动加入到程�?里�?�
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//2.得到连接： 连接到哪个数�?��?
			ct = DriverManager.getConnection("jdbc:odbc:mytest");
			//3.Statement:
			sm = ct.createStatement();
//			4.Run:
			boolean i = sm.execute("create database xxx");
			
			if(i!=false){
				System.out.println("Updated took place");
			}
			
//			ResultSet rs = sm.executeQuery("select * from stu1");
//			System.out.println(rs.getString(1));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//为了程�?更�?�壮，加两�?��?： 
				if(sm!=null) sm.close();
				if(ct!=null) ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
