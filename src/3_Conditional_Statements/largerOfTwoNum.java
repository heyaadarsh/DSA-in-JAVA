import java.util.*;

public class largerOfTwoNum {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        a = sc.nextInt();
        System.out.print("Enter the second num: ");
        b = sc.nextInt();

        if(a > b){
            System.out.println("The first number is greater i.e. " + a);
        }
        else if(a==b){
            System.out.println("Both the numbers are equal");
        }
        else{
            System.out.println("The second number is greater i.e. " + b);
        }
    }
}