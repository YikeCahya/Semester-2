/*
 * Nama : Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 * Kelas: TI-1A
 */
package Tugas1;

import java.util.Scanner;

public class MainAntrian27 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);
        AntrianVaksinasi27 antrian = new AntrianVaksinasi27();
        int pilih;

        do {
            System.out.println();
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            pilih = ike.nextInt();
            System.out.println();
            ike.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.print("Nomor Antrian: ");
                    int no = ike.nextInt();
                    ike.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = ike.nextLine();
                    antrian.Enqueue(no, nama);
                    break;
                case 2:
                    antrian.Dequeue();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem antrian vaksinasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 4);

        ike.close();
    }
}
