//Yulike DN(27/TI-1A)
package Minggu3.ALSD3;

public class DataDosen27 { 
    //deklarasi array
    Dosen27[] daftarDosen;
    int jumlahDosen;

    //konstruktok berparameter
    public DataDosen27() {
        daftarDosen = new Dosen27[0]; //pengisian array, Awalnya array kosong
        jumlahDosen = 0;
    }

    public void tambahDosen(Dosen27 dosen) {
        // Membuat array baru dengan ukuran lebih besar
        Dosen27[] temp = new Dosen27[jumlahDosen + 1]; 

        // Salin data lama ke array baru
        for (int i = 0; i < jumlahDosen; i++) {
            temp[i] = daftarDosen[i];
        }

        // Tambahkan data baru
        temp[jumlahDosen] = dosen;

        // Mengganti array lama dengan array baru
        daftarDosen = temp;
        jumlahDosen++;
    }

    public void dataSemuaDosen() {
        if (jumlahDosen == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        System.out.println("\n=== Data Semua Dosen ===");
        for (int i = 0; i < jumlahDosen; i++) {
            Dosen27 d = daftarDosen[i];
            System.out.println("Kode         : " + d.kode);
            System.out.println("Nama         : " + d.nama);
            System.out.println("Jenis Kelamin: " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia         : " + d.usia);
            System.out.println("-------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin() {
        int pria = 0, wanita = 0;
        for (int i = 0; i < jumlahDosen; i++) {
            if (daftarDosen[i].jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria  : " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin() {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (int i = 0; i < jumlahDosen; i++) {
            if (daftarDosen[i].jenisKelamin) {
                totalPria += daftarDosen[i].usia;
                countPria++;
            } else {
                totalWanita += daftarDosen[i].usia;
                countWanita++;
            }
        } 

        System.out.println("\nRata-rata Usia Dosen Pria  : " +
            (countPria == 0 ? "Tidak ada data" : (totalPria / countPria)));
        System.out.println("Rata-rata Usia Dosen Wanita: " +
            (countWanita == 0 ? "Tidak ada data" : (totalWanita / countWanita)));
    }

    public void infoDosenPalingTua() {
        if (jumlahDosen == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }

        Dosen27 tertua = daftarDosen[0];
        for (int i = 1; i < jumlahDosen; i++) {
            if (daftarDosen[i].usia > tertua.usia) tertua = daftarDosen[i];
        }

        System.out.println("\nDosen Paling Tua:");
        System.out.println("Kode : " + tertua.kode);
        System.out.println("Nama : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);
    }

    public void infoDosenPalingMuda() {
        if (jumlahDosen == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }

        Dosen27 termuda = daftarDosen[0];
        for (int i = 1; i < jumlahDosen; i++) {
            if (daftarDosen[i].usia < termuda.usia) termuda = daftarDosen[i];
        }

        System.out.println("\nDosen Paling Muda:");
        System.out.println("Kode : " + termuda.kode);
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
    }
}
