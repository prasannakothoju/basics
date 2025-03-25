import java.util.*;
public class Main{
    
    public static void main(String[] args){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(2,5);
       // map.put(1,4);
        // map.put(8,9);
        // map.put(4,6);
        // map.put(2,7); // repeated the value 
        
        //frequency of values 
        int arr[]= {2,5,3,7,7,8,1};
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int x = arr[i];
            
            if(map.containsKey(x)){
                int prev = map.get(x);
                map.put(x,prev+1);
                
            }else{
                map.put(x,1);
            }
            
        }
        
        //checking whether particualr value present in the value or not
        // if(map.containsKey(13)){
        //     int prev2= map.get(3);
        // }
        
        
        // int n = 1;
        // if(map.containsKey(n)){
        //     int prev = map.get(n);
        //     map.put(n,prev+1);
        // }else{
        //     map.put(n,4);
        // }
        
       
        // int prev = map.get(2);
        // map.put(2,prev+1);
        
        
        // System.out.println(map.get(1)+"");
        // System.out.println(map.get(2)); //prints latest updated value
        
        
        //printing all keys and values
        // for(int sexy :map.keySet()){
        //     System.out.println(sexy+":"+map.get(sexy));
        // }
        
        //or
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        
    }
}
