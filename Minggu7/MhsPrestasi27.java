//Yulike DN (27/TI-1A)
package Minggu7;

public class MhsPrestasi27 {
    Mhs27[] listMhs;
    int idx;

    //Inisialisasi array menjadi dinamis
    public MhsPrestasi27(int size) {
        listMhs = new Mhs27[size];
        idx = 0;
    }

    void tambah(Mhs27 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    //Method menampilkan semua data di class ini
    void tampil() {
        for(Mhs27 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("--------------------------------------");
            }
        }
    }

    //Sequential Searching
    int sequentialSearching(double cari) {
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++) {
            if(listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    //menampilkan posisi
    void tampilPosisi(double x, int pos) {
        if(pos != -1) {
            System.out.println("Data mahasiswa dengan IPK :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    //Menampilkan data search
    void tampilDataSearch(double x, int pos) {
        if(pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    //Binary searching
    int findBinarySearching(double cari, int left, int right) {
        int mid;
        if(right >= left) {
            mid = (left + right) / 2;
            if(cari == listMhs[mid].ipk) {
                return (mid);
            } else if(listMhs[mid].ipk > cari) {
                return findBinarySearching(cari, left, mid - 1);
            } else {
                return findBinarySearching(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
