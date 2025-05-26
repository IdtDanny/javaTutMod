
package javatutmod;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class carRent {
    
    JTextField user = new JTextField();
    JTextField pass = new JTextField();
    JFrame frame = new JFrame("Car Rental");
    JButton login = new JButton("Clear All");
    
    carRent() { 
        JLabel label1 = new JLabel("Username");
        JLabel label2 = new JLabel("Password");
        JButton submit = new JButton("Submit");
        
        
        label1.setBounds(50, 50, 200, 30);
        user.setBounds(50, 90, 200, 30);
        label2.setBounds(50, 130, 200, 30);
        pass.setBounds(50, 170, 200, 30);
        submit.setBounds(50, 220, 200, 30);
        login.setBounds(50, 270, 200, 30);
        
        submit.addActionListener(ActionEvent -> saveData());

        frame.add(login);
        frame.add(submit);
        frame.add(label1);
        frame.add(label2);
        frame.add(user);
        frame.add(pass);
        
        login.addActionListener(ActionEvent -> remove());
        
//        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void remove() {
        
        frame.remove(user);
        frame.setBackground(Color.yellow);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void saveData(){
        String username = user.getText().trim();
        String password = pass.getText().trim();
        
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Please fill the information");
        }
        
        else {
            // Database Connection & Data Saving
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDb", "root", "");
                 PreparedStatement pst = con.prepareStatement(
                         "INSERT INTO users (username, password) VALUES (?,?)")) {

                pst.setString(1, username);
                pst.setString(2, password);

                pst.executeUpdate();

                System.out.println("Information Saved");

                // Reset fields
                user.setText("");
                pass.setText("");

            } catch (SQLException ex) {
                System.out.println("Database Error! Failed");
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new carRent();
    }
    
}
