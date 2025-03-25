//Yulike DN (27/TI-1A)
package Minggu7;

import java.util.Scanner;

public class DsnMain {
    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        
        DataDsn27 dataDosen = new DataDsn27();
        Dsn27[] dsn = new Dsn27[5];
        String kode, nama, jkInput, usiaStr;
        int pilih, usia;

        do {
            System.out.println("====== Data Dosen =======");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Soting ASC");
            System.out.println("4. Sorting DESC");
            System.out.println("5. Cari Data Dosen (Berdasarkan nama)");
            System.out.println("6. Cari Data Dosen (Berdasarkan usia)");
            System.out.println("7. Keluar");
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
            
                        dsn[i] = new Dsn27(kode, nama, jk, usia);
                    }
            
                    for (Dsn27 d : dsn) {
                        dataDosen.tambah(d);
                    }
            
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nData Dosen:");
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.sortASC();
                    System.out.println("Data setelah sorting ASC (berdasrkan usia)");
                    System.out.println("==========================================");
                    dataDosen.tampil();
                    break;
                case 4:
                    dataDosen.sortDESC();
                    System.out.println("Data setelah sorting DESC (berdasrkan usia)");
                    System.out.println("==========================================");
                    dataDosen.tampil();
                    break;
                case 5:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = ike27.nextLine();
                    System.out.println("================================");
                    System.out.println("Menggunakan sequential searching");
                    int posisi = dataDosen.PencarianDataSequential27(cariNama);
                    dataDosen.tampilDataSearch(cariNama, posisi);
                    System.out.println("================================");
                    System.out.println();
                    break;
                case 6:
                    dataDosen.sortASC();
                    System.out.print("Masukkan usia yang dicari: ");
                    int cariUsia = 0;
                    cariUsia = ike27.nextInt();
                    System.out.println("================================");
                    System.out.println("Menggunakan binary searching");
                    ike27.nextLine();

                    int pos = dataDosen.PencarianDataBinary27(cariUsia, 0, dataDosen.idx - 1);
                    if(pos != -1) {
                        System.out.println("Data ditemukan");
                        dataDosen.tampilDataSearch(dataDosen.dataDosen[pos].nama, pos);
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    System.out.println("===============================");
                    System.out.println();
                    break;
                    //dataDosen.tampil();
                case 7:
                    System.out.println("Terimakasi:)");
                    break;
                default:
                    System.out.println("Pilihan salah, masukkan ulang.");
                    break;
            }
        } while (pilih != 7);
        ike27.close();
    }
}
