package AngelaJacobWilson;

import java.lang.reflect.Array;

public class Classroom {

    private Student[] students;
    private Teacher teacher;
    private String subject;
        public Classroom(Student[] students, Teacher teacher)
        {
            super("Classroom");
            this.students = students;
            this.teacher = teacher;

        }
    public void getSubject(Teacher teacher)
    {
        return teacher.getSubject();
    }

    public void classAverage()
    {
        double gpa = 0;
        for (int i=0; i<students.length; i++)
        {
            gpa += students[i].gpa;
        }
    }

}
