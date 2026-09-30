import java.util.*;
 
public class Main35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
 
            char[] arr = s.toCharArray();
 
            int i = 1;
 
            while (i < arr.length && arr[i] == arr[0]) {
                i++;
            }
 
            if (i == arr.length) {
                System.out.println("NO");
            } else {
                char temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
 
                System.out.println("YES");
                System.out.println(new String(arr));
            }
        }
        sc.close();
    }
}