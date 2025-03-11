//Yulike Dwi N (27/TI-1A)
public class caffemain27 {
    public static void main(String[] args) {

        caffe27[] arrayOfCaffe = new caffe27[4];

        arrayOfCaffe[0] = new caffe27("Kopi Luwak", 20000, 1);
        arrayOfCaffe[1] = new caffe27("Espresso", 15000, 2);
        arrayOfCaffe[2] = new caffe27("Latte", 18000, 1);
        arrayOfCaffe[3] = new caffe27("Cappuccino", 22000, 3);

        for (caffe27 order : arrayOfCaffe) {
            order.menampilkanPesanan();
            System.out.println();
        }
    }
}
