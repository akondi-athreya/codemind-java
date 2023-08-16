import java.util.*;
public class code{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int a,b;
        a = my.nextInt();
        b = my.nextInt();
        System.out.printf("Sum:%d", a+b);
        System.out.printf("
Difference:%d" , a-b);
        System.out.printf("
Product:%d", a*b);
        System.out.printf("
Quotient:%d" , a/b);
        System.out.printf("
Remainder:%d", a%b);
    }
}