/*
 * Nama: Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 */
package Tugas2;

public class Film {
    String id;
    String judul;
    double rating;
    Film prev, next;

    public Film(String id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
