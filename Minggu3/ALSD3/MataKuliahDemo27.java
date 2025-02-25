//Yulike Dwi N (27/TI-1A)
package Minggu3.ALSD3;
import java.util.Scanner;

public class MataKuliahDemo27 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = ike.nextInt();
        ike.nextLine();
        MataKuliah27[] arrayOfMataKuliah = new MataKuliah27[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       :");
            kode = ike.nextLine();
            System.out.print("Nama       :");
            nama = ike.nextLine();
            System.out.print("SKS        :");
            dummy = ike.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam :");
            dummy = ike.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMataKuliah[i] = new MataKuliah27(kode, nama, sks, jumlahJam);

            arrayOfMataKuliah[i].tambahData();
            System.out.println("--------------------------------------");

        }

        for(int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("--------------------------------------");
        }

        
        
    }
}
