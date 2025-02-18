/*
 * Yulike Dwi N / TI-1A / 27
 */

public class MahasiswaMain27 {
    public static void main(String[] args) {
        Mahasiswa27 mhs1 = new Mahasiswa27();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        //Praktikum 3
        Mahasiswa27 mhs2 = new Mahasiswa27("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa27 mhsIke = new Mahasiswa27("Yulike Dwi Nurcahyani", "244107020146", 3.75, "TI 1A");
        mhsIke.updateIpk(3.90);
        mhsIke.tampilkanInformasi();
    }
}
