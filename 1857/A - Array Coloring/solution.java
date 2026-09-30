import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int odd=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x%2!=0) odd++;
            }
            System.out.println(odd%2==0?"YES":"NO");
        }
    }
}