import java.util.*;

public class returnSum{
    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum is: " + result);
    }

    static int sum(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        int s;
        s = a+b;

        return s;
    }
}