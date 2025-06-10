//Menyimpan transaksi pengisian BBM kendaraan
public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    /*public void tampilkanDetail() {
        kendaraan.tampilkanInformasi();
        System.out.println("BBM: " + bbm.namaBBM + ", Harga/Liter: " + bbm.hargaPerLiter + ", Liter: " + liter + ", Total Bayar: " + totalBayar);
    }*/

    public void tampilkanRingkas() {
    System.out.println(kendaraan.platNomor + ": Rp " + totalBayar);
    }
}