import java.util.Scanner;

class Employee{
    int id;
    String name;
    double salary;

    // default constructor
    Employee(){
        int id = 0;
        String name = "ABC";
        double salary = 0;
    }

        // constructor with name only
        Employee(String name){
            this.name = name;
        }
        //  constructor with name and salary
        Employee(String name , double salary){
            this.name = name;
            this.salary = salary;
        }
        // constructor with all details
        Employee(int id , String name , double price){
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        
             void display(){
                    System.out.println("\nEmployee Details");
                    System.out.println("ID =" + id);
                    System.out.println("Name =" + name);
                    System.out.println("Salary =" + salary);
                    System.out.println("Annual Salary =" + (salary*12));
                }
                public static void main(String[]args){
                    Scanner sc = new Scanner(System.in);
                    Employee e;
                    System.out.println("1. default");
                    System.out.println("2. name only");
                    System.out.println("3. name & salary");
                    System.out.println("4. all details");
                    System.out.println("5. Enter your choice");
                    int ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            e = new Employee();
                            break;

                        case 2:
                            System.out.println("enter name");
                            e = new Employee(sc.nextLine());
                            break;

                        case 3:
                            System.out.println("enter name");
                            String name = sc.nextLine();
                            System.out.println("enter salary");
                            double salary = sc.nextDouble();
                            e = new Employee(name , sc.nextDouble());
                            break;

                        case 4:
                            System.out.println("enter id");
                            int id = sc.nextInt();
                            System.out.println("enter name");
                            String empname = sc.nextLine();
                            System.out.println("enter salary");
                            double empsalary = sc.nextDouble();
                            e = new Employee(id , empname , empsalary);
                            break;

                        default:
                            System.out.println("Invalid choice");
                            return;
                    }
                    e.display();
                    sc.close();
                }
            }
