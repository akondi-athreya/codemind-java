import java.util.*;
public class code{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int sum=0,i,n = my.nextInt();
        for(i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}