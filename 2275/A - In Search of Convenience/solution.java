import java.util.*;
 
public class AInSearchOfConvenience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int R = sc.nextInt();
 
            System.out.println((x0 + R) + " " + y0);
        }
        sc.close();
    }
}