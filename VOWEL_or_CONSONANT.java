import java.util.*;

public class codemind{
        public static void main(String[] args) {
                Scanner my = new Scanner(System.in);
                char ch = my.next().charAt(0);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') System.out.println("VOWEL");
                else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') System.out.println("VOWEL");
                else System.out.println("CONSONANT");
        }
}