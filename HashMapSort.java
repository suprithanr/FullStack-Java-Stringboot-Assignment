import java.util.*;
class HashMapSort {
 
    static Map<String, Integer> map = new HashMap<>();
 
    public static void sortbykey()
    {
        ArrayList<String> sortedKeys
            = new ArrayList<String>(map.keySet());
 
        Collections.sort(sortedKeys);
 
        for (String x : sortedKeys)
            System.out.println("Key = " + x
                               + ", Value = " + map.get(x));
    }
 
    public static void main(String args[])
    {
        map.put("mysore", 1);
        map.put("banglore", 2);
        map.put("indore", 3);
        map.put("pune", 4);
 
        sortbykey();
    }
}