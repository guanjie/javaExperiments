package studentSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Test1 extends JFrame {

	
	Vector rowData;
	Vector columnNames;
	JTable jt = null;
	JScrollPane jsp = null;
	
	//定义数据库的时候需要的： XXX
	PreparedStatement ps = null;
	Connection ct = null;
	ResultSet rs = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();
	
	}
	
	public Test1(){
		columnNames = new Vector();
		columnNames.add("学号:");
		columnNames.add("姓名:");
		columnNames.add("性别:");
		columnNames.add("年龄:");
		columnNames.add("爱好:");
		
		rowData = new Vector();
//		Vector hang1 = new Vector();
//		hang1.add("001");
//		hang1.add("孙悟空");
//		hang1.add("男");
//		hang1.add("500");
//		hang1.add("吃桃子");
		
		try{//连接数据库的时候
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			ct = DriverManager.getConnection("jdbc:microsoft:sqlserver://127.0.0.1:1433;databaseName=spdb1");
			ps = ct.prepareStatement("select * from stu");
			rs = ps.executeQuery();
			
			while(rs.next()){
				Vector hang1 = new Vector();
				hang1.add(rs.getString(1));
				hang1.add(rs.getString(2));
				hang1.add(rs.getString(3));
				hang1.add(rs.getInt(4));
				hang1.add(rs.getString(5));
				hang1.add(rs.getString(6));
				
				rowData.add(hang1);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//关闭
			try{
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(ct!=null) ct.close();
			} catch(Exception e){
				e.printStackTrace();
			} finally {
				
			}
		}
		
		jt = new JTable(rowData, columnNames);
		jsp = new JScrollPane(jt);
		this.add(jsp);
		this.setSize(1900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
