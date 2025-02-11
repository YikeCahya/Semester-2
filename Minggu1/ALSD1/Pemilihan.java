/*
 * Nama: Yulike Dwi Nurcahyani
 * No.absen: 27
 * Kelas: TI-1A
 */

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {

        Scanner ike = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = ike.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = ike.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = ike.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = ike.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        //Deklarasi variabel
        String kualifikasi = "";
        String kelulusan = "";
        double akhir = 0;

        //Validasi input
        if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0 && uas <= 100) {
            
            akhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);

            //Menentukan nilai huruf
            if (akhir > 80) {
                kualifikasi = "A";
            } else if (akhir > 73) {
                kualifikasi = "B+";
            } else if (akhir > 65) {
                kualifikasi = "B";
            } else if (akhir > 60) {
                kualifikasi = "C+";
            } else if (akhir > 50) {
                kualifikasi = "C";
            } else if (akhir > 39) {
                kualifikasi = "D";
            } else {
                kualifikasi = "E";
            }

            //Validasi kelulusan
            if (akhir > 50 ) {
                kelulusan = "SELAMAT ANDA LULUS";
            } else {
                kelulusan = "TIDAK LULUS";
            }


            System.out.println("Nilai Akhir : " + akhir);
            System.out.println("Nilai Huruf : " + kualifikasi);
            System.out.println("=============================");
            System.out.println("=============================");
            System.out.println(kelulusan);
        } else {
            System.out.println("nilai tidak valid");
            System.out.println("=============================");
            System.out.println("=============================");
        }

        ike.close();
    }
}
