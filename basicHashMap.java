import java.util.Scanner;
import java.util.*;

public class Main{
    
    static Map<String, String> m = new HashMap<>();
    public static void mapping(){
    m.put("sam","9010880281");
    m.put("Akhil","7386356782");
    m.put("kothoju","9347750325");
    }
    
    public static void main(String[] args){
        mapping();
        
        //to print only 1 value 
        //System.out.println(m.get("sam"));
        
        //if the data is in thousands how to print all?
        // Set<String> keys = m.keySet();
        // for(String i : keys){
        //     System.out.println(i+":"+m.get(i));
        // }
        
        //this is the another method
        Set<Map.Entry<String,String>> values = m.entrySet();
        for(Map.Entry<String,String> e:values ){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        
        
    }
    
}
