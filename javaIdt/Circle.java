package javaIdt;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        return radius * radius * 3.14;
    }
}
