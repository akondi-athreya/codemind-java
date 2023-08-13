import java.util.*;

public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a,b,c,d;
        a = my.nextInt();
        b = a / 365;
        c = a % 365;
        d = c / 7;
        System.out.println(b);
        System.out.println(d);
    }
}
