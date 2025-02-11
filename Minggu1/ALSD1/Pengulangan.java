import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        
        //Inputan
        System.out.print("Masukkan NIM: ");
        long nim = ike27.nextLong();
        
        //Ambil 2 digit terakhir
        int n = (int) (nim % 100); 

        //Kalo kurang dari 10 ditamhah 10
        n = (n < 10) ? n + 10 : n;
        
        //Pengulangannya
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue;
            System.out.print((i % 2 == 0) ? i + " " : "* ");
        }
    }
}
