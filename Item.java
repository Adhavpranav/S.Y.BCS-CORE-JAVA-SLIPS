/* Define a Item class (item_number, item_name, item_price). Define a default and 
parameterized constructor. Keep a count of objects created. Create objects using 
parameterized constructor and display the object count after each object is 
created.(Use static member and method). Also display the contents of each object.
*/

import java.util.Scanner;

class Item{
    int item_number;
    String item_name;
    int item_price;
    static int count=0;
    Item() {
        item_number = 0;
        item_name = "Unknown";
        item_price = 0;
        count++;
    }

    Item( int item_number,String item_name,int item_price){
        this.item_number=item_number;
        this.item_name=item_name;
        this.item_price=item_price;
        count++;
        dispcount();
    }
    static void  dispcount(){
        System.out.println("OBJECT COUNT IS: "+count);
    }
    void display()
    {
        System.out.println("ITEM NUMBER:"+item_number);
        System.out.println("ITEM NAME:"+item_name);
        System.out.println("ITEM PRICE:"+item_price);
    }
}
public class Item_prog{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A LIMIT:");
        int limit=sc.nextInt();
        Item obj[]=new Item[limit];
        for(int i=0;i<limit;i++)
        {
            System.out.print("ENTER ITEM NUMBER:");
            int item_number=sc.nextInt();
            System.out.print("ENTER ITEM NAME:");
            String item_name=sc.next();
            System.out.print("ENTER ITEM PRICE:");
            int item_price=sc.nextInt();
            obj[i]=new Item(item_number, item_name, item_price);
        }
        System.out.println("\nITEM DETAILS:");
        for (int i = 0; i < limit; i++) {
            obj[i].display();
        }
        sc.close();
    }
}
