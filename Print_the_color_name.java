import java.util.*;

public class codemind{
        public static void main (String[] args) {
                Scanner my = new Scanner(System.in);
                String ch = my.next();
                if(ch.equals("V")) System.out.println("Violet");
                else if(ch.equals("I")) System.out.println("Indigo");
                else if(ch.equals("B")) System.out.println("Blue");
                else if(ch.equals("G")) System.out.println("Green");
                else if(ch.equals("Y")) System.out.println("Yellow");
                else if(ch.equals("O")) System.out.println("Orange");
                else if(ch.equals("R")) System.out.println("Red");
                else System.out.println("-1");
        }
}