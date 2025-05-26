
package javatutmod;

public class student extends person {
    private String rollnb;
    
    public student(String name, int age, String rollnb) {
        super(name,age);
        this.rollnb = rollnb;
    }
    
    public String getRollnb() {
        return rollnb;
    }
}
