package studentSystem_2_Search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
/*
 * 
 * 写上去就会直接调用程�?，一方�?��?按常�?�出牌，一方�?�其实方便用户
 */
public class StuModel extends AbstractTableModel{//这�?�深了，直接�?始化�?�就�?�以当table用。

	//Connection stuff:
	Vector rowData, columnNames;
	
	//定义连接数�?�库的东西：
	PreparedStatement ps = null;
	Connection ct = null;
	ResultSet rs = null;
	
	public void init(String sql){
		
		if(sql==""){
			sql = "select * from stu";
		}
		
		columnNames = new Vector();

		columnNames.add("ID");
		columnNames.add("Name");
		columnNames.add("Sex");
		columnNames.add("Age");
		columnNames.add("JiGuan");
		columnNames.add("Major");

		rowData = new Vector();
		


		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//2.得到连接： 连接到哪个数�?��?
			ct = DriverManager.getConnection("jdbc:odbc:mytest");
			//3.Statement:
			ps = ct.prepareStatement(sql);
			//4.Run:
			rs = ps.executeQuery();
			
			while(rs.next()){
				Vector hang = new Vector();
				hang.add(rs.getString(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(rs.getInt(4));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				
				rowData.add(hang);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(ct!=null) ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public StuModel(String sql){
		
		this.init(sql);
		
	}
	
	public StuModel(){
		
		this.init("");
	}
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return (String) this.columnNames.get(column);
	}

	@Override
	public int getColumnCount() {//自己自动调动 XXX
		// TODO Auto-generated method stub
		return this.columnNames.size();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.rowData.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		// TODO Auto-generated method stub
		return ((Vector) this.rowData.get(row)).get(column);
	}

}
