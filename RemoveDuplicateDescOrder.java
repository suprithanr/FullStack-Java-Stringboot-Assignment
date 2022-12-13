package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateDescOrder{
	public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<String>();

		for (String element : list) {
			if (!newList.contains(element)) {

				newList.add(element);

			}

		}
		return newList;
	}

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("green");
		list.add("yellow");
		list.add("pink");
		list.add("blue");
		list.add("blue");
		System.out.println("ArrayList with duplicates: " + list);

		ArrayList<String> newList = removeDuplicates(list);
		Collections.sort(newList,Collections.reverseOrder());

		System.out.println("ArrayList with duplicates removed: " + newList);
	}
}
