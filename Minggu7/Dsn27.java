//Yulike DN (TI-1A/27)
package Minggu7;

public class Dsn27 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    //Konstruktor default
    Dsn27() {

    }

    //Konstruktor berparameter
    Dsn27(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    //Menampilkan data
    void tampilInformasi() {
        System.out.println("Kode\t: " + kode);
        System.out.println("Nama\t: " + nama);
        String jkStr = jenisKelamin ? "Laki-Laki" : "Perempuan";
        System.out.println("Jenis Kelamin(L/P): " + jkStr);
        System.out.println("Usia\t : " + usia);
    }
}
