package Tugas;

import java.util.Scanner;

public class Tugas327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jmlToko;
        do {
            System.out.print("Jumlah toko: ");
            jmlToko = in.nextInt();
        } while (jmlToko < 1);

        int[] pelangganToko = new int[jmlToko + 1];
        int[] barangToko = new int[jmlToko + 1];
        int totalSemua = 0, maxBarang = -1, tokoMax = 0;

        for (int t = 1; t <= jmlToko; t++) {
            int jmlPelanggan;
            do {
                System.out.print("Toko " + t + " - jumlah pelanggan: ");
                jmlPelanggan = in.nextInt();
            } while (jmlPelanggan < 1);

            int totalBarang = 0;
            for (int p = 1; p <= jmlPelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                    barang = in.nextInt();
                } while (barang < 0);
                totalBarang += barang;
            }

            pelangganToko[t] = jmlPelanggan;
            barangToko[t] = totalBarang;
            totalSemua += totalBarang;

            if (totalBarang > maxBarang) {
                maxBarang = totalBarang;
                tokoMax = t;
            }
        }

        for (int t = 1; t <= jmlToko; t++) {
            System.out.println("Toko " + t + " - pelanggan: " + pelangganToko[t]
                    + ", total barang: " + barangToko[t]);
        }
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoMax);
    }
}
