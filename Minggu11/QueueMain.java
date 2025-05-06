/*
 * Yulike Dwi Nurcahyani (TI-1A / 27 / 244107020146)
 */
package Minggu11;
import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc27.nextInt();

        //Instalasi object Queue
        Queue Q = new Queue(n);

        int pilih;
        boolean stop = false;

        do {
            menu();
            pilih = sc27.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc27.nextInt();
                    if (!Q.Enqueue(dataMasuk)) {
                        stop = true;
                    }
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar == -1) {
                        stop = true;
                    } else {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (!stop && (pilih >= 1 && pilih <= 5));
        sc27.close();
    }
}
