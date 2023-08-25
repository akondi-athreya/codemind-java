import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int a,b;
        double sum=0;
        a = my.nextInt();
        b = my.nextInt();
        for(double i=a ; i<=b ; i++) {
            sum += Math.sqrt(i);
        }
        System.out.printf("%.2f",sum);
    }
}