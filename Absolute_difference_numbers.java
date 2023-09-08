import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        String n = my.next();
        int m = my.nextInt();
        String b1 = n.substring(0,m);
        String b2 = n.substring(n.length()-m);
        int a = Integer.parseInt(b1);
        int b = Integer.parseInt(b2);
        System.out.println(Math.abs(a-b));
    }
}