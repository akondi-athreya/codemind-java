import java.util.*;

public class code{
    public static void main (String[] args) {
        Scanner my = new Scanner(System.in);
        int a,b,c;
        a = my.nextInt();
        b = my.nextInt();
        c = my.nextInt();
        if (a+b>c && b+c>a && a+c>b) System.out.println("Valid triangle");
        else System.out.println("Invalid triangle");
    }
}