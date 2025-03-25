import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Initialize HashMap

        // Create an array
        int arr[] = {2, 3, 1, 9, 3, 1, 3, 9};
        int n = arr.length;

        // Store unique elements in HashMap
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            map.put(x, 1); // Only storing unique values
        }

        // Convert unique keys to a List
        List<Integer> uniqueList = new ArrayList<>(map.keySet());

        // Print the list
        System.out.println(uniqueList);
    }
}
