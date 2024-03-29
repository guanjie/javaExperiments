package studentSystem_1_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MiniStudentSystem11350215 extends JFrame{

	JPanel jPanel1, jPanel2;
	JLabel jLabel1;
	JButton jButton1, jButton2, jButton3, jButton4;
	JTable jTable;
	JScrollPane jScrollPane;
	JTextField jTextField;
	
	//Connection stuff:
	Vector rowData, columnNames;
	
	//定义连接数据库的东西：
	PreparedStatement ps = null;
	Connection ct = null;
	ResultSet rs = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniStudentSystem11350215 mini = new MiniStudentSystem11350215();
	}
	
	public MiniStudentSystem11350215(){
		jPanel1 = new JPanel();
		jTextField = new JTextField(10);
		jButton1 = new JButton("Search");
		jLabel1 = new JLabel("Please enter name");
		
		//Put everything into jsp:
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField);
		jPanel1.add(jButton1);
		
		jPanel2 = new JPanel();

		jButton2 = new JButton("add");
		jButton3 = new JButton("modify");
		jButton4 = new JButton("delete");
		
		jPanel2.add(jButton2);
		jPanel2.add(jButton3);
		jPanel2.add(jButton4);
		


		
		//--------------------------------//
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
			ps = ct.prepareStatement("select * from stu");
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

		//建立table并且显示在JFRAME里面：
		jTable = new JTable(rowData, columnNames);
		jScrollPane = new JScrollPane(jTable);
		this.add(jScrollPane);
		this.add(jPanel1, "North");
		this.add(jPanel2, "South");

		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//--------------------------------//

	}
}


