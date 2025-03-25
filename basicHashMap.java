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
        System.out.println(m.get("sam"));
    }
    
}
