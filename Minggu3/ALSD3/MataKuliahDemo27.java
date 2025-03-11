//Yulike Dwi N (27/TI-1A)
package Minggu3.ALSD3; 
import java.util.Scanner;

public class MataKuliahDemo27 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);
        //memasukkan jumlah panjang array
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = ike.nextInt();
        ike.nextLine(); //harus dibersihkan, karena jika tidak input setelahnya akan di skip
        MataKuliah27[] arrayOfMataKuliah = new MataKuliah27[jumlah]; //proses instansiliasi array of object, panjang array sesuai input
        //mendeklarasikan variabel karena inputnya dari file ini
        String kode, nama, dummy; 
        int sks, jumlahJam;

        //perulangan memasukkan data ke array
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

            arrayOfMataKuliah[i] = new MataKuliah27(kode, nama, sks, jumlahJam); //barulah dimasukkan ke dalam object

            arrayOfMataKuliah[i].tambahData(); //memanggil method untuk mengeksekusi array
            System.out.println("--------------------------------------");

        }

        //perulangan untuk mencetak isi array
        for(int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo(); //memanggil method cetakInfo() untuk mencetak
            System.out.println("--------------------------------------");
        }

        
        
    }
}
