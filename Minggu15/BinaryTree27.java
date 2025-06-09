//Yulike DN
public class BinaryTree27 {
    Node27 root;

    public BinaryTree27() {

    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa27 mahasiswa) {
        Node27 newNode = new Node27(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node27 current = root;
            Node27 parent = null;
            while(true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node27 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node27 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void tranverseInOrder(Node27 node) {
        if (node != null) {
            tranverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            tranverseInOrder(node.right);
        }
    }

    void tranversePostOrder(Node27 node) {
        if (node != null) {
            tranversePostOrder(node.left);
            tranversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node27 getSuccessor(Node27 del) {
        Node27 successor = del.right;
        Node27 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node27 parent = root;
        Node27 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (left), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //jika punya 2 anak
                Node27 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }


    //1. Menambahkan node mahasiswa dengan cara rekursif
    public void addRekursif(Mahasiswa27 mhs) {
        root = insertRekursif(root, mhs);
    }

    private Node27 insertRekursif(Node27 current, Mahasiswa27 mhs) {
        if (current == null) {
            return new Node27(mhs);
        }
        if (mhs.ipk < current.mahasiswa.ipk) {
            current.left = insertRekursif(current.left, mhs);
        } else {
            current.right = insertRekursif(current.right, mhs);
        }
        return current;
    }

    //2. Mencari mahasiswa dengan IPK paling kecil dan paling besar
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node27 current = root;
        while (current.left != null) {
            current = current.left;
        }
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node27 current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.mahasiswa.tampilInformasi();
    }

    //3. Menampilkan mahasiswa dengan IPK di atas batas tertentu
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtasRekursif(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtasRekursif(Node27 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasRekursif(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasRekursif(node.right, ipkBatas);
        }
    }
}
