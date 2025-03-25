//Yulike DN (TI-1A/27)
package Minggu7;

public class Mhs27 {
    String nim; 
    String nama; 
    String kelas; 
    double ipk;

    //Konstruktor default
    Mhs27() {

    }

    //Konstruktor berparameter
    Mhs27(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    //Method menampilkan informasi
    void tampilInformasi() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}
