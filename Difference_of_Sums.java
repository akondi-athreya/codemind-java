import java.util.*;
public class code{
    public static void main(String[] ayyo){
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int sum=0,sum1=0;
        for (int i = 1 ; i<=n ; i++){
            sum+=i;
            sum1+=i*i;
        }
        System.out.println(sum*sum-sum1);
    }
}