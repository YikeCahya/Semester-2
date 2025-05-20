//Yulike Dwi Nurcahyani (244107020146/TI-1A)
public class DoubleLinkedLists27 {
    Node27 head;
    int size;

    public DoubleLinkedLists27() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //Menambah pada posisi awal
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node27(null, item, null);
        } else {
            Node27 newNode = new Node27(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //Menambah pada posisi akhir
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node27 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node27 newNode = new Node27(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    //Menambah pada posisi ditentukan indeks
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node27 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node27 newNode = new Node27(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node27 newNode = new Node27(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    //Memperbarui jumlah data otomatis
    public int size() {
        return size;
    }

    //Menghapus semua isi linked lists
    public void clear() {
        head = null;
        size = 0;
    }

    //Mencetak isi linked lists
    public void print() {
        if (!isEmpty()) {
            Node27 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    //Menghapus posisi pertama
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //Menghapus posisi terakhir
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node27 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    //Menghapus berdasarkan indeks
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node27 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    //Mendapatkan data di awal
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    //Mendapatkan data terakhir
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node27 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    //Mendapatkan data berdasarkan indeks
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node27 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
