import java.util.*;
public class code{
    public static void main(String[] kalki) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        for(int i=3 ; i<=n ; i++){
            a[i] = a[i-1]+a[i-2]+a[i-3];
        }
        System.out.println(a[n]);
    }
}
