import java.util.*;
public class code{
    public static void main(String[] hulk){
        Scanner my = new Scanner(System.in);
        int a,b;
        a = my.nextInt();
        b = my.nextInt();
        for(int i=a ; i<=b ; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}