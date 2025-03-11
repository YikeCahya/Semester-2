////YulikeDN_27_TI-1A
package Minggu5;

public class pangkat27 {
    public int nilai;
    public int pangkat;

    public pangkat27(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i = 0; i < n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if(n == 1){
            return a;
        } else {
            if(n % 2 == 1){//Ketika hasil ganjil
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else{//Ketika hasil genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }

    int pangkatBF() {
        int hasil = 1;
        for(int i = 0; i < this.pangkat; i++){
            hasil = hasil * this.nilai;
        }
        return hasil;
    }
}
