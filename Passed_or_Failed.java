import java.util.*;

public class code{
    public static void main (String[] args) {
        Scanner my = new Scanner(System.in);
        int a,b,c,d,e;
        a = my.nextInt();
        b = my.nextInt();
        c = my.nextInt();
        d = my.nextInt();
        e = my.nextInt();
        if (a>34 && b>34 && c>34 && d>34 && e>34) System.out.println("PASSED");
        else System.out.println("FAILED");
    }
}