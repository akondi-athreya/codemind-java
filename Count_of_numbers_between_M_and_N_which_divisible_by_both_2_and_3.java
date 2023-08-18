import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int m,n,i,c=0;
        m = my.nextInt();
        n = my.nextInt();
        for(i=m ; i<=n ; i++){
            if(i%2==0 && i%3==0) c+=1;
        }
        System.out.print(c);
    }
}
