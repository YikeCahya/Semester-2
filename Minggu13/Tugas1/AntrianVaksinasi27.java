/*
 * Nama : Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 * Kelas: TI-1A
 */
package Tugas1;

public class AntrianVaksinasi27 {
    Node27 head;
    int size;

    public AntrianVaksinasi27() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void Enqueue(int nomor, String nama) {
        Node27 baru;
        if (isEmpty()) {
            baru = new Node27(null, nomor, nama, null);
            head = baru;
        } else {
            Node27 current = head;
            while (current.next != null) {
                current = current.next;
            }
            baru = new Node27(current, nomor, nama, null);
            current.next = baru;
        }
        size++;
        System.out.println("Data berhasil ditambahkan ke dalam antrian");
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    public void print() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantre Vaksin");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("|No.\t|Nama\t|");

        if (isEmpty()) {
            System.out.println("Tidak ada data dalam antrian");
        } else {
            Node27 current = head;
            while (current != null) {
                System.out.printf("|%d\t|%s\t|\n", current.nomor, current.nama);
                current = current.next;
            }
        }

        System.out.println("Sisa Antrian: " + size);
    }
}
