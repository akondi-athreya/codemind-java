import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int rem=0,rev=0;
        int temp=n;
        while(n!=0){
            rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        if(rev==temp) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
