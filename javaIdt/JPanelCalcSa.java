
package javaIdt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelCalcSa {

    {
        JFrame calc = new JFrame("Sample Calc: ");
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        field1.setSize(100, 30);
        JButton btn1 = new JButton("Add");
        
        JPanel panel = new JPanel();
        panel.setBounds(20, 50, 200, 200);

        JLabel label1 = new JLabel("Num1: ");
        JLabel label2 = new JLabel("Num2: ");
        
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(btn1);
        
        calc.setSize(500, 500);
        calc.add(panel);
        calc.setLayout(null);
        calc.setVisible(true);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new JPanelCalcSa();
    }
    
}
