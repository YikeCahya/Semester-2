//Yulike DN (244107020146_TI-1A)
public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa27(){

    }

    public Mahasiswa27(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.printf("%-10s %-12s %-6s %.1f\n", nama, nim, kelas, ipk);
    }
}
