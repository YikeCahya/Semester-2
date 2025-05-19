/*
 * Nama : Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 * Kelas: TI-1A
 */

 //Menyimpan data mahasiswa
package Tugas;

public class DataAntrian27 {
    String nama, nim, keperluan;

    public DataAntrian27(String nama, String nim, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }

    public void tampil() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Keperluan: " + keperluan);
        System.out.println("-------------------------");
    }
}
