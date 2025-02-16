import java.util.*;
public class Main{
    public static void main(String[] arhs){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0;i<n;i++){
            int a = s.nextInt();
            String str = s.next();
            int x = solve(str);
            System.out.println(x);
        }
    }
    public static int solve(String str){
        int count = 0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1))count++;
        }
        return str.charAt(0)=='1'?count+1:count;
    }
}