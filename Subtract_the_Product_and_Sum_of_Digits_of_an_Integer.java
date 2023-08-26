import java.util.*;
public class code{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int rem,pro=1,sum=0;
        while(n!=0){
            rem = n % 10;
            pro *= rem;
            sum += rem;
            n /= 10;
        }
        System.out.println(pro-sum);
    }
}