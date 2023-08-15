import java.util.*;

public class code{
    public static void main (String[] args) {
        Scanner my = new Scanner(System.in);
        float x1,x2,y1,y2,a,b;
        x1 = my.nextFloat();
        y1 = my.nextFloat();
        x2 = my.nextFloat();
        y2 = my.nextFloat();
        a = (x2-x1)*(x2-x1);
        b = (y2-y1)*(y2-y1);
        System.out.printf("%.4f",Math.sqrt(a+b));
    }
}