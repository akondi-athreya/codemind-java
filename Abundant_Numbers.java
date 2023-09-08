import java.util.*;
public class code{
    public static void main(String[] ram){
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int sum=0;
        for(int i=1 ; i<n ; i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum>n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}