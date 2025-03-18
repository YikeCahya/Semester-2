//Yulike DN (TI-1A/27)
package Minggu6;

public class SortingMain27 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        //Buat objek, instansiasi dari Sorting27
        Sorting27 dataUrut1 = new Sorting27(a, a.length);
        Sorting27 dataUrut2 = new Sorting27(b, b.length);
        Sorting27 dataUrut3 = new Sorting27(c, c.length);

        //Pemanggilan method
        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();

        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();
    }
}
