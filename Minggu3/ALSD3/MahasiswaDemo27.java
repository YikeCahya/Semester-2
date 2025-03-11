//Yulike Dwi Nurcahyani (27/TI-1A)

package Minggu3.ALSD3;
import java.util.Scanner;

public class MahasiswaDemo27 {
    //File berisi main 
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in); //deklarsi scanner
        Mahasiswa27[] arrayOfMahasiswa = new Mahasiswa27[3]; //Instialisasi array of object
        //Mahasiswa27[] adalah nama array yang akan digunakan, memanggil dari class Mahasiswa27
        String dummy; //mendeklarasikan variabel dummy, variabel ini berfungsi untuk meyimpan data sementara

        //Perulangan untuk mengisi attribute pada object di dalam array
        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa27(); //Ini untuk initialisasi sebuah object

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = ike.nextLine(); //memasukkan nilai kedalam attribute nim
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = ike.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa[i].kelas = ike.nextLine();
            //nilai pada attribute ipk seharusnya adalah float, namun akan di tampng dulu pada variabel dummy yang bertipedata String
            //karena....
            System.out.print("IPK    : "); 
            dummy = ike.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy); //data diubah dari String ke float
            System.out.println("---------------------------------");

        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("---------------------------------");
        }
    }
}
