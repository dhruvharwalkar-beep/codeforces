import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Stack<Integer> memory = new Stack<>();
            boolean[] notPrinted = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                char c = s.charAt(i - 1);
                if (c == '1') {
                    memory.push(i);
                } else if (c == '2') {
                    if (!memory.isEmpty()) {
                        memory.pop();
                        notPrinted[i] = true;
                    }
                }
            }
            while (!memory.isEmpty()) {
                notPrinted[memory.pop()] = true;
            }
 
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (notPrinted[i]) {
                    count++;
                    sb.append(i).append(" ");
                }
            }
            System.out.println(count);
            System.out.println(sb);
        }
    }
}