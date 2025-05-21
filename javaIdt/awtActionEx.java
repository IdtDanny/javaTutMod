
package javaIdt;

import java.awt.*;
import java.awt.event.*;

public class awtActionEx {

    public static void main(String[] args) {

        Frame frame1 = new Frame();
        
        TextField field = new TextField();
        
        Button btn = new Button("Click Me");
        
        field.setBounds(50, 50, 200, 20);
        
        btn.setBounds(50, 100, 100, 30);
        
        frame1.add(field);
        
        frame1.add(btn);
        
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                field.setText("Hello there");
            }
        });
        
        frame1.setSize(400, 400);
        
        frame1.setLayout(null);
        
        frame1.setVisible(true);
    }
    
}
