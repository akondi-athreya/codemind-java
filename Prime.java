import java.util.*;
public class shinchan{
    public static void main (String[] saske) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int c = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                c+=1;
                break;
            }
        }
        if(c==0) System.out.println("Prime");
    }
}