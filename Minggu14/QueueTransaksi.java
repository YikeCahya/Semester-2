//Menyimpan riwayat transaksi
public class QueueTransaksi {
    TransaksiPengisian[] transaksiArray;
    int front, rear, size, capacity;

    QueueTransaksi(int capacity) {
        this.capacity = capacity;
        transaksiArray = new TransaksiPengisian[capacity];
        front = size = 0;
        rear = -1;
    }

    void enqueue(TransaksiPengisian transaksi) {
        if (size == capacity) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        rear = (rear + 1) % capacity;
        transaksiArray[rear] = transaksi;
        size++;
    }

    void tampilkanRiwayat() {
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");

        for (int i = 0; i < size; i++) {
            int idx = (front + i) % capacity;
            transaksiArray[idx].tampilkanRingkas();
        }
    }
}
