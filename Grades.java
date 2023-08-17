import java.util.*;

public class code{
        public static void main (String[] args) {
                Scanner my = new Scanner(System.in);
                int a,b,c,d,e;
                a = my.nextInt();
                b = my.nextInt();
                c = my.nextInt();
                d = my.nextInt();
                e = my.nextInt();
                double per = (double) (a + b + c + d + e) / 500;
                if(per*100 >= 90) System.out.println("Grade A");
                else if(per*100 >=80) System.out.println("Grade B");
                else if(per*100 >=70) System.out.println("Grade C");
                else if(per*100 >=60) System.out.println("Grade D");
                else if(per*100 >=40) System.out.println("Grade E");
                else System.out.println("Grade F");
                
        }
}