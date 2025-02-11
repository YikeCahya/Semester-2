/*
 * Nama: Yulike Dwi Nurcahyani
 * Kelas: TI-1A
 * No.absen: 27
 */

import java.util.Scanner;

public class Jadwal {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        // Mendeklarasikan array untuk data mata kuliah
        String[] matkul27 = new String[n];
        int[] sks27 = new int[n];
        int[] semester27 = new int[n];
        String[] hariKuliah27 = new String[n];
        
        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah " + (i + 1) + ": ");
            System.out.print("Nama Mata Kuliah: ");
            matkul27[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks27[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester27[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah (misal: senin): ");
            hariKuliah27[i] = scanner.nextLine();
        }
        
        // Menu pilihan
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Mencari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            if (pilihan == 1) {
                // Menampilkan seluruh jadwal kuliah
                for (int i = 0; i < n; i++) {
                    System.out.println("\nMata Kuliah: " + matkul27[i]);
                    System.out.println("SKS: " + sks27[i]);
                    System.out.println("Semester: " + semester27[i]);
                    System.out.println("Hari: " + hariKuliah27[i]);
                }
            } else if (pilihan == 2) {
                // Menampilkan jadwal berdasarkan hari
                System.out.print("Masukkan hari (misal: senin): ");
                String hari = scanner.nextLine();
                for (int i = 0; i < n; i++) {
                    if (hariKuliah27[i].equalsIgnoreCase(hari)) {
                        System.out.println("\nMata Kuliah: " + matkul27[i]);
                        System.out.println("SKS: " + sks27[i]);
                        System.out.println("Semester: " + semester27[i]);
                        System.out.println("Hari: " + hariKuliah27[i]);
                    }
                }
            } else if (pilihan == 3) {
                // Menampilkan jadwal berdasarkan semester
                System.out.print("Masukkan semester: ");
                int semester = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                for (int i = 0; i < n; i++) {
                    if (semester27[i] == semester) {
                        System.out.println("\nMata Kuliah: " + matkul27[i]);
                        System.out.println("SKS: " + sks27[i]);
                        System.out.println("Semester: " + semester27[i]);
                        System.out.println("Hari: " + hariKuliah27[i]);
                    }
                }
            } else if (pilihan == 4) {
                // Mencari mata kuliah
                System.out.print("Masukkan nama mata kuliah yang dicari: ");
                String cariMatkul = scanner.nextLine();
                boolean ditemukan = false;
                for (int i = 0; i < n; i++) {
                    if (matkul27[i].equalsIgnoreCase(cariMatkul)) {
                        System.out.println("\nMata Kuliah: " + matkul27[i]);
                        System.out.println("SKS: " + sks27[i]);
                        System.out.println("Semester: " + semester27[i]);
                        System.out.println("Hari: " + hariKuliah27[i]);
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Mata kuliah tidak ditemukan.");
                }
            } else if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        
        scanner.close();
    }
}
