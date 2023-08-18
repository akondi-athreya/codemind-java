import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int pro = 1;
        for(int i=n ; i>=1 ; i--){
            pro*=i;
        }
        System.out.println(pro);
    }
}
