/*
 * Nama: Yulike Dwi Nurcahyani
 * No: 27 / 244107020146
 * Kelas: TI-1A
 */
package Minggu10;

//Tempat untuk mengelola stack

public class StackTugasMahasiswa27 {
    //Array Of Object
    Mahasiswa27[] stack;

    int top;
    int size;

    public StackTugasMahasiswa27(int size) {
        this.size = size;
        stack = new Mahasiswa27[size];
        top = -1;
    }

    //Mengecek apakah tumpukan tugas sudah terisi penuh
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    //Mengecek apakah tumpukan tugas masih kosong
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    //Menerima parameter mhs yang berupa object dari class Mahasiswa27
    public void push(Mahasiswa27 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    //Mengeluarkan tugas yang akan dinilai
    public Mahasiswa27 pop() {
        if (!isEmpty()) {
            Mahasiswa27 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    //Mengecek tumpukan tugas yang berada di posisi paling atas
    public Mahasiswa27 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    //Menampilkan semua daftar tugas
    public void print() {
        for (int i = top; i >= 0; i--) { //Perbaikan
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    //Melihat mahasiswa pertama kali mengumpulkan tugas (tugas terbawah)
    public Mahasiswa27 firstIn() {
        if (!isEmpty()) {
            return stack[0]; // indeks 0 = elemen pertama yang masuk
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    //Menghitung jumlah tugas
    public int jumlahTugas() {
        return top + 1; // Karena top mulai dari -1
    }

    //Membuat stack lagi, agar berbeda dengan stack mahasiswa
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi27 stack = new StackKonversi27();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
