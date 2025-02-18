/*
 * Yulike Dwi Nurcahyani / TI-1A / 27
 */

public class DosenMain27 {
    public static void main(String[] args) {
        Dosen27 ds1 = new Dosen27();
        ds1.idDosen = "IKE";
        ds1.nama = "Yulike Dwi Nurcahyani";
        ds1.statusAktif = false;
        ds1.tahunBergabung = 2005;
        ds1.bidangKeahlian = "Tidur";

        ds1.tampilkanInformasi();
        ds1.setStatusAktif(true);
        ds1.hitungMasaKerja(2025);
        ds1.tampilkanInformasi();

        Dosen27 ds2 = new Dosen27();
        ds2.idDosen = "Din4";
        ds2.nama = "Dinasari";
        ds2.statusAktif = true;
        ds2.tahunBergabung = 2006;
        ds2.bidangKeahlian = "Game";

        ds2.ubahKeahlian("Mengaji");
        ds2.tampilkanInformasi();

    }
}
