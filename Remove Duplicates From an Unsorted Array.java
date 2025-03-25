import java.util.*;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(); //intialize
        
        //create an array in qtn
        int arr[] = {2,3,1,9,3,1,3,9};
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int x = arr[i];
            
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            
        }
      // Convert unique keys to a List
        List<Integer> newList = new ArrayList<>(map.keySet());

        // Print the list
        System.out.println(newList);
        
    }
}
