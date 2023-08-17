import java.util.*;
public class code{
    public static void main (String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        int b = my.nextInt();
        if (a<b) System.out.println("Profit");
        else if(a==b) System.out.println("No profit and No loss");
        else System.out.println("Loss");
    }
}