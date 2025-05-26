
package javatutmod;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testDb {
    
    JTextField user = new JTextField();
    JTextField pass = new JTextField();
    JFrame frame = new JFrame("Car Rental");
    JButton btn1 = new JButton("Login");
    JButton btn2 = new JButton("Register");
    
    testDb() { 
        
        btn1.setBounds(50, 70, 100, 30);
        btn2.setBounds(170, 70, 100, 30);

        frame.add(btn1);
        frame.add(btn2);
        
        btn1.addActionListener(ActionEvent -> login());
        
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void login() {
        
        frame.remove(btn1);
        frame.remove(btn2);
        frame.setBackground(Color.yellow);
        
        JLabel label1 = new JLabel("Username");
        JLabel label2 = new JLabel("Password");
        JButton submit = new JButton("Submit");
        
        
        label1.setBounds(50, 50, 200, 30);
        user.setBounds(50, 90, 200, 30);
        label2.setBounds(50, 130, 200, 30);
        pass.setBounds(50, 170, 200, 30);
        submit.setBounds(50, 220, 200, 30);
//        btn1.setBounds(50, 270, 200, 30);
        
        submit.addActionListener(ActionEvent -> saveData());

//        frame.add(btn1);
        frame.add(submit);
        frame.add(label1);
        frame.add(label2);
        frame.add(user);
        frame.add(pass);
        
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
        new testDb();
    }
    
}