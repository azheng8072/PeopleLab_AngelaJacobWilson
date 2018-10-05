package AngelaJacobWilson;
//Creates student class
public class Student extends Person {
    private double gpa;
    private String major;
    private String School;
    //associates gpa major and school with student
    public Student(double gpa, String major, String Scnool){
        super("Jacob","Cedar");
        this.gpa = gpa;
        this.major = major;
        this.School = School;
    }
    //getters for the students attributes
    public double getGpa(double gpa){
        return gpa;
    }
    public String getMajor(String major){
        return major;
    }
    public String getSchool(String school){
        return School;
    }
    //setters for the students attributes
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setSchool(String School){
        this.School = School;
    }
}
