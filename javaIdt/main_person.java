
package javaIdt;

public class main_person {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Student student_1 = new Student("Danny", 23, 250);
        Teacher teacher_1 = new Teacher("Josbert", 40, "OOP JAVA");
        
        System.out.println("Name: " + student_1.getName());
        System.out.println("Age: " + student_1.getAge());
        System.out.println("Roll Number: " + student_1.getRollNumber());
        
        System.out.println("\nName: " + teacher_1.getName());
        System.out.println("Age: " + teacher_1.getAge());
        System.out.println("Subject: " + teacher_1.getSubject());
    }
    
}
