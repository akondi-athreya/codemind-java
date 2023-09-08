import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        String a = my.next();
        StringBuilder rev = new StringBuilder(a).reverse();
        String b = rev.toString();
        if(a.equals(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}