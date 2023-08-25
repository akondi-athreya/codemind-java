import java.util.*;
public class code{
    public static void main (String[] zoro) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int i,sum = 0;
        for(i=1 ; i<n ; i++){
            if(n%i==0) sum+=i;
        }
        if(sum==n) System.out.println("PERFECT");
        else if(sum<n) System.out.println("DEFICIENT");
        else if(sum>n) System.out.println("ABUNDANT");
    }
}