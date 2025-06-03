//Class untuk menyimpan objek Kendaraan
public class Node {
    Kendaraan data;
    Node next;

    Node(Kendaraan data) {
        this.data = data;
        this.next = null;
    }
}