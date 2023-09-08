import java.util.*;
public class code{
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int M = my.nextInt();
        int N = my.nextInt();
        boolean p1Wins = canWin(M) || canWin(N);
        if (p1Wins) {
            System.out.println("Player 1");
        } else {
            System.out.println("Player 2");
        }
    }
    static boolean canWin(int n) {
        return n%2==0;
    }
}
