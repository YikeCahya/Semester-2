//YulikeDN_27_TI-1A
package Minggu5;

import java.util.Scanner;

public class mainPangkat27 {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = ike27.nextInt();

        //Memasukkan nilai ke dalam array
        pangkat27[] png = new pangkat27[elemen];
        for(int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = ike27.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ":");
            int pangkat = ike27.nextInt();
            png[i] = new pangkat27(basis, pangkat);
        }

        //Memanggil hasil
        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for(pangkat27 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for(pangkat27 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }

    }
}
