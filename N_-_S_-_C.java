import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int a,b,i;
        a = my.nextInt();
        b = my.nextInt();
        for(i=a+1;i<b;i++){
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
    }
}