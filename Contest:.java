import java.util.*;

public class code{
    public static void main (String[] args) {
        Scanner my = new Scanner(System.in);
        int a,b,c;
        a = my.nextInt();
        b = my.nextInt();
        c = my.nextInt();
        if (b+(c*2) >= a) System.out.println("Qualify");
        else System.out.print("Not Qualify");
    }
}