package assignment;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the order N as a command line argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int[][] mat1 = new int[N][N];
        int[][] mat2 = new int[N][N];
        int[][] sum = new int[N][N];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Addition
        System.out.println("Sum of Matrices:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}