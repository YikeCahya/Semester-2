//YulikeDN_27_TI-1A
package Minggu5;

public class UTS27 {
    public UTS27[] mahasiswa; // Array of objects

    public UTS27(int jumlahMahasiswa) {
        mahasiswa = new UTS27[jumlahMahasiswa];
    }

    String nama, NIM;
    int tahunMasuk;
    double nilaiUTS, nilaiUAS;

    public UTS27(String nm, String NIM, int tm, double nilaiUTS, double nilaiUAS) {
        this.nama = nm;
        this.NIM = NIM;
        this.tahunMasuk = tm;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Menampilkan tabel isi array
    void tampilkan() {
        System.out.printf("%-15s %-10s %-10d %-10.2f %-10.2f\n", nama, NIM, tahunMasuk, nilaiUTS, nilaiUAS);
    }

    //Menggunakan UTS27 karena mengembalikan object, bukan nilai dari uts
    // Menghitung nilai UTS tertinggi menggunakan Divide and Conquer
    UTS27 utsTertinggiDC(int left, int right) {
        if (left == right) {
            return mahasiswa[left];
        }
        int mid = (left + right) / 2;
        UTS27 maxLeft = utsTertinggiDC(left, mid);
        UTS27 maxRight = utsTertinggiDC(mid + 1, right);
        return (maxLeft.nilaiUTS >= maxRight.nilaiUTS) ? maxLeft : maxRight;
    }

    // Menghitung nilai UTS terendah menggunakan Divide and Conquer
    UTS27 utsTerendahDC(int left, int right) {
        if (left == right) {
            return mahasiswa[left];
        }
        int mid = (left + right) / 2;
        UTS27 minLeft = utsTerendahDC(left, mid);
        UTS27 minRight = utsTerendahDC(mid + 1, right);
        return (minLeft.nilaiUTS <= minRight.nilaiUTS) ? minLeft : minRight;
    }

    // Rata-rata UAS semua mahasiswa menggunakan Brute Force
    double rataRataUASBF() {
        double total = 0;
        for (UTS27 mhs : mahasiswa) {
            total += mhs.nilaiUAS;
        }
        return total / mahasiswa.length;
    }
}