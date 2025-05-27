import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan antrian = new AntrianKendaraan();
        QueueTransaksi riwayat = new QueueTransaksi(100);

        int pilih;
        do {
            System.out.println("\n=== MENU SPBU ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Jumlah Kendaraan dalam Antrian");
            System.out.println("4. Layani Kendaraan dan Catat Transaksi");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Tipe Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Merk Kendaraan: ");
                    String merk = sc.nextLine();
                    antrian.tambahAntrian(new Kendaraan(plat, tipe, merk));
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");             
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println(">> Jumlah dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 4:
                    Kendaraan k = antrian.layaniKendaraan();
                    if (k == null) {
                        System.out.println("Antrian kosong.");
                        break;
                    }
                    System.out.println("Petugas melayani " + k.platNomor);
                    System.out.print("Masukkan Jenis BBM: ");
                    String namaBBM = sc.nextLine();
                    System.out.print("Masukkan Harga per liter: ");
                    double harga = sc.nextDouble();
                    System.out.print("Masukkan Jumlah liter: ");
                    double liter = sc.nextDouble();
                    BBM bbm = new BBM(namaBBM, harga);
                    TransaksiPengisian transaksi = new TransaksiPengisian(k, bbm, liter);
                    riwayat.enqueue(transaksi);
                    System.out.println(">> Transaksi berhasil dicatat.");
                    break;
                case 5:
                    riwayat.tampilkanRiwayat();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}
