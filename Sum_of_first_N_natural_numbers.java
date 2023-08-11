import java.util.*;
public class code{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int sum=0;
        for(int i=n;i>=1;i--){
            sum+=i;
        }
        System.out.print(sum);
    }
}