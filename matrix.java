import java.util.Scanner;

public class MatrixOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows & column of matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int A[][] = new int[r1][c1];

        System.out.println("Enter matrix A:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows & column of matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int B[][] = new int[r2][c2];

        System.out.println("Enter matrix B:");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Addition
        if (r1 == r2 && c1 == c2) {

            System.out.println("\nAddition:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print((A[i][j] + B[i][j]) + " ");
                }
                System.out.println();
            }
        }

        // Multiplication
        if (c1 == r2) {

            int C[][] = new int[r1][c2];

            System.out.println("\nMultiplication:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Transpose of matrix
        System.out.println("\nTranspose of matrix:");

        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }

        // Row wise sum
        System.out.println("\nRow wise sum:");

        for (int i = 0; i < r1; i++) {
            int sum = 0;

            for (int j = 0; j < c1; j++) {
                sum += A[i][j];
            }

            System.out.println(sum);
        }

        // Column wise sum
        System.out.println("\nColumn wise sum:");

        for (int j = 0; j < c1; j++) {
            int sum = 0;

            for (int i = 0; i < r1; i++) {
                sum += A[i][j];
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
