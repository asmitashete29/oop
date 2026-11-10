import java.util.Scanner;

// Base class
class Product {
    int productId;
    String name;
    double price;
// Method to acccept common product details
    void acceptProductDetails(Scanner sc) {
        System.out.print("Enter product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        name = sc.nextLine();

        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine();
    } 
// Method to display common product details
    void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Derived class Electronics
class Electronics extends Product {
    String brand;
    int warranty;

    void acceptElectronicsDetails(Scanner sc) {
        acceptProductDetails(sc);

        System.out.print("Enter brand: ");
        brand = sc.nextLine();

        System.out.print("Enter warranty (in years): ");
        warranty = sc.nextInt();
        sc.nextLine();
    }

    void displayElectronicsDetails() {
          displayProductDetails();

        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " years");
    }
}

// Derived class Clothing
class Clothing extends Product {
    String size;
    String material;

    void acceptClothingDetails(Scanner sc) {
        acceptProductDetails(sc);

        System.out.print("Enter size: ");
        size = sc.nextLine();

        System.out.print("Enter material: ");
        material = sc.nextLine();
    }

    void displayClothingDetails() {
        displayProductDetails();

        System.out.println("Size: " +size);
        System.out.println("Material: " +material);
    }
}

// Main class
public class ProductManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Electronics e = new Electronics();

        System.out.println("=== Enter Electronics Details ===");
        e.acceptElectronicsDetails(sc);

        System.out.println("\n=== Electronics Details ===");
        e.displayElectronicsDetails();

        Clothing c = new Clothing();

        System.out.println("\n=== Enter Clothing Details ===");
        c.acceptClothingDetails(sc);

        System.out.println("\n=== Clothing Details ===");
        c.displayClothingDetails();

        sc.close();
    }
}
