//Yulike DN (TI-1A/27)
package Minggu6;
import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);

        String nim, nama, kelas, ipkStr;
        double ipk;

        Mahasiswa27[] mhsArray = new Mahasiswa27[5];

        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();
        /*Mahasiswa27 m1 = new Mahasiswa27("123", "Zidan", "2A", 3.2);
        Mahasiswa27 m2 = new Mahasiswa27("124", "Ayu", "2A", 3.5);
        Mahasiswa27 m3 = new Mahasiswa27("125", "Sofi", "2A", 3.1);
        Mahasiswa27 m4 = new Mahasiswa27("126", "Sita", "2A", 3.9);
        Mahasiswa27 m5 = new Mahasiswa27("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);*/

        //Instansiasi
        for(int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            nim = ike27.nextLine();
            System.out.print("Nama  : ");
            nama = ike27.nextLine();
            System.out.print("Kelas : ");
            kelas = ike27.nextLine();
            System.out.print("IPK   : ");
            ipkStr = ike27.nextLine();
            ipk = Double.parseDouble(ipkStr);
            System.out.println("---------------------------");

            mhsArray[i] = new Mahasiswa27(nim, nama, kelas, ipk);
        }

        for (Mahasiswa27 a : mhsArray) {
            list.tambah(a);
        }

        System.out.println();

        //Memanggil data
        /*System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();*/

        /*System.out.println("Data yang sudah terurut menggunakan SELESCTION SORT (ASC)");
        list.selectionSort();
        list.tampil();*/

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSortDESC();
        list.tampil();

        ike27.close();
    }
}
