import java.util.*;
public class codemind {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        double gs,bs,da=1,hra=1;
        bs = my.nextDouble();
        if (bs<=10000){
            da = 0.80*bs;
            hra = 0.20*bs;
        }
        else if (bs<=20000){
            da = 0.90*bs;
            hra = 0.25*bs;
        }
        else if (bs>20000){
            da = 0.95*bs;
            hra = 0.30*bs;
        }
        gs = bs + da + hra;
        System.out.printf("%.2f",gs);
    }
}
