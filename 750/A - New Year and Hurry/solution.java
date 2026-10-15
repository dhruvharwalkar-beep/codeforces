import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int avaiabletime = 240-k;
        int time = 0;
        int count  = 0;
        for(int i = 1 ; i<=n ; i++){
            int problemtime  = 5*i;
            if(time + problemtime  > avaiabletime ){
                break;
            }
            
            time+= problemtime;
            count++;
            
        }
        System.out.println(count);
        
            
        sc.close();
    }
}