import java.util.Scanner;
 
public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n;
        n = sc.nextInt();
 
        int count = 0;
 
        for (int i = 0; i < n; i++) {
            int Dhruv = sc.nextInt();
            int Harsha =sc.nextInt();
            int Soham = sc.nextInt();
 
            if (Dhruv + Harsha + Soham >= 2) {
                count++;
 
            }
 
        }
 
        System.out.println(count);
        sc.close();
 
    }
}