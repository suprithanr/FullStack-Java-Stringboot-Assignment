public class Student {

	private int rollno;
	private String sname;
	private String classname;
	private String totalmarks;

	public Student(int rollno, String sname, String classname, String totalmarks) {
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;

	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}

}

import java.util.ArrayList;
import java.util.Collections;

public class Student1 {

	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList<Student>();

		slist.add(new Student(1, "Supritha", "BE", "130"));
		slist.add(new Student(2, "Madhavi", "BE", "320"));
		slist.add(new Student(3, "madhu", "BE", "250"));
		slist.add(new Student(4, "sushma", "BE", "360"));
		slist.add(new Student(5, "rithu", "BE", "380"));
		
		Collections.sort(slist, new StudentMarksScore());
		int n = slist.size();
		// 1.
		for (int i = 1; i < 4; i++) {
			System.out.println(slist.get(n - i));
		}
		// 2.
		for (int i = 0; i < n; i++) {
			if ((Integer.parseInt(slist.get(i).getTotalmarks())) < (600 * 50 / 100)) {
				System.out.println(slist.get(i) + "Below 50%");
			}
		}
		// 3.
		for (int i = 0; i < n; i++) {
			if ((Integer.parseInt(slist.get(i).getTotalmarks())) < (600 * 35 / 100)) {
				System.out.println(slist.get(i) + "Below 35%");

			}
		}
		int average = 0;
		// 4.
		for (int i = 0; i < n; i++) {

			average = average + Integer.parseInt(slist.get(i).getTotalmarks());

		}
		System.out.println("average is :"+average / 5);
		for (int i = 0; i < n; i++) {

			if ((Integer.parseInt(slist.get(i).getTotalmarks())) < (average / 5)) {
				System.out.println(slist.get(i) + "Below Average Marks");

			}
		}
		System.out.println("______________________-");
		// 5.
		Collections.sort(slist, new StudentName());
		System.out.println(slist);
	}

}
import java.util.Comparator;

public class StudentMarksScore implements Comparator<Student>{

		public int compare(Student o1, Student o2) {
			if(o1.getTotalmarks().compareTo(o2.getTotalmarks()) >0)
			return 1;
			else if(o1.getTotalmarks().compareTo(o2.getTotalmarks()) <0)
			return -1;
			else return 0;
		}

	}

import java.util.Comparator;

public class StudentName implements Comparator<Student>  {

		public int compare(Student o1, Student o2) {
			if (o1.getSname().compareTo(o2.getSname()) > 0)
				return 1;

			else if (o1.getSname().compareTo(o2.getSname()) < 0)
				return -1;
			else
				return 0;

		}
}
