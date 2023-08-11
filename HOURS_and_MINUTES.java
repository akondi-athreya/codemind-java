import java.util.*;

public class code{
    public static void main (String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        if(n<60){
            System.out.print("0 Hour(s) "+n+" Minute(s)");
        }
        else{
            int a = n/60;
            int b = n%60;
            System.out.println(a+" Hour(s) "+b+" Minute(s)");
        }
    }
}