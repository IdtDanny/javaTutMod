
package javaIdt;

import javax.swing.*;

public class buttonSwingEx {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame2 = new JFrame("Swing Example");
        
        JButton btn = new JButton("Click Me");
        
        btn.setBounds(50, 50, 100, 30);
        
        frame2.add(btn);

        frame2.setSize(300, 300);
        
        frame2.setLayout(null);
        
        frame2. setVisible(true);
        
    }
    
}
