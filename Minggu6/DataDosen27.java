//Yulike DN(TI-1A/27)
package Minggu6;

public class DataDosen27 {
    Dosen27[] dataDosen = new Dosen27[1];
    int idx;

    void tambah(Dosen27 dsn) {
        if(idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    //Menampilkan data dosen
    void tampil() {
        for(Dosen27 dsn : dataDosen) {
            dsn.tampilInformasi();
            System.out.println("--------------------------------------");
        }
    }

    //Sorting ASC menggunakan bubble sort berdasarkan umur
    void sortASC() {
        for(int i = 0; i < dataDosen.length - 1; i++) {
            for(int j = 1; j < dataDosen.length - i; j++) {
                if(dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen27 tmp = dataDosen[j];
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
            Dosen27 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}
