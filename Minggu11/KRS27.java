/*
 * Nama : Yulike Dwi Nurcahyani
 * No   : 27 / 244107020146
 * Kelas: TI-1A
 */
package Minggu11;

public class KRS27 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public KRS27(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }


}