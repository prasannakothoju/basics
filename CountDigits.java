//first step is to import libraries
import java.util.Scanner;
import java.util.*;

//2nd step create class
public class Main{
    
    //create a function according to the qtn need
    
    public static int countDigits(int n){  // pass the parameter
    int c= 0;
    
    while(n>0){
        c= c+1;
        n= n/10;
    }
        return c;
    }
    
    //writing and executing main function
    
    public static void main(String[] args){
        int n = 12345;
        
        System.out.println("Given number:"+n);
        int digits = countDigits(n);
        System.out.println("No of digits in a number:"+digits);
        
    }
}
