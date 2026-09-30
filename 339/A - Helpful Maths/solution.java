import java.util.*;
 
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        char[] a = s.replace("+", "").toCharArray();
 
        Arrays.sort(a);
 
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print("+");
            }
 
            System.out.print(a[i]);
        }
        sc.close();
    }
}