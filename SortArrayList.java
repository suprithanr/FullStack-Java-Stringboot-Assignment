import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args){
	        ArrayList<String> al = new ArrayList<String>();
	        al.add("green");
	        al.add("yellow");
	        al.add("pink");
	        al.add("red");
	        al.add("blue");
	        
	        System.out.println("List before the use of" +
                    " Collection.sort() :" + al);

	        Collections.sort(al);
	  
	        System.out.println("List after the use of" +
	                           " Collection.sort() :" + al);
	    }
	}


