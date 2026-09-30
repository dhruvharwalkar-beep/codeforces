import java.util.Scanner;
 
public class main17 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
 
            int[] freq = new int[1001];
            int sum = 0;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;
                freq[x]++;
            }
 
            int maxFreq = 0;
            int maxValue = 0;
 
            for (int i = 1; i <= 1000; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxValue = i;
                }
            }
 
            int others = n - maxFreq;
 
            if (maxFreq <= others + 1) {
                System.out.println(sum);
            } else {
                int remaining = maxFreq - (others + 2);
 
                if (remaining < 0) {
                    remaining = 0;
                }
 
                System.out.println(sum - remaining * maxValue);
            }
        }
        sc.close();
    }
}