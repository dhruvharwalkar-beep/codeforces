import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt();
            int count=0,num=0;
            while(count<k){
                num++;
                if(num%3!=0&&num%10!=3) count++;
            }
            System.out.println(num);
        }
    }
}