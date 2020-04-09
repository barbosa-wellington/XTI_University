import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameF extends JFrame implements ActionListener {

		JLabel c1 = new JLabel (" Lado 1:");

		JLabel c2 = new JLabel (" Lado 2:");

		JLabel c3 = new JLabel (" Lado 3:");

		//ImageIcon icon =

		//new ImageIcon(getClass().getResource("Fots/equilatero.png"));

		//ImageIcon icon2 =

		// new ImageIcon(getClass().getResource("Fots/escaleno.png"));

		//ImageIcon icon3 =

		// new ImageIcon(getClass().getResource("Fots/esoceles.png"));

		JPanel container = new JPanel();

		JTextField t1 = new JTextField();

		JTextField t2 = new JTextField();

		JTextField t3 = new JTextField();

		JButton b = new JButton(" Verificar Tipo");

		//JLabel img = new JLabel( icon );

		//JLabel img1 = new JLabel( icon2 );

		//JLabel img2 = new JLabel( icon3 );

		@Override

		public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		int a = Integer.parseInt(t1.getText());

		int be = Integer.parseInt(t2.getText());

		int c = Integer.parseInt(t3.getText());

		if(a == be && be == c ){

		JOptionPane.showMessageDialog(null, "É um Triangulo Equilatero");

		// JOptionPane.showMessageDialog(null, img );

		} if (a == be && be != c){

		JOptionPane.showMessageDialog(null, "É um Triangulo Isóceles");

		//JOptionPane.showMessageDialog(null, icon3);

		} if (a != be && be != c ){

		JOptionPane.showMessageDialog(null, "É um Triangulo Escaleno");

		//JOptionPane.showMessageDialog(null, icon2);

		}

		}

		GameF(){

		setTitle(" Exercicio 2");

		setSize(500 , 300);

		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = getContentPane();

		container.setLayout(null);

		c1.setBounds(10, 40, 50, 50);

		container.add(c1);

		t1.setBounds(70, 52, 90, 20);

		t1.setColumns(100);

		container.add(t1);

		c2.setBounds(10, 100, 50, 50);

		container.add(c2);

		t2.setBounds(70, 117, 90, 20);

		t2.setColumns(10);

		container.add(t2);

		c3.setBounds(10, 175, 50, 20);

		container.add(c3);

		t3.setBounds(70, 178, 90, 20 );

		container.add(t3);

		//Largura, altura,

		b.setBounds(300, 40, 120, 25);

		container.add(b);

		b.addActionListener(this);

		}
		
public static void main(String[] args) {

			// TODO Auto-generated method stub

			new GameF();

			}
}