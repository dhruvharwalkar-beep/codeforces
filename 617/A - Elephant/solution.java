import java.util.*;
 
public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int x = sc.nextInt();
 
        int moves = (x + 4) / 5;
 
        System.out.println(moves);
        sc.close();
    }
}