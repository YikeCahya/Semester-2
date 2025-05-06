/*
 * Nama : Yulike Dwi Nurcahyani
 * No   : 27 / 244107020146
 * Kelas: TI-1A
 */
package Minggu11;

import java.util.Scanner;

public class KRSMain27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        AntrianKRS27 antrian = new AntrianKRS27(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Persetujuan KRS oleh DPA ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa sekaligus)");
            System.out.println("3. Lihat 2 Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Jumlah Mahasiswa dalam Antrian");
            System.out.println("8. Jumlah Mahasiswa telah Proses KRS");
            System.out.println("9. Sisa Kuota KRS (Maks 30)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc27.nextInt();
            sc27.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc27.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc27.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc27.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc27.nextLine();
                    KRS27 mhs = new KRS27(nim, nama, prodi, kelas);
                    antrian.tambahMahasiswa(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemuaAntrian();
                    break;
                case 5:
                    antrian.tampilkanMahasiswaTerakhir();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
                case 7:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    System.out.println("Jumlah telah diproses KRS: " + antrian.getJumlahDiproses());
                    break;
                case 9:
                    System.out.println("Sisa kuota KRS: " + antrian.getSisaKuotaKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih. Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc27.close();
    }
}
