import java.util.*;
 
public class Main40 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int people = 0;
        int max = 0;
 
        for (int i = 0; i < n; i++) {
 
            int a = sc.nextInt(); // people leaving
            int b = sc.nextInt(); // people entering
 
            people = people - a + b;
 
            if (people > max) {
                max = people;
            }
        }
 
        System.out.println(max);
        sc.close();
    }
}