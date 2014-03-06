package com.qq.client.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * 我的好友列表(包括陌生人和黑名单)
 */
public class QqFriendList extends JFrame implements ActionListener, MouseListener{

	//处理第一张卡片
	JPanel jphy1, jphy2, jphy3;
	JButton jphy_jb1, jphy_jb2, jphy_jb3;
	JScrollPane jsp1 = null;
	//处理第二张卡片
	JPanel jpmsr1, jpmsr2, jpmsr3;
	JButton jpmsr_jb1, jpmsr_jb2, jpmsr_jb3;
	JScrollPane jsp2 = null;

	//把整个JFrame设置成一个cardlayout布局
	CardLayout cl = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqFriendList qqList = new QqFriendList();
	}

	public QqFriendList(){
		
		//处理第一张卡片，显示好友列表
		jphy1 = new JPanel(new BorderLayout());
		jphy_jb1 = new JButton("我的好友");
		jphy_jb2 = new JButton("陌生人");
		jphy_jb2.addActionListener(this);
		jphy_jb3 = new JButton("黑名单");
		
		//初始化50个好友
		JLabel[] jlbs = new JLabel[50];		
		//假定好友有50个。
		jphy2 = new JPanel(new GridLayout(50, 1, 4, 4));
		for(int i = 0; i < jlbs.length; i++){
			jlbs[i] = new JLabel(i+1+"", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
			//进行每一个label进行监听，当鼠标在上面的时候可以完成高亮效果
			jlbs[i].addMouseListener(this);
			jphy2.add(jlbs[i]);
		}
		jsp1 = new JScrollPane(jphy2);

		//2行一列的最后
		jphy3 = new JPanel(new GridLayout(2, 1));
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);
		
		//收官，放进去
		jphy1.add(jphy_jb1,"North");
		jphy1.add(jsp1, "Center");
		jphy1.add(jphy3, "South");
		
		/*********************************************************/
		
		//处理第二张卡片，显示好友列表
		jpmsr1 = new JPanel(new BorderLayout());
		jpmsr_jb1 = new JButton("我的好友");
		jpmsr_jb1.addActionListener(this);
		jpmsr_jb2 = new JButton("陌生人");
		jpmsr_jb3 = new JButton("黑名单");
			
		//初始化20个陌生人
		JLabel[] jlbs2 = new JLabel[20];		
		//假定陌生人有20个。
		jpmsr2 = new JPanel(new GridLayout(20, 1, 4, 4));
		for(int i = 0; i < jlbs2.length; i++){
			jlbs2[i] = new JLabel(i+1+"", new ImageIcon("image/moshengren.jpg"), JLabel.LEFT);
			//进行每一个label的监听，当鼠标在上面的时候可以完成高亮效果
			jlbs2[i].addMouseListener(this);
			jpmsr2.add(jlbs2[i]);
		}
		jsp2 = new JScrollPane(jpmsr2);
		
		//2行一列的最后
		jpmsr3 = new JPanel(new GridLayout(2, 1));
		jpmsr3.add(jpmsr_jb1);
		jpmsr3.add(jpmsr_jb2);
		
		//收官，放进去
		jpmsr1.add(jpmsr3,"North");
		jpmsr1.add(jsp2, "Center");
		jpmsr1.add(jpmsr_jb3, "South");
		
		/******************************************************/
		
		cl = new CardLayout();
		this.setLayout(cl);
		this.add(jphy1, "1");
		this.add(jpmsr1, "2");
		
		this.setTitle("Eric's QQ");
		this.setSize(300,800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	
	public void actionPerformed(ActionEvent arg0) {

		if(arg0.getSource()==jphy_jb2){//如果点击了陌生人按钮，就显示第二张卡片
			cl.show(this.getContentPane(), "2");    //XXX 这东西肯定是靠记得了.
		}
		
		else if(arg0.getSource()==jpmsr_jb1){
			cl.show(this.getContentPane(), "1");
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//响应用户双击的事件并得到好友的编号。
		if(arg0.getClickCount()==2){
			
			//得到该好友的编号。
			String friendNo = ((JLabel)arg0.getSource()).getText();
			System.out.println("你希望和这个人聊天： "+ friendNo);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JLabel jl = (JLabel)arg0.getSource();
		jl.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JLabel jl = (JLabel)arg0.getSource();
		jl.setForeground(Color.black);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
