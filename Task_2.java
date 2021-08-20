/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.tasks;

/**
 *
 * @author wellington
 * @descrioption: Unit Program Task_2 was developed to recreate a Identity of your weigh in different planets
 * of our sola system.
 */
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;




public class Task_2 extends JFrame implements ActionListener {


// Botto to allow us to do the maths.

JButton b = new JButton(" Calculate the weigh ");
JTextField t1 = new JTextField();
// Legenda
JLabel a = new JLabel(" weigh in the Earth (Kg):");
JLabel c = new JLabel(" Select the Planet: ");
// JRadioButton com o nome dos Planetas



JRadioButton ma = new JRadioButton (" Mars");
JRadioButton v = new JRadioButton (" Venus");
JRadioButton me = new JRadioButton (" Mercury");
JRadioButton s = new JRadioButton (" Saturn");
JRadioButton j = new JRadioButton (" Jupiter");
JRadioButton u = new JRadioButton (" Uranus");


@Override



public void actionPerformed(ActionEvent e) {

if(e.getSource() == b){

if(ma.isSelected()){

int r1 = Integer.parseInt(t1.getText());
float result = 0;
result = (float) ((r1 *0.38 )/ 10) ;

JOptionPane.showMessageDialog(null, " Your weigh in Mars will be : " + result + " kg" );

} }


if (v.isSelected()){

int r1 = Integer.parseInt(t1.getText());
float result = 0;
result = (float) ((r1 * 0.88) /10) ;

JOptionPane.showMessageDialog(null, " Your weigh in Venus will be : " + result + " kg" );

}

if (me.isSelected()){
int r1 = Integer.parseInt(t1.getText());
float result = 0;
result = (float) ((r1 * 0.37 )/ 10) ;

JOptionPane.showMessageDialog(null, " Your weigh in Mercury will be: " + result + " kg");

}

if (s.isSelected()){
int r1 = Integer.parseInt(t1.getText());
float result = 0;
result = (float) ((r1 * 1.15)/ 10) ;

JOptionPane.showMessageDialog(null, " Your weigh in Saturn will be: " + result + " kg");


}
if (j.isSelected()){

    int r1 = Integer.parseInt(t1.getText());
    float result = 0;

    result = (float) ((r1 * 2.64)/10) ;
    JOptionPane.showMessageDialog(null, " Your weigh in Jupiter will be : " + result + " kg" );

}



if (u.isSelected()){

int r1 = Integer.parseInt(t1.getText());
float result = 0;
result = (float) ((r1 / 10) * 1.17) ;
JOptionPane.showMessageDialog(null, " Your weigh in Uranus will be: " + result + " kg" );

}
}





Task_2 (){

setTitle(" Task_2");
setSize(500, 300);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);

Container container = getContentPane();
container.setLayout(null);

a.setBounds(40 , 20, 159, 20);
container.add(a);

t1.setBounds(40, 70, 150, 25);
container.add(t1);

//weigh and high
b.setBounds(290, 70, 150, 25);
b.addActionListener(null);

container.add(b);
c.setBounds(40, 110, 159, 20);

container.add(c);
ma.setBounds(30, 150, 100, 20);
container.add(ma);

me.setBounds(170, 150, 100, 20);
container.add(me);
s.setBounds(300, 150, 100, 20);
container.add(s);

v.setBounds(30, 200, 100, 20);
container.add(v);
j.setBounds(170, 200, 100, 20);
container.add(j);
u.setBounds(300, 200, 100, 20);
container.add(u);

// Rule to select one option
ButtonGroup grupo = new ButtonGroup();
grupo.add(u);
grupo.add(j);
grupo.add(v);
grupo.add(s);
grupo.add(ma);
grupo.add(me);

b.addActionListener(this);
}





public static void main(String[] args) {

// TODO Auto-generated method stub

new Task_2 ();
}

}
