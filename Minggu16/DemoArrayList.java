import java.util.ArrayList;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(); //Dapat diinstansiasi tanpa harus menentukan size di awal

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(2, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        //Object baru bisa ditambahkan walaupun melebihi kapasitas array, dan berada pada posisi terakhir
        customers.add(new Customer(4, "Cica"));

        //Menambahkan object baru pada index tertentu
        customers.add(2, new Customer(100, "Rosa"));
        //Index dimulai dari 0

        //Untuk mengetahui posisi dari suatu object, menggunakan method indexOf()
        System.out.println(customers.indexOf(customer2));

        //Mengembalikan object pada index tertentu, menggunakan method get()
        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        //Menambah sekumpulan customer baru secara sekaligus
        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Vector"));
        newCustomers.add(new Customer(203, "Sarah"));

        customers.addAll(newCustomers);
        System.out.println(customers);

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        customers.sort((c1,c2)-> c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}
