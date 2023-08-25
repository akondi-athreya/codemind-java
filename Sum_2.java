import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        int a,b,x,y,sum=0;
        a = my.nextInt();
        b = my.nextInt();
        x = my.nextInt();
        y = my.nextInt();
        for(int i=a ; i<=b ; i++){
            if(i%x==0 && i%y!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}