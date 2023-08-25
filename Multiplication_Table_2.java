import java.util.*;
public class code{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int a,b,i;
        a = my.nextInt();
        b = my.nextInt();
        for(i=1 ; i<=b ; i++){
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}