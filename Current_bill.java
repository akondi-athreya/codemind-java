import java.util.*;

public class codemind{
        public static void main (String[] args) {
                Scanner my = new Scanner(System.in);
                int a = my.nextInt();
                double units,bill,z=0;
                if(a<=199) units=1.20;
                else if(a>200 && a<400) units = 1.50;
                else if(a>400 && a<600) units = 1.80;
                else units = 2.00;
                bill = a * units;
                if(bill>400) z=bill*0.15;
                else if(bill<400) bill+=100;
                System.out.printf("%.2f",z+bill);
        }
}