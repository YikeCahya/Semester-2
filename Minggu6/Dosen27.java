//Yulike DN(TI-1A/27)
package Minggu6;

public class Dosen27 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    //Konstruktor default
    Dosen27() {

    }

    //Konstruktor berparameter
    Dosen27(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    //Menampilkan data
    void tampilInformasi() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        String jkStr = jenisKelamin ? "Laki-Laki" : "Perempuan";
        System.out.println("Jenis Kelamin(L/P): " + jkStr);
        System.out.println("Usia        : " + usia);
    }
}
