import java.util.*;

public class codemind{
        public static void main (String[] args) {
                Scanner my = new Scanner(System.in);
                int a,b,c;
                a = my.nextInt();
                b = my.nextInt();
                c = my.nextInt();
                if(a>b && a>c) System.out.println(a);
                else if(b>a && b>c) System.out.println(b);
                else System.out.println(c);
        }
}