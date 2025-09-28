package assignment;
import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D array
        
        System.out.print("Enter size of 1D array: ");
        int n1 = sc.nextInt();
        int[] arr1D = new int[n1];
        System.out.println("Enter elements for 1D array:");
        for (int i = 0; i < n1; i++) {
            arr1D[i] = sc.nextInt();
        }

        // 2D array
        System.out.print("Enter number of rows for 2D array: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for 2D array: ");
        int cols = sc.nextInt();
        int[][] arr2D = new int[rows][cols];
        System.out.println("Enter elements for 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        // 3D array
        System.out.print("Enter depth (first dimension) for 3D array: ");
        int d = sc.nextInt();
        System.out.print("Enter rows for 3D array: ");
        int r = sc.nextInt();
        System.out.print("Enter columns for 3D array: ");
        int c = sc.nextInt();
        int[][][] arr3D = new int[d][r][c];
        System.out.println("Enter elements for 3D array:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    arr3D[i][j][k] = sc.nextInt();
                }
            }
        }

        // Display arrays
        System.out.println("1D Array:");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1D[i] + " ");
        }
        System.out.println();

        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("3D Array:");
        for (int i = 0; i < d; i++) {
            System.out.println("Depth " + i + ":");
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
