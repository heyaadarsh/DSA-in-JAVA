import java.util.*;

public class sum{
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        int s;
        s = a+b;

        System.out.println("Sum = " + s);
    }
}