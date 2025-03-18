//Yulike DN (TI-1A/27)
package Minggu6;

public class MahasiswaBerprestasi27 {
    Mahasiswa27[] listMhs = new Mahasiswa27[5];
    int idx;

    void tambah(Mahasiswa27 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    //Method menampilkan semua data di class ini
    void tampil() {
        for(Mahasiswa27 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------------------");
        }
    }

    //DESC menggunakan bubbleSort
    void bubbleSort() {
        for(int i = 0; i < listMhs.length - 1; i++) {
            for(int j = 1; j < listMhs.length - i; j++) {
                if(listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa27 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    //ASC menggunakan selectionSort
    void selectionSort() {
        for(int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for(int j = i + 1; j < listMhs.length; j++) {
                if(listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa27 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    //Ascending menggunakan Insertion Sort
    void insertionSort() {
        for(int i = 1; i < listMhs.length; i++) {
            Mahasiswa27 temp = listMhs[i];
            int j = i;
            while(j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    //Descending menggunakan Insertion Sort
    void insertionSortDESC() {
        for(int i = 1; i < listMhs.length; i++) {
            Mahasiswa27 temp = listMhs[i];
            int j = i;
            while(j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
