/*
 * Nama : Yulike Dwi Nurcahyani
 * No   : 244107020146
 * Kelas: TI-1A
 */
package Minggu10;

import java.util.Scanner;

public class SuratMain27 {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);
        StackSurat27 stack = new StackSurat27();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama Mahasiswa");
            System.out.println("5. Lihat Semua Surat");
            System.out.println("6. Lihat Jumlah Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scan27.nextInt();
            scan27.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan27.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan27.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan27.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan27.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan27.nextInt();
                    scan27.nextLine(); 
                    stack.push(new Surat27(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil diterima.");
                    break;
                case 2:
                    Surat27 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Memverifikasi surat:");
                        suratDiproses.tampilkan();
                    }
                    break;
                case 3:
                    Surat27 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat terakhir:");
                        suratTerakhir.tampilkan();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan27.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5: 
                    stack.printAll();
                    break;
                case 6:
                    System.out.println("Jumlah surat dalam stack: " + stack.size());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
