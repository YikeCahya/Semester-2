/*
 * Nama : Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 * Kelas: TI-1A
 */

//proses antrian (enqueue, dequeue, dll)
package Tugas;

public class AntrianLayanan27 {
    Node head, tail;
    int size;

    class Node {
        DataAntrian27 data;
        Node next;

        Node(DataAntrian27 data) {
            this.data = data;
            this.next = null;
        }
    }

    public AntrianLayanan27() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(DataAntrian27 input) {
        Node newNode = new Node(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    public void dequeue() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa dipanggil:");
            head.data.tampil();
            head = head.next;
            size--;
            if (head == null) tail = null;
        } else {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        }
    }

    public void tampilAntrian() {
        if (!isEmpty()) {
            Node temp = head;
            System.out.println("\nDaftar Mahasiswa dalam Antrian:");
            System.out.println("=================================");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void antrianTerdepan() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            head.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void antrianTerakhir() {
        if (!isEmpty()) {
            System.out.println("Antrian Terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public void kosongkanAntrian() {
        head = tail = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }
}
