//YulikeDN_27_TI-1A
package Minggu5;

public class mainUTS27 {
    public static void main(String[] args) {
        int jumlahMahasiswa = 8;
        UTS27 data = new UTS27(jumlahMahasiswa); // Membuat objek utama

        // Inisialisasi data mahasiswa dalam array
        data.mahasiswa[0] = new UTS27("Ahmad", "220101001", 2022, 78, 82);
        data.mahasiswa[1] = new UTS27("Budi", "220101002", 2022, 85, 88);
        data.mahasiswa[2] = new UTS27("Cindy", "220101003", 2021, 90, 87);
        data.mahasiswa[3] = new UTS27("Dian", "220101004", 2021, 76, 79);
        data.mahasiswa[4] = new UTS27("Eko", "220101005", 2023, 92, 95);
        data.mahasiswa[5] = new UTS27("Fajar", "220101006", 2020, 88, 85);
        data.mahasiswa[6] = new UTS27("Gina", "220101007", 2023, 80, 83);
        data.mahasiswa[7] = new UTS27("Hadi", "220101008", 2020, 82, 84);

        // Menampilkan data
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Nama", "NIM", "Tahun", "UTS", "UAS");
        System.out.println("--------------------------------------------------------");
        for (UTS27 mhs : data.mahasiswa) {
            mhs.tampilkan();
        }

        // Menghitung nilai UTS tertinggi dan terendah menggunakan objek data
        UTS27 utsTertinggi = data.utsTertinggiDC(0, jumlahMahasiswa - 1);
        UTS27 utsTerendah = data.utsTerendahDC(0, jumlahMahasiswa - 1);
        double rataUAS = data.rataRataUASBF();

        System.out.println("\nMahasiswa dengan Nilai UTS Tertinggi:");
        System.out.println("Nama: " + utsTertinggi.nama + " | Nilai UTS: " + utsTertinggi.nilaiUTS);

        System.out.println("\nMahasiswa dengan Nilai UTS Terendah:");
        System.out.println("Nama: " + utsTerendah.nama + " | Nilai UTS: " + utsTerendah.nilaiUTS);

        System.out.println("\nRata-rata Nilai UAS: " + rataUAS);
    }
}