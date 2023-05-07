import java.util.*;
public class productsOfNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a = sc.nextInt();
        System.out.println("Enter the second num: ");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("The product of the numbers is: " + mul);
    }
}