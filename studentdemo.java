import java.util.Scanner;

interface Academic{
    void storeAcademicDetails();
    void displayAcademicDetails();

}

interface Sports{
    void storeSportsDetails();
    void displaySportsDetails();
}

class Student implements Academic,Sports {
    String name;
    int rollNo;
    float percentage;
     String sportsName;

    Scanner sc = new Scanner(System.in);

    // Store Academic Details
    public void storeAcademicDetails(){
        System.out.print("Enter Student Name:");
        name = sc.nextLine();

        System.out.print("Enter Roll no:");
        rollNo = sc.nextInt();

        System.out.print("Enter Academic percentage:");
        percentage = sc.nextFloat();
        sc.nextLine();

    }

    // display Academic Details 
    public void displayAcademicDetails(){
        System.out.println("Student Name: " +name);
        System.out.println("Roll No: " +rollNo);
        System.out.println("Academioc Percentage: " +percentage+ "%");

}
//Store sports details
public void storeSportsDetails(){
    System.out.print("Enter Sports Name:");
    sportsName = sc.nextLine();

}

// display Sports Details 
public void displaySportsDetails(){
    System.out.println("\n---Sports Details---");
    System.out.println("Sports Name: " +sportsName);
}
}

public class StudentDemo{
    public static void main(String[]args){
        Student s = new Student();
        // Accept Details
        s.storeAcademicDetails();
        s.storeSportsDetails();
        // dispaly combined detaisl
        System.out.println("\n---Combined Student Details--- ");
        s.displayAcademicDetails();
        s.displaySportsDetails();
    }
}
