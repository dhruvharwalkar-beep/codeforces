import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String vowels="aeiouy";
        String ans="";
        for(int i=0;i<s.length();i++){
            String c=""+s.charAt(i);
            if(!vowels.contains(c)){
                ans+="."+c;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}