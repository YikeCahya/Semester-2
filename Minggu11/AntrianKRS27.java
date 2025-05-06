/*
 * Nama : Yulike Dwi Nurcahyani
 * No   : 27 / 244107020146
 * Kelas: TI-1A
 */
package Minggu11;

public class AntrianKRS27 {
    KRS27[] antrian;
    int front, rear, size, max;
    int totalDiproses;

    public AntrianKRS27(int kapasitas) {
        max = kapasitas;
        antrian = new KRS27[max];
        front = 0;
        rear = -1;
        size = 0;
        totalDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tambahMahasiswa(KRS27 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian KRS.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk proses KRS.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa untuk KRS:");
        for (int i = 0; i < 2; i++) {
            KRS27 mhs = antrian[front];
            front = (front + 1) % max;
            size--;
            totalDiproses++;
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            antrian[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 mahasiswa dalam antrian.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan dalam antrian:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            antrian[index].tampilkanData();
        }
    }

    public void tampilkanMahasiswaTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian:");
            antrian[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDiproses() {
        return totalDiproses;
    }

    public int getSisaKuotaKRS() {
        return 30 - totalDiproses;
    }
}