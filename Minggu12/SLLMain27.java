//Yulike DN (244107020146_TI-1A)
import java.util.Scanner;
public class SLLMain27 {
    public static void main(String[] args) {
        //Scanner ike = new Scanner(System.in);
        SingleLinkedList27 list = new SingleLinkedList27();

        /*System.out.println("\nMasukkan data mahasiswa baru:");
        System.out.print("Masukkan NIM: ");
        String nim = ike.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = ike.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = ike.nextLine();
        System.out.print("Masukkan IPK: ");
        String ipkStr = ike.nextLine();
        double ipk = Double.parseDouble(ipkStr);

        Mahasiswa27 mhsBaru = new Mahasiswa27(nim, nama, kelas, ipk);
        list.addFirst(mhsBaru);
        System.out.println("=====================");
        System.out.println("\nIsi Linked List:");
        list.print();*/

        /*System.out.println("Linked list kosong");
        System.out.println("Isi Linked List:");
        list.print();*/

        Mahasiswa27 mhs1 = new Mahasiswa27("21212203", "Dirga", "4D", 3.6);
        Mahasiswa27 mhs2 = new Mahasiswa27("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa27 mhs3 = new Mahasiswa27("22212202", "Cintia", "3C", 3.5);
        Mahasiswa27 mhs4 = new Mahasiswa27("23212201", "Bimon", "2B", 3.8);

        list.addFirst(mhs1);
        list.addLast(mhs2);
        list.insertAt(1, mhs3); // Cintia masuk indeks 1
        list.insertAt(2, mhs4); // Bimon masuk indeks 2

        System.out.println("data index 1 : ");
        list.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + list.indexOf("bimon"));
        System.out.println();

        System.out.println("Isi Linked List: ");
        list.removeFirst();
        list.removeLast();
        list.print();
        System.out.println();

        System.out.println("Isi Linked List:");
        list.removeAt(0);
        list.print();

        /*list.addFirst(mhs1);
        System.out.println("\nIsi Linked List:");
        list.print();

        list.addLast(mhs2);
        System.out.println("\nIsi Linked List:");
        list.print();

        list.insertAt(1, mhs3); // Tambah Cintia di indeks 1
        list.insertAt(2, mhs4); // Tambah Bimon di indeks 2
        System.out.println("\nIsi Linked List:");
        list.print();*/
    }
}
