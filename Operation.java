package Operation;
import java.util.*;

public class Addition {
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Addition = " + sum);
    }

    public void subtract() {
        System.out.println("Enter two float values: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result = a - b;
        System.out.println("Subtraction = " + result);
    }
}

public class Maximum {
    Scanner sc = new Scanner(System.in);

    public void max() {
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}

import Operation.*;

public class MainApp {
    public static void main(String[] args) {
        Addition a = new Addition();
        Maximum m = new Maximum();

        a.add();
        a.subtract();
        m.max();
    }
}
