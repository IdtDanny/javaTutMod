
package javaIdt;
import java.awt.*;

public class buttonAwtEx {

    public static void main(String[] args) {
        // TODO code application logic here
        Frame frame1 = new Frame("Example of Button");
        
        Button btn = new Button("Click Me");
        
        btn.setBounds(100,100,80,30); // make the button component (x, y, width, length)
        
        frame1.add(btn); // add button component to the frame
        
        frame1.setSize(400,400); // Set size of the frame
        
        frame1.setLayout(null); // using no layout managers
        
        frame1.setVisible(true);
    }
    
}
