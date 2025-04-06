/*
Write a program to create a class Product (product_id, product_name, product_cost, 
product_quantity) default and parameterized constructor. Create objectsof class product 
and display the contents of each object and Also display the object count.
*/
import java.util.Scanner;
class Product {
    int pid, pcost, pqu;
    static int cnt = 0;
    String pname;
    Product() {
        pid = 0;
        pname = "";
        pcost = 0;
        pqu = 0;
        cnt++;
    }
    Product(int pid, String pname, int pcost, int pqu) {
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
        this.pqu = pqu;
        cnt++;
    }
    void disp() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Cost: " + pcost);
        System.out.println("Product Quantity: " + pqu);
        System.out.println("------------------------");
    }
}

public class SlipPract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[20];
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Product ID, Name, Cost and Quantity:");
            int pid = sc.nextInt();
            String pname = sc.next();
            int pcost = sc.nextInt();
            int pqu = sc.nextInt();
            p[i] = new Product(pid, pname, pcost, pqu);
        }
        for (int i = 0; i < n; i++) {
            p[i].disp();
        }

        System.out.println("Total number of Product objects: " + Product.cnt);
        sc.close();
    }
}
