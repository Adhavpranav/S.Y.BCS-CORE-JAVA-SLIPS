/* Create an employee class(id,name,deptname,salary). Define a default and 
parameterized constructor. Use ‘this’ keyword to initialize instance variables. 
Keep a count of objects created. Create objects using parameterized constructor 
and display the object count after each object is created.(Use static member and 
method). Also display the contents of each object.
*/
import java.util.*;

class employee {
    int id, sal;
    String dname, name;
    static int cnt = 0;

    employee() {
        id = 0;
        name = "";
        dname = "";
        sal = 0;
    }

    employee(int id, String name, String dname, int sal) {
        this.id = id;
        this.name = name;
        this.dname = dname;
        this.sal = sal;
        cnt++;
        System.out.println("Object count after creating employee: " + cnt);
    }

    static int count() {
        return cnt;
    }

    void disp() {
        System.out.println("\nEmp ID: " + id);
        System.out.println("Emp Name: " + name);
        System.out.println("Emp Dept: " + dname);
        System.out.println("Emp Salary: " + sal);
    }
}

public class slippract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, id, sal;
        String dname, name;

        System.out.print("Enter number of employees: ");
        n = sc.nextInt();

        employee[] e = new employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Employee ID, Name, Department, Salary: ");
            id = sc.nextInt();
            name = sc.next();
            dname = sc.next();
            sal = sc.nextInt();
            e[i] = new employee(id, name, dname, sal);
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            e[i].disp();
        }

        System.out.println("\nTotal number of Employee objects created: " + employee.count());
        sc.close();
    }
}
