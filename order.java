/* Create an abstract class “order” having members id, description. Create two subclasses 
“PurchaseOrder” and “Sales Order” having members customer name and Vendor name 
respectively. Definemethods accept and display in all cases. Create 3 objects each of 
Purchase Order and Sales Order and accept and display details. 
 */
import java.util.Scanner;

abstract class Order {
    protected int id;
    protected String description;
    Scanner sc = new Scanner(System.in);
    
    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;
    
    void accept() {
        System.out.print("\nENTER PURCHASE ORDER ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER DESCRIPTION: ");
        description = sc.nextLine();
        System.out.print("ENTER CUSTOMER NAME: ");
        customerName = sc.nextLine();
    }
    
    void display() {
        System.out.println("\nPURCHASE ORDER IS: " + id);
        System.out.println("ORDER DESCRIPTION IS: " + description);
        System.out.println("CUSTOMER NAME IS: " + customerName);
    }
}

class SalesOrder extends Order {
    private String vendorName;
    
    void accept() {
        System.out.print("\nENTER SALES ORDER ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER DESCRIPTION: ");
        description = sc.nextLine();
        System.out.print("ENTER VENDOR NAME: ");
        vendorName = sc.nextLine();
    }
    
    void display() {
        System.out.println("\nSALES ORDER IS: " + id);
        System.out.println("ORDER DESCRIPTION IS: " + description);
        System.out.println("VENDOR NAME IS: " + vendorName);
    }
}

public class Sale_pur {
    public static void main(String[] args) {
        PurchaseOrder[] pur_ord = new PurchaseOrder[3];
        SalesOrder[] sal_ord = new SalesOrder[3];
        
        System.out.println("ENTER DETAILS OF PURCHASE ORDER: ");
        for (int i = 0; i < 3; i++) {
            pur_ord[i] = new PurchaseOrder();
            pur_ord[i].accept();
        }
        
        System.out.println("ENTER DETAILS OF SALES ORDER: ");
        for (int i = 0; i < 3; i++) {
            sal_ord[i] = new SalesOrder();
            sal_ord[i].accept();
        }
        
        System.out.println("DETAILS OF PURCHASE ORDER: ");
        for (PurchaseOrder purchaseOrder : pur_ord) {
            purchaseOrder.display();
        }
        
        System.out.println("DETAILS OF SALES ORDER: ");
        for (SalesOrder salesOrder : sal_ord) {
            salesOrder.display();
        }
    }
}
