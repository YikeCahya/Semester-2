/*
 * Nama: Yulike Dwi Nurcahyani
 * NIM  : 244107020146
 */
package Tugas2;

public class DoubleLinkedList {
    Film head;

    public void tambahAwal(Film newFilm) {
        if (head == null) {
            head = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
    }

    public void tambahAkhir(Film newFilm) {
        if (head == null) {
            head = newFilm;
        } else {
            Film current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newFilm;
            newFilm.prev = current;
        }
    }

    public void tambahIndex(int index, Film newFilm) {
        if (index <= 0 || head == null) {
            tambahAwal(newFilm);
            return;
        }
        Film current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        newFilm.next = current.next;
        newFilm.prev = current;
        if (current.next != null) {
            current.next.prev = newFilm;
        }
        current.next = newFilm;
    }

    public void hapusPertama() {
        if (head != null) {
            head = head.next;
            if (head != null) head.prev = null;
        }
    }

    public void hapusTerakhir() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Film current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
    }

    public void hapusTertentu(String id) {
        Film current = head;
        while (current != null) {
            if (current.id.equals(id)) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;
                if (current.next != null) current.next.prev = current.prev;
                return;
            }
            current = current.next;
        }
    }

    public void cetak() {
        Film current = head;
        while (current != null) {
            System.out.println("------------------");
            System.out.println("ID: " + current.id);
            System.out.println("Judul Film: " + current.judul);
            System.out.println("Rating: " + current.rating);
            current = current.next;
        }
    }

    public void cariID(String id) {
        Film current = head;
        while (current != null) {
            if (current.id.equals(id)) {
                System.out.println("Data ditemukan:");
                System.out.println("ID: " + current.id);
                System.out.println("Judul Film: " + current.judul);
                System.out.println("Rating: " + current.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Data tidak ditemukan.");
    }

    public void urutRatingDesc() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Film current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    
                    String tempId = current.id;
                    String tempJudul = current.judul;
                    double tempRating = current.rating;

                    current.id = current.next.id;
                    current.judul = current.next.judul;
                    current.rating = current.next.rating;

                    current.next.id = tempId;
                    current.next.judul = tempJudul;
                    current.next.rating = tempRating;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
