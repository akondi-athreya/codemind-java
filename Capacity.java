import java.util.Scanner;

public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        float a,b,c,d;
        a = my.nextFloat();
        b = my.nextFloat();
        c = my.nextFloat();
        d = 2*a*b*c*512;
        System.out.printf("%.0f KB",d/1024);
    }
}
