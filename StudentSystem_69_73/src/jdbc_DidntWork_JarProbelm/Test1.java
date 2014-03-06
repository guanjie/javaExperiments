package jdbc_DidntWork_JarProbelm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * !需�?引入3个jar包
 */

public class Test1 {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		PreparedStatement ps = null;
		Connection ct = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			ct = DriverManager.getConnection("jdbc:microsoft:sqlserver://127.0.0.1:1433;databaseName=spdb1");
			ps = ct.prepareStatement("select stuID,stuAge from stu1");
			rs = ps.executeQuery();
			
			while(rs.next()){
				String stuID = rs.getString(1);
				int stuAge = rs.getInt(2);
				
				System.out.println(stuID+" "+stuAge+" ");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}