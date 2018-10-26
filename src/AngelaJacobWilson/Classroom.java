package AngelaJacobWilson;

public class Classroom {

    private Student[] students;
    private Teacher teacher;
    private String subject;
        public Classroom(Student[] students, Teacher teacher)
        {
            this.students = students;
            this.teacher = teacher;
            fillSeats();

        }
    public String getSubject(Teacher teacher)
    {
        return teacher.getSubject();
    }

    public void classAverage(double gpa2, double[]gpa)
    {
        for (int i=0; i<students.length; i++)
        {
            gpa2 += gpa[i];
        }
        gpa2 = gpa2/students.length;
    }

    public void printClass(Teacher teacher, Student[] students)
    {
        System.out.println(teacher.toString());
        System.out.println(teacher.getSubject());
        System.out.println(students);
    }
    public void fillSeats()
    {
        int row = 0;
        int seats = 6;
        for(int n=0; n<students.length; n++)
        {
            if(seats == 0)
            {
                row = row +1;
                System.out.println("There is now " + row + " full row.");
                seats = 6;

            }
            else
            {
                seats--;
            }
            System.out.println(students[n] + " sits at row " + row + " seat " + seats + ".");
        }
    }

}
