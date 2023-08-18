import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        for(int i=2*n ; i>=2 ; i--){
            if(i%2==0) System.out.print(i + " ");
        }
    }
}
