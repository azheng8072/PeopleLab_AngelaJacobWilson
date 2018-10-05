package AngelaJacobWilson;

public class Teacher extends Person{
    private String subject;
    private String title;

    public Teacher(String subject, String title, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }
    public String getSubject()
    {
        return this.subject;
    }
    public String toString()
    {
        return this.title + ". " + this.getFamilyName();
    }
}
