import java.util.Collections;
import java.util.Vector;

public class VectorSort {
	public static void main(String args[])
    {
        Vector<String> vector = new Vector<String>();
  
        vector.add("a");
        vector.add("d");
        vector.add("e");
        vector.add("b");
        vector.add("c");
  
        System.out.println("original vector : " + vector);
        Collections.sort(vector);
        System.out.println("sorted vector : " + vector);
    }
}
