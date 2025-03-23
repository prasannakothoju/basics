//finding second smallest and second largest in an array

import java.util.Scanner;
import java.util.*;

public class Main{
    
    public static int sortsmall(int[] arr){
        Arrays.sort(arr);
        return arr[1];
    }
    
    public static int sortlarge(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    
    public static void main(String[] args){
        int arr[]= {6,8,2,5,3};
        System.out.println("second smallest:"+sortsmall(arr));
        System.out.println("second largest:"+sortlarge(arr));
    }
}
