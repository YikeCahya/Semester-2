/*
 * Yulike Dwi Nurcahyani / TI-1A / 27
 */

public class Dosen27 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    int masaKerja;
    String bidangKeahlian;

    public Dosen27() {

    }

    public Dosen27(String idDosen, String nm, boolean sA, int tB, String bK) {
        this.idDosen = idDosen;
        nama = nm;
        statusAktif = sA;
        tahunBergabung = tB;
        bidangKeahlian = bK;
    }

    void tampilkanInformasi() {
        System.out.println("============================");
        System.out.println("id Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Masa kerja: " + masaKerja + " tahun");
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println();
    }

    boolean setStatusAktif(boolean status) {
        statusAktif = status;
        if (status == true) {
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak Aktif");
        }
        return statusAktif;
    }

    int hitungMasaKerja(int thnSkr) {
        return masaKerja = thnSkr - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
