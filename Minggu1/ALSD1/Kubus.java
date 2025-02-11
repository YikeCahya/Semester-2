/*
 * Nama: Yulike Dwi Nurcahyani
 * Kelas: TI-1A
 * No.absen: 27
 */

 /*
  *program untuk menghitung volume, luas permukaan, dan keliling kubus(total panjang rusuk kubus)
  */

import java.util.Scanner;

public class Kubus {

    //fungsi untuk menghitung hasil permukaan volume kubus
    public static int volume27(int sisi27) {
        return sisi27 * sisi27 * sisi27;
    }

    //fungsi untuk menghitung luas permukaan kubus
    public static int luasPermukaan27(int sisi27) {
        return 6 * (sisi27 * sisi27);
    }

    //fungsi untuk menghitung keliling kubus
    public static int keliling27(int sisi27) {
        return 12 * sisi27;
    }

    //bikin fungsi main untuk nampilin menu dan menerima pilihan menu (volume, luas permukaan, keliling)
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi kubus: ");
        int sisi27 = ike27.nextInt();
        
        System.out.println("Pilih perhitungan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.print("Pilihan: ");
        int pilihan27 = ike27.nextInt();
        
        switch (pilihan27) {
            case 1:
                System.out.println("Volume Kubus: " + volume27(sisi27));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + luasPermukaan27(sisi27));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + keliling27(sisi27));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
