
package javatutmod;

public class teacher extends person {
    private String subject;
    
    public teacher(String name, int age, String subject) {
        super(name,age);
        this.subject = subject;
    }
    
    public String getSubject() {
        return subject;
    }
}
