//Yulike Dwi N (27/TI_1A)
public class caffe27 {
    public String nama;
    public double harga;
    public int jumlah;

    
    public caffe27(String nm, double harga, int jml) {
        nama = nm;
        this.harga = harga;
        jumlah = jml;
    }

    void menampilkanPesanan() {
        System.out.println("====Item yang dipesan===");
        System.out.println("Nama item: " + nama);
        System.out.println("Jumlah item: " + jumlah);

        System.out.println("Total harga: " + menampilkanTotal());
    }

    double menampilkanTotal() {
        return harga * jumlah;
    }
}



