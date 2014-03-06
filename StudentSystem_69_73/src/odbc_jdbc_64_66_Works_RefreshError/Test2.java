package odbc_jdbc_64_66_Works_RefreshError;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test2 {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection ct = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
			ct = DriverManager.getConnection("jdbc:odbc:mytest");
			
			ps = ct.prepareStatement("select * from stu1");
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//为了程�?更�?�壮，加两�?��?： 
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(ct!=null) ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
