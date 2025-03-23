import java.util.Scanner;
import java.util.*;

public class Main{
    
    public static int elementsum(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
            }
        return sum;
    }
    public static void main(String[] args){
        int arr[] = {6,3,2,7,4,9};
        System.out.println("sum of elements:"+elementsum(arr));
    }
}
