//checking whether given number is a plaindrome or not like abba == abba 

import java.util.Scanner;
import java.util.*;

public class Main{
    
    //create a function accordingly
    public static boolean check(int n){
        int rev =0;
        int original = n;
        
        while(n>0){
            int num = n%10;
            rev = rev * 10+num;
            n = n/10;
        }
        if(original == rev){
            return true;
        }
        else{
            return false;
        }
    }
    
    //write main function
    public static void main(String[] args){
        int n = 111;
        System.out.println("Given no:"+n);
        System.out.println("Given no is a palindrome: "+check(n));
    }
}
    



    
