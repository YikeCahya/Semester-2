//Yulike DN (27/TI-1A)
package Minggu7;

public class DataDsn27 {
    Dsn27[] dataDosen = new Dsn27[5];
    int idx;

    void tambah(Dsn27 dsn) {
        if(idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    //Menampilkan data dosen
    void tampil() {
        for(Dsn27 dsn : dataDosen) {
            dsn.tampilInformasi();
            System.out.println("--------------------------------------");
        }
    }

    //Sorting ASC menggunakan bubble sort berdasarkan umur
    void sortASC() {
        for(int i = 0; i < dataDosen.length - 1; i++) {
            for(int j = 1; j < dataDosen.length - i; j++) {
                if(dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dsn27 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    //Sorting DESC menggunakan selection sort berdasarkan umur
    void sortDESC() {
        for(int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for(int j = i + 1; j < dataDosen.length; j++) {
                if(dataDosen[j].usia > dataDosen[idxMax].usia) {

                    idxMax = j;
                }
            }
            Dsn27 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    //Mencari data Sequeltial (Berdasarkan nama)
    int PencarianDataSequential27(String cariNama) {
        int count = 0;
        int posisi = -1;
        for(int j = 0; j < idx; j++) {
            if(dataDosen[j].nama.equalsIgnoreCase(cariNama)) {
                if(count == 0) {
                    posisi = j;
                }
                count++;
            }
        }
        if(count > 1) {
            System.out.println("Ditemukan " + count + " data dengan nama sama");
        }
        return posisi;
    }

    void tampilPosisi(String x, int pos) {
        if(pos != -1) {
            System.out.println("Data dosen dengan nama :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    } 

    void tampilDataSearch(String x, int pos) {
        if(pos != -1) {
            dataDosen[pos].tampilInformasi();
        } else {
            System.out.println("Data dosen dengan nama " + x + " tidak ditemukan");
        }
    }

    //Mencari data Binary (Berdasarkan usia) (Sorting menggunakan ASC)
    int PencarianDataBinary27(int cariUsia, int left, int right) {
        int mid;
        if(right >= left) {
            mid = (left + right) / 2;
            if(dataDosen[mid].usia == cariUsia) {
                //Mencari duplikasi
                int count = 1;
                    //Cek Kiri
                int temp = mid - 1;
                while (temp >= 0 && dataDosen[temp].usia == cariUsia) {
                    count++;
                    temp--;
                }
                    //Cek Kanan
                temp = mid + 1;
                while (temp < idx && dataDosen[temp].usia == cariUsia) {
                    count++;
                    temp++;
                }
                //Peringatan
                if (count > 1) {
                    System.out.println("Ditemukan " + count + " data dengan usia yang sama");
                }
                return (mid);
            } else if(dataDosen[mid].usia > cariUsia) {
                return PencarianDataBinary27(cariUsia, left, mid - 1);
            } else {
                return PencarianDataBinary27(cariUsia, mid + 1, right);
            }
        }
        return -1;
    }

    //Buat aturan untuk mendeteksi hasil pencarian lebih dari 1, beri kalimat peringatan.
}
