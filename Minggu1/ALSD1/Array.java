import java.util.Scanner;

public class Array {

    public static String konversiNilaiHuruf27(double nilai27) {
        if (nilai27 > 80) return "A";
        else if (nilai27 > 73) return "B+";
        else if (nilai27 > 65) return "B";
        else if (nilai27 > 60) return "C+";
        else if (nilai27 > 50) return "C";
        else if (nilai27 > 39) return "D";
        else return "E";
    }

    public static double nilaiHurufKeBobot27(String nilaiHuruf27) {
        switch (nilaiHuruf27) {
            case "A": return 4.00;
            case "B+": return 3.50;
            case "B": return 3.00;
            case "C+": return 2.50;
            case "C": return 2.00;
            case "D": return 1.00;
            case "E": return 0.00;
            default: return 0.00;
        }
    }

    public static void main(String[] args) {
        Scanner ike27 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK27 = ike27.nextInt();
        ike27.nextLine();
        
        String[][] mataKuliah27 = new String[jumlahMK27][3];
        int[] sks27 = new int[jumlahMK27];
        double totalBobotSks27 = 0;
        int totalSks27 = 0;
        
        for (int i = 0; i < jumlahMK27; i++) {
            System.out.println("\nMata Kuliah " + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            mataKuliah27[i][0] = ike27.nextLine();
            System.out.print("Bobot SKS: ");
            sks27[i] = ike27.nextInt();
            ike27.nextLine();
            System.out.print("Nilai Angka: ");
            double nilaiAngka27 = ike27.nextDouble();
            ike27.nextLine();
            
            mataKuliah27[i][1] = konversiNilaiHuruf27(nilaiAngka27);
            double bobotNilai27 = nilaiHurufKeBobot27(mataKuliah27[i][1]);
            mataKuliah27[i][2] = String.valueOf(bobotNilai27);
            totalBobotSks27 += bobotNilai27 * sks27[i];
            totalSks27 += sks27[i];
        }
        
        double ipSemester27 = (totalSks27 > 0) ? totalBobotSks27 / totalSks27 : 0.00;
        
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("Mata Kuliah               SKS     Nilai Huruf     Bobot");
        for (int i = 0; i < jumlahMK27; i++) {
            System.out.println(mataKuliah27[i][0] + "               " + sks27[i] + "     " + mataKuliah27[i][1] + "     " + mataKuliah27[i][2]);
        }
        
        System.out.println("\nIP Semester: " + ipSemester27);
    }
}
