//YulikeDN_27_TI-1A
package Minggu5;

import java.util.Scanner;

public class mainSum27 {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = ike27.nextInt();

        //Membuat objek, dan input nilai
        sum27 sm = new sum27(elemen);
        for(int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = ike27.nextDouble();
        }

        //Tampilkan hasil
        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
}
