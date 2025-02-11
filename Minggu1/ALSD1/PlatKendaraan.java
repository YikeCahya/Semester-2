/*
 * Nama: Yulike Dwi Nurcahyani
 * Kelas: TI-1A
 * No.absen: 27
 */

import java.util.Scanner;

public class PlatKendaraan {
    public static void main(String[] args) {
        // Array satu dimensi untuk kode plat
        char[] kodePlat27 = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array dua dimensi untuk nama kota
        char[][] kota27 = {
            {'B', 'A', 'N', 'T', 'E', 'N', '\0'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', '\0'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', '\0'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', '\0'},
            {'B', 'O', 'G', 'O', 'R', '\0'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', '\0'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', '\0'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', '\0'},
            {'M', 'A', 'L', 'A', 'N', 'G', '\0'},
            {'T', 'E', 'G', 'A', 'L', '\0'}
        };

        // Masukkan input
        Scanner inputKode27 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char platKode = inputKode27.next().toUpperCase().charAt(0); // Mengambil karakter pertama dari input

        // Mencari kode plat
        boolean ditemukan = false;
        for (int i = 0; i < kodePlat27.length; i++) {
            if (kodePlat27[i] == platKode) {
                System.out.print("Kode plat " + platKode + " berasal dari kota: ");
                
                // Mencetak nama kota
                for (int j = 0; kota27[i][j] != '\0'; j++) {
                    System.out.print(kota27[i][j]);
                }
                
                System.out.println();
                ditemukan = true;
                break;
            }
        }

        // Jika kode tidak ditemukan
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan!");
        }
    }
}



