import java.util.Scanner;
import java.util.*;

public class Main{
    
    
    
    public static int RevNum(int n){
        int rev = 0;  //declare its initialization within a function
        
        while(n>0){
            int num = n%10; //to obtain the last digit 
            rev = rev*10+num;  // return this rev
            n = n/10;
        }
        return rev;
    }
    
    public static void main(String[] args){
        int n = 1234;
        System.out.println("Given number:"+n);
        int revnum = RevNum(n);
        System.out.println("The reverse of a no:"+revnum);
        
    }
}
