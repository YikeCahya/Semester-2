/*
 * Yulike Dwi Nurcahyani / TI-1A / 27
 */

public class MataKuliah27 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah27() {

    }

    public MataKuliah27(String kodeMk, String nm, int sks, int jumlahJam) {
        this.kodeMK = kodeMk;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("===========================");
        System.out.println("Kode MataKuliah: " + kodeMK);
        System.out.println("Nama MataKuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("===========================");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int tambahJam) {
        jumlahJam += tambahJam;
    }

    void kurangiJam(int kurangiJam) {
        jumlahJam -= kurangiJam;
    }
}
