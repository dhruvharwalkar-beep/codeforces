import java.util.Scanner;
 
public class main13 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            int rounds = 0;
 
            while (true) {
 
                if (a == b || b == c || a == c) {
                    break;
                }
 
                int largest = Math.max(a, Math.max(b, c));
                int smallest = Math.min(a, Math.min(b, c));
 
                if (a == largest) {
                    a--;
                } else if (b == largest) {
                    b--;
                } else {
                    c--;
                }
 
                if (a == smallest) {
                    a++;
                } else if (b == smallest) {
                    b++;
                } else {
                    c++;
                }
 
                rounds++;
            }
 
            System.out.println(rounds);
        }
 
        sc.close();
    }
}