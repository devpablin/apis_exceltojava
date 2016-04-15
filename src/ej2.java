import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.RandomAccess;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ej2 extends JFrame implements ActionListener {
	JLabel lnom= new JLabel("Nombre:");
	JLabel lap= new JLabel("Apellidos:");
	JTextField nombox= new JTextField(10);
	JTextField apbox = new JTextField(10);
	JLabel lsueldo = new JLabel("Sueldo basico:");
	JTextField sueldobox = new JTextField(10);
	JLabel ltipo = new JLabel("Tipo de empleado:");
	JRadioButton rper= new JRadioButton("Permanente");
	JRadioButton rcon= new JRadioButton("Contrato");
	JLabel ldias= new JLabel("Dias Trabajados");
	JTextField diasbox = new JTextField(10);
	JCheckBox ch1 = new JCheckBox("Antiguedad(5-8) años");
	JCheckBox ch2 = new JCheckBox("Antiguedad(9-12) años");
	JCheckBox ch3 = new JCheckBox("Antiguedad(>12) años");
	JLabel ltot= new JLabel("Calculo sueldo neto");
	JTextField totbox= new JTextField(10);
	JLabel lbs = new JLabel("Bs.");
	JButton bl = new JButton("Calcular neto");
	JPanel miPanel = new JPanel();
	ButtonGroup radiog= new ButtonGroup();
	ButtonGroup checkg= new ButtonGroup();
	int x=1, y=1;
	public ej2(){
		super("sueldos");
		setSize(50, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout dis = new FlowLayout(FlowLayout.CENTER);
		miPanel.setLayout(dis);
		miPanel.add(lnom);
		miPanel.add(nombox);
		miPanel.add(lap);
		miPanel.add(apbox);
		miPanel.add(lsueldo);
		miPanel.add(sueldobox);
		miPanel.add(ltipo);
		radiog.add(rper);
		radiog.add(rcon);
		miPanel.add(rper);
		miPanel.add(rcon);
		miPanel.add(ldias);
		miPanel.add(diasbox);
		checkg.add(ch1);
		checkg.add(ch2);
		checkg.add(ch3);
		miPanel.add(ch1);
		miPanel.add(ch2);
		miPanel.add(ch3);
		miPanel.add(ltot);
		miPanel.add(totbox);
		miPanel.add(lbs);
		miPanel.add(bl);
		add(miPanel);
		pack();
		setVisible(true);
		totbox.setEditable(false);
		bl.addActionListener(this);
		rper.addItemListener(new RadioListener(1));
		rcon.addItemListener(new RadioListener(2));
		ch1.addItemListener(new CheckBoxListener());
		ch2.addItemListener(new CheckBoxListener());
		ch3.addItemListener(new CheckBoxListener());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stuff
		
		if (e.getSource()==bl) {
			double s=Double.parseDouble(sueldobox.getText());
			double d=Double.parseDouble(diasbox.getText());
			double total=0;
			switch (x) {
			case 1:
				total=(s*d)/20;
				break;
			case 2:
				total=(s*d)/24;
				break;
			
			}
			switch (y) {
			case 1:
				totbox.setText(""+total*1.05);
				break;
			case 2:
				totbox.setText(""+total*1.10);
				break;
			case 3:
				totbox.setText(""+total*1.15);
				break;
			default:
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		ej2 j = new ej2();
		
	}
	private class RadioListener implements ItemListener{
		int n;
		public RadioListener(int n){
			this.n=n;
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			x=n;
		}
	}
	private class CheckBoxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent evt) {
			// TODO Auto-generated method stub
			if (evt.getSource()==ch1) {
				y=1;
			}
			if (evt.getSource()==ch2) {
				y=2;
			}
			if (evt.getSource()==ch3) {
				y=3;
			}
			
		}
		
		
	}
}

