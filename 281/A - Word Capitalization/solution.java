import java.util.*;
 
public class Main29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        String first = s.substring(0, 1).toUpperCase();
        String rest = s.substring(1);
 
        System.out.println(first + rest);
        sc.close();
    }
}