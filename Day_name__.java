import java.util.*;
public class code{
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        if(a==1) System.out.print("Monday");
        else if(a==2) System.out.print("Tuesday");
        else if(a==3) System.out.print("Wednesday");
        else if(a==4) System.out.print("Thursday");
        else if(a==5) System.out.print("Friday");
        else if(a==6) System.out.print("Saturday");
        else if(a==7) System.out.print("Sunday");
        else System.out.print("Invalid input");
    }
}