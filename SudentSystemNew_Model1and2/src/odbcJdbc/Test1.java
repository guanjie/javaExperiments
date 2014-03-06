package odbcJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		PreparedStatement ps = null;
		
		try{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//2.得到连接： 连接到哪个数�?��?
			ct = DriverManager.getConnection("jdbc:odbc:mytest");
			//3.Statement:
			ps = ct.prepareStatement("insert into stu1 values('sp007', 'niubi', 'M', 20, 'NoChin', 'NoChin')");
			//4.Run:
			int i = ps.executeUpdate();
			
			if(i!=0){
				System.out.println("Updated took place");
			}
			

			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//为了程�?更�?�壮，加两�?��?： 
				if(ps!=null) ps.close();
				if(ct!=null) ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
