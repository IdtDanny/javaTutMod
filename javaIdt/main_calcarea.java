
package javaIdt;

public class main_calcarea {

    public static void main(String[] args) {
        Triangle tria = new Triangle(7.0,7.0);
        Circle circ = new Circle(7.0);

        
        System.out.println("The area of triange is " + tria.calculateArea());
        System.out.println("The area of triange is " + circ.calculateArea());
    }
}
