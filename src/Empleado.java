import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Empleado extends JFrame implements ActionListener{
	JLabel tit= new JLabel("CALCULO DE HORAS TRABAJADAS");
	JLabel stit= new JLabel("SEMANAL");
	JLabel dat= new JLabel("Datos de entrada:");
	JLabel lbci= new JLabel("CI:");
	JTextField cibox= new JTextField(10);
	JLabel lbhr= new JLabel("Hrs. Trabajadas:");
	JTextField hrbox= new JTextField(10);
	JLabel lbnom= new JLabel("Nombre:");
	JTextField nombox= new JTextField(10);
	JLabel lbtar= new JLabel("Tarifa Hora:");
	JTextField tarbox= new JTextField(10);
	JLabel lbdat = new JLabel("DATOS DE SALIDA");
	JLabel lbtot= new JLabel("Total ganado:");
	JTextField totbox= new JTextField(10);
	JLabel lbdesc= new JLabel("descuentos:");
	JTextField descbox= new JTextField(10);
	JLabel lbneto= new JLabel("Pago Neto:");
	JTextField netobox= new JTextField(10);
	JButton bs = new JButton("CALCULAR");
	JButton br = new JButton("LIMPIAR");
	JButton bp = new JButton("SALIR");
	public Empleado(){
		super("Pagos por las horas trabajadas");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		tit.setBounds(160, 10, 300, 20);
		add(tit);
		stit.setBounds(220, 30, 100, 20);
		add(stit);
		setVisible(true);
		dat.setBounds(20, 50, 250, 20);
		add(dat);
		lbci.setBounds(20, 70, 20, 20);
		add(lbci);
		cibox.setBounds(45, 70, 120, 20);
		add(cibox);
		lbhr.setBounds(260, 70, 80, 20);
		add(lbhr);
		hrbox.setBounds(345, 70, 120, 20);
		add(hrbox);
		lbnom.setBounds(20, 100, 50, 20);
		add(lbnom);
		nombox.setBounds(75, 100, 120, 20);
		add(nombox);
		lbtar.setBounds(260, 100, 80, 20);
		add(lbtar);
		tarbox.setBounds(345, 100, 120, 20);
		add(tarbox);
		lbdat.setBounds(20, 150, 200, 30);
		add(lbdat);
		lbtot.setBounds(90,200,80,20);
		add(lbtot);
		totbox.setBounds(175, 200, 80, 20);
		totbox.setEditable(false);
		add(totbox);
		lbdesc.setBounds(90,230,80,20);
		add(lbdesc);
		descbox.setBounds(175, 230, 80, 20);
		descbox.setEditable(false);
		add(descbox);
		lbneto.setBounds(90,260,80,20);
		add(lbneto);
		netobox.setBounds(175, 260, 80, 20);
		netobox.setEditable(false);
		add(netobox);
		bs.setBounds(70, 300, 100, 30);
		br.setBounds(200, 300, 100, 30);
		bp.setBounds(300, 300, 100, 30);
		add(bs);
		add(bp);
		add(br);
		bs.addActionListener(this);
		br.addActionListener(this);
		bp.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==bs) {
			double hr=Double.parseDouble(hrbox.getText());
			double tar=Double.parseDouble(tarbox.getText());
			double tot=hr*tar;
			totbox.setText(tot+"");
			descbox.setText(tot*0.1+"");
			netobox.setText(tot*0.9+"");
		}
		if (e.getSource()==br) {
			totbox.setText("");
			descbox.setText("");
			netobox.setText("");
			cibox.setText("");
			nombox.setText("");
			hrbox.setText("");
			tarbox.setText("");
		}
		if (e.getSource()==bp) {
			dispose();
		}
		
	}
	public static void main(String[] args) {
		Empleado o= new Empleado();
	}
	
	
}
