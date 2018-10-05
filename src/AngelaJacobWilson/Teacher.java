package AngelaJacobWilson;

// Below defines the strings for the subject the teacher teaches and the title of the teacher
public class Teacher extends Person{
    private String subject;
    private String title;
    
 //Below specifies from the array the name of the teacher, the subject the teacher is teaching and the title the teacher goes by
    public Teacher(String subject, String title, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }
 //returns the subject
    public getSubject()
    {
        return this.subject;
    }
 //returns teahcers name in the form of "title. familyName"
    public toString()
    {
        return this.title + ". " + this.getFamilyName();
    }
}
