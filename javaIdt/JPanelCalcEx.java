
package javaIdt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelCalcEx {

    {
        JFrame calc = new JFrame("Simple Calculator");
        JPanel keys = new JPanel();
        JPanel signs = new JPanel();
        
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton mul = new JButton("x");
        JButton eq = new JButton("=");
        
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        
        field1.setBounds(20, 50, 70, 30);
        field2.setBounds(100, 50, 70, 30);
        field3.setBounds(200, 50, 70, 30);
        field4.setBounds(290, 50, 70, 30);
        
        // first row
        btn1.setSize(20,20);
        btn2.setSize(20,20);
        btn3.setSize(20,20);
        btn4.setSize(20,20);
        btn5.setSize(20,20);
        btn6.setSize(20,20);
        btn7.setSize(20,20);
        btn8.setSize(20,20);
        btn9.setSize(20,20);
        
        keys.setBounds(20, 100, 150, 150);
        keys.setBackground(Color.GREEN);
        
        keys.add(btn1);
        keys.add(btn2);
        keys.add(btn3);
        keys.add(btn4);
        keys.add(btn5);
        keys.add(btn6);
        keys.add(btn7);
        keys.add(btn8);
        keys.add(btn9);
        keys.add(btn0);
        
        signs.setBounds(200, 100, 80, 180);
        signs.setBackground(Color.GREEN);
        
        signs.add(plus);
        signs.add(minus);
        signs.add(divide);
        signs.add(mul);
        signs.add(eq);
        
        btn1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
           } 
        });
        
        calc.add(keys);
        calc.add(signs);
        calc.add(field1);
        calc.add(field2);
        calc.add(field3);
        calc.add(field4);
        calc.setSize(700, 700);
        calc.setLayout(null);
        calc.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new JPanelCalcEx();
    }
    
}
