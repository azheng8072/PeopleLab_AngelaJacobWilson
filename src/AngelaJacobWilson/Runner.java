package AngelaJacobWilson;

public class Runner {
    //intializes strings/doubles
    String teacher = "Mr. Folwell";
    static String firstName[] = {"Jacob", "Wilson","Angela", "SpaghettiOs", "Pilsbury"};
    static String familyName[] = {"Cedar", "Cho","Zheng", "Ramen", "Doughboy"};
    static double gpa[] = {95,90, 100, 97, 92};
    static String major[] = {"Software", "Electrical", "Aerospace","Media", "CP"};
    static String School[] = {"BKTech","Harvard","Stuy","RIT","MIT"};

    public static void main(String[] args){

        int num = (int)(Math.random() * 6);
        String Student = firstName[num] + " " + familyName[num] + " has gpa of " + gpa[num] +" has a major of " + major[num] + " and goes to" + School[num];


    }
}



