import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mymenu implements ActionListener{
	
	JFrame f=new JFrame();
	JTextField tf1;
	JTextField tf2;
	JPasswordField pf;
	JButton b1;
	private int amount;
	public mymenu(){
		
		JLabel l1=new JLabel("username : ");
		l1.setBounds(20,20,100,30);
		JLabel l2=new JLabel("Password : ");
		l2.setBounds(20,70,100,30);
		JLabel l3=new JLabel("Email ID : ");
		l3.setBounds(20,130,100,30);
		tf1=new JTextField();
		tf1.setBounds(130,20,200,30);
		pf=new JPasswordField();
		pf.setBounds(130,70,200,30);
		tf2=new JTextField();
		tf2.setBounds(130,130,200,30);
		b1 = new JButton("Submit");
		b1.setBounds(100,200,100,30);
		JButton b2 = new JButton("Reset");
		b2.setBounds(250,200,100,30);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(tf1);
		f.add(tf2);
		f.add(pf);
		f.add(b1);
		f.add(b2);
		f.setLayout(null);
		f.setSize(600,400);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed(ActionEvent e){
	if(e.getSource().equals(b1)){
	String username=tf1.getText();
	char password[]=pf.getPassword();
	String email=tf2.getText();
	if(username.isEmpty() || String.valueOf(password).isEmpty() || 	email.isEmpty()){
	JOptionPane.showMessageDialog(null,"Fill all the details");
	tf1.setText("");
	tf2.setText("");
	pf.setText("");
	
	}
	else{
	JOptionPane.showMessageDialog(null,"Registration Successfull");

	menubox();
		}
	}
	else{
	JOptionPane.showMessageDialog(null,"Values will reset when you 	click ok!!");
	tf1.setText("");
	tf2.setText("");
	pf.setText("");
	
	}
}
public void menubox(){
	amount=0;
	String[] list={"0","1","2","3","4","5"};
	f.getContentPane().removeAll();
    	//f.revalidate();
   	f.repaint();
	JLabel sl=new JLabel("Select Items");
	sl.setBounds(15,20,100,30);
	f.add(sl);
	JLabel l1=new JLabel("30/1");
	JLabel l2=new JLabel("35/1");
	JLabel l3=new JLabel("50/1");
	JLabel l4=new JLabel("20/2");
	JLabel l5=new JLabel("20/2");
	JLabel pl=new JLabel("Price");
	pl.setBounds(360,20,100,30);
	f.add(pl);
	l1.setBounds(360,70,100,30);
	l2.setBounds(360,110,100,30);
	l3.setBounds(360,150,100,30);
	l4.setBounds(360,190,100,30);
	l5.setBounds(360,230,100,30);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(l5);
	
	JCheckBox cb1=new JCheckBox("PlainDosa");
	cb1.setBounds(20,70,100,30);
	f.add(cb1);
	cb1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	
	JComboBox<String> cb11=new JComboBox<>(list);
	cb11.setBounds(140,70,200,30);
	f.add(cb11);
	f.setVisible(true);
	cb11.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	String n=cb11.getSelectedItem().toString();
	int num=Integer.parseInt(n);
	amount+=(num*30);
		}
	});
	

	}
	});
	JCheckBox cb2=new JCheckBox("OnionDosa");
	cb2.setBounds(20,110,100,30);
	f.add(cb2);
	cb2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	JComboBox<String> cb22=new JComboBox<>(list);
	cb22.setBounds(140,110,200,30);
	f.add(cb22);
	f.setVisible(true);
	cb22.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	String n=cb22.getSelectedItem().toString();
	int num=Integer.parseInt(n);
	amount+=(num*35);
	}});
	}
	});
	JCheckBox cb3=new JCheckBox("EggDosa");
	cb3.setBounds(20,150,100,30);
	f.add(cb3);
	cb3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	
	JComboBox<String> cb33=new JComboBox<>(list);
	cb33.setBounds(140,150,200,30);
	f.add(cb33);
	f.setVisible(true);
	cb33.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	String n=cb33.getSelectedItem().toString();
	int num=Integer.parseInt(n);
	amount+=(num*50);
	}});
	}
	});
	JCheckBox cb4=new JCheckBox("Vada");
	cb4.setBounds(20,190,100,30);
	f.add(cb4);
	cb4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	
	JComboBox<String> cb44=new JComboBox<>(list);
	cb44.setBounds(140,190,200,30);
	f.add(cb44);
	f.setVisible(true);
	cb44.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	String n=cb44.getSelectedItem().toString();
	int num=Integer.parseInt(n);
	amount+=(num*20);
	}});
	}
	});
	JCheckBox cb5=new JCheckBox("Idli");
	cb5.setBounds(20,230,100,30);
	f.add(cb5);
	cb5.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	
	JComboBox<String> cb55=new JComboBox<>(list);
	cb55.setBounds(140,230,200,30);
	f.add(cb55);
	f.setVisible(true);
	cb55.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	String n=cb55.getSelectedItem().toString();
	int num=Integer.parseInt(n);
	amount+=(num*20);
	}});
	}
	});
	

	
	JButton pb=new JButton("Place Order");
	pb.setBounds(160,280,150,30);
	f.add(pb);
	pb.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	
		JOptionPane.showMessageDialog(null,"Order Confirmed, Click ok to see Total amount");
		
		JTextField tf=new JTextField();
		
		tf.setBounds(160,330,150,30);

                String result=String.valueOf(amount);
		tf.setText("Total amount : "+result);
		f.add(tf);
		
                amount=0;
              
		}
	});
	f.setLayout(null);
	f.setVisible(true);

}

public static void main(String[] args){
	new mymenu();
	}
}