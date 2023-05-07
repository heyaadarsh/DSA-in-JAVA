import  java.util.*;
public class userInputSum{
    public static void main(String args[]){
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = "+ sum);
    }
}