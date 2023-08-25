import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int a,b,i,max;
        a = my.nextInt();
        b = my.nextInt();
        max = Math.max(a, b);
        while(true){
            if ((max%a==0) && (max%b==0)){
                System.out.println(max);
                break;
            }
            ++max;
        }
    }
}