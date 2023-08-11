import java.util.*;

public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n1,n2,h;
        double a;
        n1 =my.nextInt();
        n2 = my.nextInt();
        h = my.nextInt();
        a = 0.5*(n1+n2)*h;
        System.out.printf("%.4f",a);
    }
}
