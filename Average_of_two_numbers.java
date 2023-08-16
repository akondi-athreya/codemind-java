import java.util.*;

public class codemind{
        public static void main(String[] args) {
                Scanner my = new Scanner(System.in);
                float x = my.nextFloat();
                float y = my.nextFloat();
                float a = (x+y)/2;
                System.out.printf("Average of %.0f and %.0f is: %.2f",x,y,a);
        }
}