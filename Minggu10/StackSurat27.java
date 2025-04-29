/*
 * Nama : Yulike Dwi Nurcahyani
 * No   : 244107020146
 * Kelas: TI-1A
 */
package Minggu10;

public class StackSurat27 {
    int top = -1;
    int kapasitas = 100;
    Surat27[] data = new Surat27[kapasitas];

    public boolean isFull() {
        return top == kapasitas - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void push(Surat27 surat) {
        if (!isFull()) {
            data[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat27 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Surat27 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }
        System.out.println("Isi stack surat (dari atas ke bawah):");
        for (int i = top; i >= 0; i--) {
            System.out.println("---------------");
            data[i].tampilkan();
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                data[i].tampilkan();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
