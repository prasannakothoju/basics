import java.util.Scanner;
import java.util.*;

public class Main{
    
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>(); //intialize hashmap
        int arr[] = {1,5,8,0,1,8,1,5,1};
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int x = arr[i];
            
            if(map.containsKey(x)){
                int prev = map.get(x);
                map.put(x,prev+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){ //imp line
            System.out.println(e.getKey()+"->"+e.getValue());
        }
    }
}
