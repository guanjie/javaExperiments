package studentSystemModel2;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * For adding a student
 */
public class StuAddDialog extends JDialog implements ActionListener{

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
	public StuAddDialog(JFrame owner, String title, boolean modal ){
		
		super(owner, title, modal);
		
		//1.New the components:
		jLabel1 = new JLabel("ID");
		jLabel2 = new JLabel("Name");
		jLabel3 = new JLabel("Sex");
		jLabel4 = new JLabel("Age");
		jLabel5 = new JLabel("JiGuan");
		jLabel6 = new JLabel("Major");

		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();
		jtf5 = new JTextField();
		jtf6 = new JTextField();
		
		jButton1 = new JButton("add");
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
		
		if(arg0.getSource()==jButton1){
			
//			StuModel temp = new StuModel();
			String sql = "insert into stu values(?,?,?,?,?,?)";
			String[] paras = {jtf1.getText(),jtf2.getText(),jtf3.getText(),jtf4.getText(),jtf5.getText(),jtf6.getText()};
			if(!StuModel.updateStu(sql, paras)){
				JOptionPane.showMessageDialog(this, "error");
			}
			
			//Close the window
			this.dispose();
		}
	}
}
