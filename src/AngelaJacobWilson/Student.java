package AngelaJacobWilson;

public class Student extends Person {
    private double gpa;
    private String major;
    private String School;

    public Student(double gpa, String major, String Scnool){
        super("Jacob","Cedar");
        this.gpa = gpa;
        this.major = major;
        this.School = School;
    }
    public double gpa(double gpa){
        return gpa;
    }
    public String major(String major){
        return major;
    }
    public String School(String school){
        return School;
    }
}
