import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int c=0;
        for(int i=2 ; i<n ; i++){
            if(n%i==0) {
                c=0;
                System.out.print("Not Prime");
                break;
            }
            else{
                c+=1;
            }
        }
        if(c>0) System.out.print("Prime");
    }
}
