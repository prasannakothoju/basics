//finding largest number in a array
import java.util.Scanner;
import java.util.*;

public class Main{
    
    public static int sort(int[] arr){
        Arrays.sort(arr); // pass the array inorder to get sorted
        
        return arr[arr.length-1];
        
    }
    
    public static void main(String[] args){
        int arr1[] ={8,3,2,0,7};
        System.out.println("largest no in arr1:"+sort(arr1));
        int arr2[] = {5,9,3,8};
        System.out.println("largest no in arr2:"+sort(arr2));
    }
        
    
}
