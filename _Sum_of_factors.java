import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int sum = 0;
        for(int i=1; i<n ; i++){
            if(n%i==0) sum+=i;
        }
        System.out.println(sum);
    }
}
