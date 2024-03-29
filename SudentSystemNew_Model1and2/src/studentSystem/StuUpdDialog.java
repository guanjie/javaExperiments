package studentSystem;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * modify the students
 * 
 */

public class StuUpdDialog extends JDialog implements ActionListener{

	JLabel jLabel1, jLabel2, jLabel3,jLabel4, jLabel5, jLabel6;
	JButton jButton1, jButton2;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;
	JPanel jPanel1, jPanel2, jPanel3;
	
	//Connections:
	PreparedStatement ps = null;
	Connection ct = null;
	ResultSet rs = null;
	
	/*
	 * Owner: father window
	 * Title: window name
	 * Modal: indicates it's modal window or non-modal window
	 */
	public StuUpdDialog(JFrame owner, String title, boolean modal, StuModel sm, int rowNum){
		
		super(owner, title, modal);
		
		//1.New the components:
		jLabel1 = new JLabel("ID");
		jLabel2 = new JLabel("Name");
		jLabel3 = new JLabel("Sex");
		jLabel4 = new JLabel("Age");
		jLabel5 = new JLabel("JiGuan");
		jLabel6 = new JLabel("Major");

		jtf1 = new JTextField();
		//初始化对象：
		jtf1.setText((String)sm.getValueAt(rowNum, 0));
		//让不能修改
		jtf1.setEditable(false);
		jtf2 = new JTextField();
		jtf2.setText((String)sm.getValueAt(rowNum, 1));
		jtf3 = new JTextField();
		jtf3.setText((String)sm.getValueAt(rowNum, 2));
		jtf4 = new JTextField();
		jtf4.setText(sm.getValueAt(rowNum, 3).toString());
		jtf5 = new JTextField();
		jtf5.setText((String)sm.getValueAt(rowNum, 4));
		jtf6 = new JTextField();
		jtf6.setText((String)sm.getValueAt(rowNum, 5));

		jButton1 = new JButton("modify");
		jButton1.addActionListener(this);
		jButton2 = new JButton("cancel");
		jButton2.addActionListener(this);
		
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();
		
		//2.Setting Layouts:
		jPanel1.setLayout(new GridLayout(6,1));
		jPanel2.setLayout(new GridLayout(6,1));
		
		//3.Adding components:
		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel3);
		jPanel1.add(jLabel4);
		jPanel1.add(jLabel5);
		jPanel1.add(jLabel6);
		
		jPanel2.add(jtf1);
		jPanel2.add(jtf2);
		jPanel2.add(jtf3);
		jPanel2.add(jtf4);
		jPanel2.add(jtf5);
		jPanel2.add(jtf6);
		
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);
		
		this.add(jPanel1, BorderLayout.WEST);
		this.add(jPanel2, BorderLayout.CENTER);
		this.add(jPanel3, BorderLayout.SOUTH);
		
		this.setSize(800,600);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==jButton1){

			//getting the info
			String ID = jtf1.getText().trim();
			String Name = jtf2.getText().trim();
			String Sex = jtf3.getText().trim();
			int age = Integer.parseInt(jtf4.getText().trim());
			String JiGuan = jtf5.getText().trim();
			String Major = jtf6.getText().trim();
			
			//----------------------------------------//
			
			try {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//2.得到连接： 连接到哪个数�?��?
				ct = DriverManager.getConnection("jdbc:odbc:mytest");
				//3.Statement:
				ps = ct.prepareStatement("update stu set stuName=?, stuSex=?,stuAge=?, stuJg=?, stuDept=? where " +
						"stuID=?");
				
				
				ps.setString(1, jtf2.getText());
				ps.setString(2, jtf3.getText());
				ps.setString(3, jtf4.getText());
				ps.setString(4, jtf5.getText());
				ps.setString(5, jtf6.getText());
				ps.setString(6, jtf1.getText());

				
				ps.executeUpdate();
				this.dispose();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  finally {
				
				try {
					if(ps!=null) ps.close();
					if(ct!=null) ct.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//------------------------------------------//
		}
	}
}
