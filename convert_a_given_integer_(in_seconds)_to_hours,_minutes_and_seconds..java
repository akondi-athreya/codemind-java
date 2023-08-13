import java.util.*;

public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int s = my.nextInt();
        int h,m;
        h = s / 3600;
        s %= 3600;
        m = s / 60;
        s %= 60;
        System.out.printf("H:M:S-%d:%d:%d",h,m,s);
    }
}
