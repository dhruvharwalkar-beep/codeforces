import java.util.*;
 
public class ADubstep{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("WUB"," ");
        s=s.trim().replaceAll("\\s+"," ");
        System.out.println(s);
    }
}