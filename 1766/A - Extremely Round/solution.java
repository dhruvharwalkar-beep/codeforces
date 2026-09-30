import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i*=10){
                count+=Math.min(9,n/i);
            }
            System.out.println(count);
        }
    }
}