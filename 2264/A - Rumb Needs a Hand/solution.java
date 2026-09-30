import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] p = new int[n];
 
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
 
           
            ArrayList<Integer> indices = new ArrayList<>();
 
            for (int i = 0; i < n; i++) {
                if (p[i] != i + 1) {
                    indices.add(i);
                }
            }
 
            
            int left = 0;
            int right = indices.size() - 1;
 
            while (left < right) {
                int i = indices.get(left);
                int j = indices.get(right);
 
                int temp = p[i];
                p[i] = p[j];
                p[j] = temp;
 
                left++;
                right--;
            }
 
          
            boolean sorted = true;
 
            for (int i = 0; i < n; i++) {
                if (p[i] != i + 1) {
                    sorted = false;
                    break;
                }
            }
 
            System.out.println(sorted ? "YES" : "NO");
        }
        sc.close();
    }
}