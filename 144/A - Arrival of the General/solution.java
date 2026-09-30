import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] a = new int[n];
 
        int maxIndex = 0;
        int minIndex = 0;
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
 
            // First tallest
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
 
            // Last shortest
            if (a[i] <= a[minIndex]) {
                minIndex = i;
            }
        }
 
        int answer = maxIndex + (n - 1 - minIndex);
 
        if (maxIndex > minIndex) {
            answer--;
        }
 
        System.out.println(answer);
 
        sc.close();
    }
}