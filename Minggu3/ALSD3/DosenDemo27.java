//Yulike DN (27/TI-1A)

package Minggu3.ALSD3;
import java.util.Scanner;

public class DosenDemo27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen27 dataDosen = new DataDosen27();
        int pilihan;

        do {
            System.out.println("\n=== Menu Data Dosen ===");
            System.out.println("1. Input Data Dosen");
            System.out.println("2. Tampilkan Semua Data Dosen");
            System.out.println("3. Jumlah Dosen per Jenis Kelamin");
            System.out.println("4. Rerata Usia Dosen per Jenis Kelamin");
            System.out.println("5. Info Dosen Paling Tua");
            System.out.println("6. Info Dosen Paling Muda");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Berapa banyak data yang ingin dimasukkan? ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
                        System.out.print("Kode               : ");
                        String kode = scanner.nextLine();
                        System.out.print("Nama               : ");
                        String nama = scanner.nextLine();
                        System.out.print("Jenis Kelamin (P/L): ");
                        String jenisKelaminStr = scanner.nextLine();
                        boolean jenisKelamin = jenisKelaminStr.equalsIgnoreCase("L");
                        System.out.print("Umur               : ");
                        int usia = scanner.nextInt();
                        scanner.nextLine(); 

                        Dosen27 dosen = new Dosen27(kode, nama, jenisKelamin, usia);
                        dataDosen.tambahDosen(dosen);
                    }
                    break;

                case 2:
                    dataDosen.dataSemuaDosen();
                    break;

                case 3:
                    dataDosen.jumlahDosenPerJenisKelamin();
                    break;

                case 4:
                    dataDosen.rerataUsiaDosenPerJenisKelamin();
                    break;

                case 5:
                    dataDosen.infoDosenPalingTua();
                    break;

                case 6:
                    dataDosen.infoDosenPalingMuda();
                    break;

                case 7:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 7);

        scanner.close();
    }
} 