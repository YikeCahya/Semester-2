//Yulike Dwi N(27/TI-1A)
package Minggu3.ALSD3;

import java.util.Scanner; //Mengimport scanner

//membentuk class bernama MataKuliah27
public class MataKuliah27 {
    //Deklarasi attribute
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    //konstruktok berparameter
    public MataKuliah27(String kode, String nama, int sks, int jumlahJam) { //yang didalam itu namanya parameter
        this.kode = kode; //dikasi this. karena nama attribute dan parameter sama
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    } 

    void tambahData() {
      Scanner tD = new Scanner(System.in);
        System.out.println();
        System.out.print("Kode       : ");
        this.kode = tD.nextLine();
        System.out.print("Nama       : ");
        this.nama = tD.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(tD.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(tD.nextLine());
    }

    void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
}
