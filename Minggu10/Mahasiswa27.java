/*
 * Nama: Yulike Dwi Nurcahyani
 * No: 27 / 244107020146
 * Kelas: TI-1A
 */
package Minggu10;

public class Mahasiswa27 {
    String nama;
    String nim;
    String kelas;
    double nilai;

    Mahasiswa27() {

    }

    Mahasiswa27(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(double nilai) {
        this.nilai = nilai;
    }
}
