import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int a,b,i,gcd = 0;
        a = my.nextInt();
        b = my.nextInt();
        for(i=1 ; i<=a && i<=b ; ++i){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}