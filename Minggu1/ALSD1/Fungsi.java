import java.util.Scanner;

public class Fungsi {

    //stok bunga
    static int[][] stok27 = {
        {10, 5, 15, 7}, // RoyalGarden1
        {6, 11, 9, 12}, // RoyalGarden2
        {2, 10, 10, 5}, // RoyalGarden3
        {5, 7, 12, 9}   // RoyalGarden4
    };

    // array 1D harga
    static int[] harga27 = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar

    // nama cabang
    static String[] cabang27 = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};

    // nama bunga
    static String[] bunga27 = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    //Fungsi untuk menghitung penghasilan
    static void penghasilan() {
        for (int i = 0; i < stok27.length; i++) {
            int totalIncome27 = 0;
            for (int j = 0; j < stok27[i].length; j++) {
                totalIncome27 += stok27[i][j] * harga27[j];
            }
            System.out.println("Pendapatan " + cabang27[i] + " jika seluruhnya habis terjual: Rp" + totalIncome27);
        }
    }

    static void menampilkanStok27() {
        for (int i = 0; i < cabang27.length; i++) {
            System.out.println("Stok di " + cabang27[i] + ":");
            for (int j = 0; j < bunga27.length; j++) {
                System.out.println(bunga27[j] + ": " + stok27[i][j] + " potong");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        int menu27;

        do {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan stok setiap jenis bunga pada toko");
            System.out.println("2. Menampilkan total pendapatan setiap toko jika seluruhnya habis terjual");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            menu27 = ike27.nextInt();

            switch (menu27) {
                case 1:
                    menampilkanStok27();
                    break;
                case 2:
                    penghasilan();
                    break;
                case 3:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

        } while (menu27 != 3);
    }
}
