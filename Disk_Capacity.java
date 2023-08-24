import java.util.*;
public class code{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int t,s,b;
        t = my.nextInt();
        s = my.nextInt();
        b = my.nextInt();
        int a = b*512;
        int c = a*s;
        int d = c*t;
        System.out.print(d*2);
    }
}