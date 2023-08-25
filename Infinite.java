import java.util.*;
public class codemind{
    public static void main(String[] args){
        Scanner my = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<>();
        while (true) {
            int i = my.nextInt();
            if (i == -1) {
                break;
            }
            aList.add(i);
        }
        for (int i : aList) {
            System.out.println(i*i);
        }
    }
}