import java.util.Scanner;
import java.util.*;

public class Main{
    
    
    public static int fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
            
        }
        return fact;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("factorial of given no:"+fact(a));
    }
    
}
