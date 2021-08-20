/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.tasks;

/**
 *
 * @author wellington
 * @descrioption: Unit Program Task_3 was developed to recreate a Japaness classic game Rock Scissor Paper. 
 */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;







public class Task_3 extends JFrame implements ActionListener{



JLabel opc = new JLabel (" Rock, Scissor or Paper ");

JRadioButton Rock = new JRadioButton(" Rock ");
JRadioButton Paper = new JRadioButton(" Paper ");
JRadioButton Play = new JRadioButton(" Scissor ");

ButtonGroup grupo = new ButtonGroup();

JButton Playing = new JButton(" Play ");




Task_3 (){


setTitle(" Task_3 ");

setSize(300, 300);

setVisible(true);

setDefaultCloseOperation(EXIT_ON_CLOSE);

Container container = getContentPane();

container.setLayout(null);


// define the edges of window. Length of container and hight


opc.setBounds(20, 10, 200, 50);

container.add(opc);

Rock.setBounds(20, 50, 100, 50);

container.add(Rock);

Paper.setBounds(20, 90, 100, 50);

container.add(Paper);

Play.setBounds(20, 130, 100, 50);

container.add(Play);


Playing.setBounds(80, 200, 110, 40);



container.add(Playing);


grupo.add(Rock);

grupo.add(Paper);

grupo.add(Play);

Playing.addActionListener(this);

}



@Override



public void actionPerformed(ActionEvent e) {



// TODO Auto-generated method stub

if(e.getSource() == Playing){

int n = (int) (Math.random()* 3);

switch (n){

case 0: JOptionPane.showMessageDialog(null, " Rock");

break;

case 1: JOptionPane.showMessageDialog(null, " Paper ");

break;

case 2: JOptionPane.showMessageDialog(null, " Scissor ");


}

}

}



public static void main(String[] args) {



// TODO Auto-generated method stub

new Task_3 ( );

}

}
