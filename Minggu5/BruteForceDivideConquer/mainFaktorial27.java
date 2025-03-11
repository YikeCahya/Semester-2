//YulikeDN_27_TI-1A
package Minggu5.BruteForceDivideConquer;

import java.util.Scanner;

public class mainFaktorial27 {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = ike27.nextInt();

        //Membuat objek dari class faktorial27
        faktorial27 fk = new faktorial27();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
