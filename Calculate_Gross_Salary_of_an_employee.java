import java.util.*;

public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        double s,hra,da,pf,n;
        s = my.nextDouble();
        hra = my.nextDouble();
        da = my.nextDouble();
        pf = s*(0.12);
        n = pf+s+hra+da;
        System.out.printf("%.2f%n%.2f",pf,n);
    }
}
