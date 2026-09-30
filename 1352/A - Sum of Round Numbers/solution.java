import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            ArrayList<Integer> ans = new ArrayList<>();
 
            int place = 1;
 
            while (n > 0) {
                int digit = n % 10;
 
                if (digit != 0) {
                    ans.add(digit * place);
                }
 
                n = n / 10;
                place = place * 10;
            }
 
            System.out.println(ans.size());
 
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}