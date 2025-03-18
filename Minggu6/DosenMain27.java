//Yulike DN(TI-1A/27)
package Minggu6;
import java.util.Scanner;

public class DosenMain27 {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        DataDosen27 dataDosen = new DataDosen27();
        Dosen27[] dsn = new Dosen27[1];
        String kode, nama, jkInput, usiaStr;
        int pilih, usia;

        do {
            System.out.println("====== Data Dosen =======");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Soting ASC");
            System.out.println("4. Sorting DESC");
            System.out.println("5. Keluar");
            System.out.println("=========================");
            System.out.println();
            System.out.print("Pilih menu: ");
            pilih = ike27.nextInt();
            ike27.nextLine();

            switch (pilih) {
                case 1:
                    for(int i = 0; i < dsn.length; i++) {
                        System.out.println("Masukkan Data Dosen ke-" + (i + 1));
                        System.out.print("Kode      : ");
                        kode = ike27.nextLine();
                        System.out.print("Nama      : ");
                        nama = ike27.nextLine();

                        Boolean jk = null;
                        while (jk == null) {
                            System.out.print("Jenis Kelamin (L/P): ");
                            jkInput = ike27.nextLine().toUpperCase(); // Konversi ke huruf besar
                            if (jkInput.equals("L")) {
                                jk = true; // Laki-laki
                            } else if (jkInput.equals("P")) {
                                jk = false; // Perempuan
                            } else {
                                System.out.println("Input tidak valid. Harap masukkan L atau P.");
                            }
                        }

                        System.out.print("Usia      : ");
                        usiaStr = ike27.nextLine();
                        usia = Integer.parseInt(usiaStr);
                        System.out.println("---------------------------");
            
                        dsn[i] = new Dosen27(kode, nama, jk, usia);
                    }
            
                    for (Dosen27 d : dsn) {
                        dataDosen.tambah(d);
                    }
            
                    System.out.println();
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.sortASC();
                    dataDosen.tampil();
                    break;
                case 4:
                    dataDosen.sortDESC();
                    dataDosen.tampil();
                    break;
                case 5:
                    System.out.println("Terimakasi:)");
                    break;
                default:
                    System.out.println("Pilihan salah, masukkan ulang.");
                    break;
            }
        } while (pilih != 5);
        ike27.close();
    }
}

