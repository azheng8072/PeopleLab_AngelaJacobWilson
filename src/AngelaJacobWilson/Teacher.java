package AngelaJacobWilson;

public class Teacher extends Person{
// created strings for subject and title
    private String subject;
    private String title;
// created constructor and super
    public Teacher(String subject, String title, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }
//returns subject based on what was given
    public String getSubject()
    {
        return this.subject;
    }
//returns the name of the person in formal form ie: input CS, Mr, Nathan Folwell -> CS Mr. Folwell
    public String toString()
    {
        return this.title + ". " + this.getFamilyName();
    }
}
