package Tugas;

import java.util.Scanner;

public class Tugas127 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai n = ");
            n = in.nextInt();
        } while (n < 1);

        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + (j < i ? " " : ""));
                total++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + total);
    }
}
