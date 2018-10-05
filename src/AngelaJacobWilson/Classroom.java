package AngelaJacobWilson;

public class Classroom {

    private Student[] students;
    private Teacher teacher;
    private String subject;
        public Classroom(Student[] students, Teacher teacher)
        {
            this.students = students;
            this.teacher = teacher;

        }
    public void getSubject(Teacher teacher)
    {
        return Teacher.getSubject();
    }

    public void classAverage(double gpa)
    {
        for (int i=0; i<students.length; i++)
        {
            gpa += gpa[i];
        }
        gpa = gpa/students.length;
    }

    public void printClass(Teacher teacher, Student[] students)
    {
        System.out.println(teacher.toString());
        System.out.println(teacher.getSubject());
        System.out.println(students);




    }

}
