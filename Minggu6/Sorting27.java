//Yulike DN (TI-1A/27)
package Minggu6;

public class Sorting27 {
    int[] data;
    int jumData;

    //Konstruktor dengan parameter Data[] dan jmlDat
    Sorting27(int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for(int i = 0; i < jumData; i++){
            data[i] = Data[i];
        }
    }

    //Algoritma bubbleSort
    void bubbleSort() {
        int temp = 0;
        for(int i = 0; i < jumData - 1 ; i++) {
            for(int j = 1; j < jumData - i - 1; j++) {
                if(data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    //Algoritma selectionSort
    void selectionSort() {
        for(int i = 0; i < jumData - 1; i++) {
            int min = i;
            for(int j = i + 1; j < jumData; j++) {
                if(data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }

    //Algoritma insertionSort
    void insertionSort() {
        for(int i = 1; i <= data.length - 1; i++) {
            int temp = data[i];
            int j = i - 1;
            while(j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    //Method untuk menampilkan
    void tampil() {
        for(int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}