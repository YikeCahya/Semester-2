/*
 * Nama: Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 */
package Tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        int pilihan;

        do {
            System.out.println("========================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film–DESC");
            System.out.println("10. Keluar");
            System.out.println("========================================");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Film: ");
                    String idAwal = sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAwal = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAwal = sc.nextDouble();
                    sc.nextLine();
                    list.tambahAwal(new Film(idAwal, judulAwal, ratingAwal));
                    break;

                case 2:
                    System.out.print("ID Film: ");
                    String idAkhir = sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAkhir = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAkhir = sc.nextDouble();
                    sc.nextLine();
                    list.tambahAkhir(new Film(idAkhir, judulAkhir, ratingAkhir));
                    break;

                case 3:
                    System.out.print("Urutan ke-: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID Film: ");
                    String idIndex = sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judulIndex = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingIndex = sc.nextDouble();
                    sc.nextLine();
                    list.tambahIndex(index, new Film(idIndex, judulIndex, ratingIndex));
                    System.out.println("Data Film ini akan masuk di urutan ke- " + index);
                    break;

                case 4:
                    list.hapusPertama();
                    break;

                case 5:
                    list.hapusTerakhir();
                    break;

                case 6:
                    System.out.print("Masukkan ID Film yang ingin dihapus: ");
                    String idHapus = sc.nextLine();
                    list.hapusTertentu(idHapus);
                    break;

                case 7:
                    System.out.println("Cetak Data");
                    list.cetak();
                    break;

                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    String idCari = sc.nextLine();
                    list.cariID(idCari);
                    break;

                case 9:
                    list.urutRatingDesc();
                    System.out.println("Data berhasil diurutkan berdasarkan rating (DESC).");
                    break;

                case 10:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 10);

        sc.close();
    }
}
