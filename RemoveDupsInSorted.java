import java.util.Scanner;
import java.util.*;

public class Main{
    
    public static int dupsremove(int[] arr){
        int i=0;
        int n = arr.length;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                i++;
                 arr[i]=arr[j];
            }
            
        }
        return i+1; // skip the element
    }
    
    public static void main(String[] args){
        int[] arr = {1,1,3,3,2,4,1};
        Arrays.sort(arr);
        System.out.println("after sorting:"+Arrays.toString(arr));
      int newLength = dupsremove(arr);
        System.out.println("After removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
        
}
