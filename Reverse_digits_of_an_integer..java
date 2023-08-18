import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int rem=0,rev=0;
        while(n!=0){
            rem = n %10;
            rev = rev * 10 + rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
