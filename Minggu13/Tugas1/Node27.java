/*
 * Nama : Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 * Kelas: TI-1A
 */
package Tugas1;

public class Node27 {
    int nomor;
    String nama;
    Node27 prev;
    Node27 next;

    public Node27(Node27 prev, int nomor, String nama, Node27 next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
