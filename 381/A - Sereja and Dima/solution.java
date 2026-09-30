import java.util.*;
 
public class Main36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int left = 0;
        int right = n - 1;
        
        int sereja = 0;
        int dima = 0;
 
        boolean turn = true;
 
        while (left <= right) {
 
            int pick;
 
            if (a[left] > a[right]) {
                pick = a[left];
                left++;
            } else {
                pick = a[right];
                right--;
            }
 
            if (turn) {
                sereja += pick;
            } else {
                dima += pick;
            }
 
            turn = !turn;
        }
 
        System.out.println(sereja + " " + dima);
        sc.close();
    }
}