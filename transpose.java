package com;
import java .util.Scanner;
public class transpose {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Data:\n");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.print("Array Matrix:\n");
            for (int m = 0; m <= 1; m++) {
                for (int j = 0; j <= 1; j++) {
                    System.out.print(a[m][j]);
                }
                System.out.print("\n");
            }
            System.out.print("Transpose Matrix:\n");
            for (int k = 0; k <= 1; k++) {
                for (int j = 0; j <= 1; j++) {
                    System.out.print(a[j][k]);
                }
                System.out.print("\n");
            }
        }
    }
}