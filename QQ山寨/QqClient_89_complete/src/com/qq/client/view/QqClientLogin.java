package com.qq.client.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class QqClientLogin extends JFrame{

	//定义北部需要的组件
	JLabel jlb1 = null;
	
	//定义中部需要的组件----中间有3个JPanel， 有一个叫选项卡的窗口进行管理
	JTabbedPane jtp = null;
	JPanel jp2, jp3, jp4;
	
	JLabel jp2_jlb1, jp2_jlb2, jp2_jlb3, jp2_jlb4;
	JButton jp2_jb1;
	JTextField jp2_jtf;
	JPasswordField jp2_jpf;
	JCheckBox jp2_jcb1, jp2_jcb2;
	
	//定义南部需要的组件
	JPanel jp1;
	JButton jp1_jb1, jp1_jb2, jp1_jb3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqClientLogin qqClientLogin = new QqClientLogin();
	}
	
	public QqClientLogin(){
		
		//处理北边
		jlb1 = new JLabel(new ImageIcon("image/tou.gif"));
		
		//处理中部
		jp2 = new JPanel(new GridLayout(3,3));
		
		jp2_jlb1 = new JLabel("QQ号码", JLabel.CENTER);
		jp2_jlb2 = new JLabel("QQ密码", JLabel.CENTER);
		jp2_jlb3 = new JLabel("忘记密码", JLabel.CENTER);
		jp2_jlb3.setForeground(Color.blue);
		jp2_jlb4 = new JLabel("申请密码保护", JLabel.CENTER);
		
		jp2_jb1 = new JButton(new ImageIcon(""));   //XXX
		jp2_jtf = new JTextField();
		jp2_jpf = new JPasswordField();
		jp2_jcb1 = new JCheckBox("隐身登陆");
		jp2_jcb2 = new JCheckBox("记住密码");

		jp2.add(jp2_jlb1);
		jp2.add(jp2_jtf);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jlb2);
		jp2.add(jp2_jpf);
		jp2.add(jp2_jlb3);
		jp2.add(jp2_jcb1);
		jp2.add(jp2_jcb2);
		jp2.add(jp2_jlb4);
				//创建选项卡窗口
		jtp = new JTabbedPane();
		jtp.add("QQ号码", jp2);
		jp3 = new JPanel();
		jtp.add("手机号码", jp3);
		jp4 = new JPanel();
		jtp.add("电子邮件", jp4);

		//处理南边
		jp1 = new JPanel();
		jp1_jb1 = new JButton("登陆");
		jp1_jb2 = new JButton("取消");
		jp1_jb3 = new JButton("向导");
		
		
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);

		
		this.add(jlb1, "North");
		this.add(jtp, "Center");
		//吧Jpanel放到南部
		this.add(jp1, "South");
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
