import java.util.Scanner;

public class Calculator{
public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    char choice;

    do{
    System.out.print("Enter First Number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter Second Number: ");
    int num2 = sc.nextInt();

    System.out.println("1. Addition: ");
    System.out.println("2. Substraction: ");
    System.out.println("3. Multiplication: ");
    System.out.println("4. Division: ");

    System.out.print("Enter your choice:");
    int ch = sc.nextInt();

    switch (ch){
        case 1:
        System.out.println("Addition = " + (num1 + num2));
        break;

        case 2:
        System.out.println("Substraction =" + (num1 - num2));
        break;

        case 3: 
        System.out.println("Multiplication =" + (num1 * num2));
        break;

        case 4:
        if(num2!= 0){
            System.out.println("Division =" + (num1 / num2));
        }else{
            System.out.println("Error! Division by zero is not possible:");
        }
       break;
    default:
        System.out.println("Invalid Choice");
    }
    System.out.print("\nDo you want to continue ? (Y/N): ");
    choice = sc.next().charAt(0);

    }while(choice=='Y'||choice=='y');

sc.close();
}
}
