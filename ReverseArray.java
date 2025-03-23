import java.util.Scanner;
import java.util.*;

public class Main{
    //creating reverse function
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
        }
    public static void main(String[] args){
        int arr[] = {1,6,7,2,6,3};
        System.out.println("Original array:"+Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reverse array:"+Arrays.toString(arr));
    }
}
