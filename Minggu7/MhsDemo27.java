//Yulike DN (27/TI-1A)
package Minggu7;

import java.util.Scanner;

public class MhsDemo27 {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);

        String nim, nama, kelas, ipkStr;
        double ipk, cari2, posisi2;

        int jumMhs = 0;
        System.out.print("Masukkan jumlah mahasiswa yang ingin dimasukkan: ");
        jumMhs = ike27.nextInt();
        ike27.nextLine();
        MhsPrestasi27 list = new MhsPrestasi27(jumMhs);

        //Instansiasi
        for(int i = 0; i < jumMhs; i++) {
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

            list.tambah (new Mhs27(nim, nama, kelas, ipk));
        }

        System.out.println();
        list.tampil();

        //Melakukan pencarian data sequential
        /*System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String cariStr = ike27.nextLine();
        cari = Double.parseDouble(cariStr);

        System.out.println("Menggunakan sequential searching");
        posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);*/

        //Melakukan pencarian data Binary (Terurut ASC)
        System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String cariStr2 = ike27.nextLine();
        cari2 = Double.parseDouble(cariStr2);

        System.out.println("Menggunakan sequential searching");
        posisi2 = list.sequentialSearching(cari2);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);

        ike27.close();
    }
}
