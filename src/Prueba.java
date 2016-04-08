import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prueba extends JFrame implements ActionListener {
	JLabel lb1= new JLabel("Numero 1:");
	JLabel lb2= new JLabel("Numero 2:");
	JTextField caja1= new JTextField(10);
	JLabel lb3 = new JLabel("Resultado:");
	JTextField caja2 = new JTextField(10);
	JTextField caja3 = new JTextField(10);
	JButton bs = new JButton("+");
	JButton br = new JButton("-");
	JButton bp = new JButton("X");
	JButton bd = new JButton("/");
	JButton bi = new JButton("CLS");
	JButton bl = new JButton("EXIT");
	public Prueba(){
		super("calculadora");
		setSize(50, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		add(lb1);add(caja1);add(bs);add(br);
		add(lb2);add(caja2);add(bp);add(bd);
		add(lb3);add(caja3);add(bi);add(bl);
		pack();
		setVisible(true);
		
		bs.addActionListener(this);
		br.addActionListener(this);
		bp.addActionListener(this);
		bd.addActionListener(this);
		bi.addActionListener(this);
		bl.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stuff
		
		if (e.getSource()==bs) {
			double n1= Integer.parseInt(caja1.getText());
			double n2= Integer.parseInt(caja2.getText());
			double r=n1+n2;
			caja3.setText(r+"");
		}
		if (e.getSource()==br) {
			double n1= Integer.parseInt(caja1.getText());
			double n2= Integer.parseInt(caja2.getText());
			double r=n1-n2;
			caja3.setText(r+"");
		}
		if (e.getSource()==bp) {
			double n1= Integer.parseInt(caja1.getText());
			double n2= Integer.parseInt(caja2.getText());
			double r=n1*n2;
			caja3.setText(r+"");
		}
		if (e.getSource()==bd) {
			double n1= Integer.parseInt(caja1.getText());
			double n2= Integer.parseInt(caja2.getText());
			double r=n1/n2;
			caja3.setText(r+"");
		}
		if (e.getSource()==bi) {
			caja1.setText("");
			caja2.setText("");
			caja3.setText("");
		}
		if (e.getSource()==bl) {
			dispose();
		}
		
		
	}
	
}

