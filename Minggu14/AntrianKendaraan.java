//Menggunakan linked list untuk antrian kendaraan
public class AntrianKendaraan {
    Node front, rear;
    int size;

    public AntrianKendaraan() {
        front = rear = null;
        size = 0;
    }

    //Menambahkan kendaraan ke antrian (enqueue)
    void tambahAntrian(Kendaraan kendaraan) {
        Node baru = new Node(kendaraan);
        if (rear == null) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
    }

    //Mengambil kendaraan dari antrian paling depan (dequeue)
    Kendaraan layaniKendaraan() {
        if (front == null) {
            return null;
        }
        Kendaraan temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp;
    }

    void tampilkanAntrian() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node current = front;
        while (current != null) {
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }

    int jumlahAntrian() {
        return size;
    }
}