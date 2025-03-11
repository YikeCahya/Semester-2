//Yulike DN(27/TI-1A)
//FILE INI BERISI DEKLARASI CLASS, KONTRUKTOR, METHOD
package Minggu3.ALSD3;
//digunakan sebagai kelas "kepala"
public class Dosen27 {
    //mendeklarasi attribute
    public String kode;
    public String nama;
    public Boolean jenisKelamin; 
    public int usia;

    //konstruktor berparameter
    public Dosen27(String kode, String nama, Boolean jenisKelamin, int usia) { //namanya sama dengan nama class ini
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
}
