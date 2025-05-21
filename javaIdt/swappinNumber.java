
package javaIdt;

public class swappinNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 36;
        int b = 45;
        
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        
        swap(a,b);
    }
    
    public static void swap(int x, int y) {
        System.out.println("Before swapping (Inside the method), a = " + x + " b = " + y);
        
        int c = x;
        x = y;
        y = c;
        
        System.out.println("After swapping (Inside the method), a = " + x + " b = " + y);
    } 
    
}
