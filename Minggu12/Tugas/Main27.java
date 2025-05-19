/*
 * Nama : Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 * Kelas: TI-1A
 */

 //Program utama
package Tugas;

import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianLayanan27 antrian = new AntrianLayanan27();
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 
            System.out.println("============================================");
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama     : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM      : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = input.nextLine();
                    System.out.println("--------------------------------");
                    DataAntrian27 data = new DataAntrian27(nama, nim, keperluan);
                    antrian.enqueue(data);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    antrian.antrianTerdepan();
                    break;
                case 5:
                    antrian.antrianTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah Mahasiswa dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);
    }
}
