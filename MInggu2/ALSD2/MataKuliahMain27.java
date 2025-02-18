/*
 * Yulike Dwi Nurcahyani / TI-1A / 27
 */

public class MataKuliahMain27 {
    public static void main(String[] args) {
        MataKuliah27 mk1 = new MataKuliah27();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma dan Struktuk Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(0);
        mk1.kurangiJam(2);
        mk1.tampilkanInformasi();

        MataKuliah27 mk2 = new MataKuliah27();
        mk2.kodeMK = "DasPro";
        mk2.nama = "Dasar Pemrograman";
        mk2.sks = 4;
        mk2.jumlahJam = 8;

        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(0);
        mk2.tampilkanInformasi();
    }
}
