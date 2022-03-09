package baddiPackage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class MaFenetre extends JFrame implements ActionListener{
	
	JLabel jL1=new JLabel("Nom:");
	JTextField jT1= new JTextField(14);
	JButton jB1= new JButton("Add");
	JButton jB2= new JButton("Supp");
	List liste1=new List();
	List liste2= new List();
	public MaFenetre() {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JPanel jP1= new JPanel();
		jP1.setLayout(new FlowLayout());
		jP1.add(jL1);jP1.add(jT1);jP1.add(jB1);jP1.add(jB2);
		this.add(jP1,BorderLayout.NORTH);
		JPanel jP2= new JPanel();
		jP2.setLayout(new GridLayout());
		jP2.add(liste1);
		jP2.add(liste2);
		jB1.addActionListener(this);
		jB2.addActionListener(this);
		this.add(jP2, BorderLayout.CENTER);
		this.setBounds(10,10,500,500);
		//Pour avoir la taille d'ecran
		//this.setSize(ToolKit.getDefaultToolKit().getScreenSize());
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jB1) {
			String s=jT1.getText();
			liste1.add(s);
		}
		else if(e.getSource()==jB2) {
			int num=liste1.getSelectedIndex();
			liste1.remove(num);
		}
	}
	public static void main(String args[]) {
			MaFenetre maFenetre= new MaFenetre();
		}
	
}
