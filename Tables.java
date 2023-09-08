import java.util.*;
public class code{
    public static void main(String[] hulk){
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int m = my.nextInt();
        for(int i=1 ; i<=m ; i++){
            if(i%2==0){
                continue;
            }
            else{
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }
    }
}