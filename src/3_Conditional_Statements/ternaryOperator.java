public class ternaryOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int bool = (5>10)? 5:10;
        System.out.println(bool);

        String str = (b%2==0)? "Even":"Odd";
        System.out.println(str);
    }
}