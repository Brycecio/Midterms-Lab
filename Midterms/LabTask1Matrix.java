
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            int[][] matrix = new int[3][3];
            int[] colSum = new int[3];
            System.out.println("Input 9 elements:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int num;
                    do {
                        num = input.nextInt();
                        if (num < 0 || num > 9)
                            System.out.println("Invalid! Enter 0-9 only.");
                    } while (num < 0 || num > 9);
                    matrix[i][j] = num;
                }
            }
            System.out.println("\n        Row Sums:");
            for (int i = 0; i < 3; i++) {
                int rowSum = 0;
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%8d", matrix[i][j]);
                    rowSum += matrix[i][j];
                    colSum[j] += matrix[i][j];
                }
                System.out.printf("%12d%n", rowSum);
            }
            System.out.println("\nColumn Sums:");
            for (int sum : colSum)
                System.out.printf("%8d%n", sum);

            int d1 = 0, d2 = 0;
            for (int i = 0; i < 3; i++) {
                d1 += matrix[i][i];
                d2 += matrix[i][2-i];
            }
            System.out.println("\nDiagonal Sum 1: " + d1);
            System.out.println("Diagonal Sum 2: " + d2);

            System.out.print("\nTry Again [y/n]: ");
            choice = input.next().toLowerCase().charAt(0);
            while (choice != 'y' && choice != 'n') {
                System.out.print("Enter y or n: ");
                choice = input.next().toLowerCase().charAt(0);
            }
        } while (choice == 'y');

        System.out.println("Program ended. Thank you!");
        input.close();
    }
}
