import java.util.*;

public class code{
    public static void main (String[] args) {
        Scanner my = new Scanner(System.in);
        int a,b,c;
        a = my.nextInt();
        b = my.nextInt();
        c = my.nextInt();
        if(a==b && b==c) System.out.println("Equilateral triangle");
        else if(a==b || b==c || a==c) System.out.println("Isosceles triangle");
        else System.out.println("Scalene triangle");
    }
}