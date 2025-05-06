/*
 * Yulike Dwi Nurcahyani (TI-1A / 27 / 244107020146)
 */
package Minggu11;

public class AntrianLayanan27 {
    Mahasiswa27[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan27(int max) {
        this.max = max;
        this.data = new Mahasiswa27[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    //Mengecek kosong atau tidak
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Mengecek penuh atau tidak
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    //Mengecek antrian paling depan
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    //Mengecek antrian paling belakang
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    //Menampilkan seluruh elemen
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    //Menambahkan isi
    public void tambahAntrian(Mahasiswa27 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    //Mengeluarkan data
    public Mahasiswa27 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } 
        Mahasiswa27 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    //Menampilkan nilai size
    public int getJumlahAntrian() {
        return size;
    }
}
