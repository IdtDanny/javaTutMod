
package javaIdt;

import javax.swing.*;
import java.awt.Color; // to work of background colors ...
import java.awt.event.*;

public class JpanelEx {

    public static void main(String[] args) {
        
        JFrame frame_panel = new JFrame("JPanel Example");
        JPanel inner_panel = new JPanel();
        
        JTextField field = new JTextField();
        
        field.setBounds(30, 100, 170, 30);
        
        inner_panel.setBounds(20, 50, 200, 300);
        inner_panel.setBackground(Color.CYAN);
        
        JButton btn1 = new JButton("Btn1");
        JButton btn2 = new JButton("Btn2");
        
        btn1.setBounds(30, 60, 80, 30);
        btn2.setBounds(120, 60, 80, 30);
        
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        
        frame_panel.add(btn1);
        frame_panel.add(btn2);
        frame_panel.add(field);
        frame_panel.add(inner_panel);
        
        frame_panel.setSize(500,500);
        frame_panel.setLayout(null);
        frame_panel.setVisible(true);
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText("Button 1");
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText("Button 2");
            }
        });
    }
    
}
