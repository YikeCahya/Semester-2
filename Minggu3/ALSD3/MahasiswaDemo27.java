//Yulike Dwi Nurcahyani (27/TI-1A)

package Minggu3.ALSD3;
import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);
        Mahasiswa27[] arrayOfMahasiswa = new Mahasiswa27[3];
        String dummy;

        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa27();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = ike.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = ike.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa[i].kelas = ike.nextLine();
            System.out.print("IPK    : ");
            dummy = ike.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------");

        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("---------------------------------");
        }
    }
}
