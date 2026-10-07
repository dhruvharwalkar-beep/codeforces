import java.util.*;
public class APanoramixSPrediction {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
 
        if (next == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}