import java.util.*;
public class code{
    public static void main(String[] thor){
        Scanner my = new Scanner(System.in);
        int n,a,b,i,j;
        n = my.nextInt();
        a = my.nextInt();
        b = my.nextInt();
        for(i=a;i<=b;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}