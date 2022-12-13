
import java.util.Comparator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ProductionFacilityNameComparator implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		
		if (o1.getPro_facility_name().compareTo(o2.getPro_facility_name()) > 0)
			return 1;

		else if (o1.getPro_facility_name().compareTo(o2.getPro_facility_name()) < 0)
			return -1;
		else
			return 0;
	}

}

public class ProductionFacilityComparator2 implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		if(o1.getItemnames().length > o2.getItemnames().length)
			return 1;
			else if(o1.getItemnames().length < o2.getItemnames().length)
			return -1;
			else return 0;
	}

}



public class ProductionFacility2 {

	public static void main(String[] args) {
		
		ArrayList<ProductionFacility> p = new ArrayList<ProductionFacility>();
		
		String[] strArray1 = {"ab","ac","ad"};
		String[] strArray2 = {"mn","mo","mp","mq"};
		String[] strArray3 = {"xx","xy","xz"};
		LocalDate today = LocalDate.now();
		
		p.add(new ProductionFacility(1,"aaa","Mysore",3,strArray1,LocalDate.now()));
		p.add(new ProductionFacility(2,"bbb","Banglore",4,strArray2,today.minusDays(1)));
		p.add(new ProductionFacility(3,"ccc","Pune",3,strArray3,today.minusDays(2)));
		
		Collections.sort(p,new ProductionFacilityComparator());
		
		
		System.out.println(Arrays.toString(p.get(p.size()-1).getItemnames()));
		
		Collections.sort(p,new ProductionFacilityNameComparator());
		
		for(int i =0 ; i< p.size();i++) {
			System.out.println(p.get(i).getPro_facility_name());
		}
		
		Collections.sort(p,new ProductionFacilityComparator2());
		
		System.out.println(p.get(p.size()-1).getPro_facility_name());
		

		Collections.sort(p,new ProductionFacilityComparator3());
		
		System.out.println(p);
		
		
		
	}

}

public class ProductionFacility {
	
	
	private int pliid;
	private String pro_facility_name;
	private String pro_fa_location;
	private int totalproduction_perday;
	private String itemnames[];
	private LocalDate prod_date;
	
	public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}
	
	public int getPliid() {
		return pliid;
	}
	public void setPliid(int pliid) {
		this.pliid = pliid;
	}
	public String getPro_facility_name() {
		return pro_facility_name;
	}
	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}
	public String getPro_fa_location() {
		return pro_fa_location;
	}
	public void setPro_fa_location(String pro_fa_location) {
		this.pro_fa_location = pro_fa_location;
	}
	public int getTotalproduction_perday() {
		return totalproduction_perday;
	}
	public void setTotalproduction_perday(int totalproduction_perday) {
		this.totalproduction_perday = totalproduction_perday;
	}
	public String[] getItemnames() {
		return itemnames;
	}
	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}
	public LocalDate getProd_date() {
		return prod_date;
	}
	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}

	@Override
	public String toString() {
		return "ProductionFacility [pliid=" + pliid + ", pro_facility_name=" + pro_facility_name + ", pro_fa_location="
				+ pro_fa_location + ", totalproduction_perday=" + totalproduction_perday + ", itemnames="
				+ Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}
}
public class ProductionFacilityComparator implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		if(o1.getTotalproduction_perday()>o2.getTotalproduction_perday())
			return 1;
			else if(o1.getTotalproduction_perday()<o2.getTotalproduction_perday())
			return -1;
			else return 0;
	}

}

public class ProductionFacilityComparator3 implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		if (o1.getProd_date().compareTo(o2.getProd_date()) > 0)
			return 1;

		else if (o1.getProd_date().compareTo(o2.getProd_date()) < 0)
			return -1;
		else
			return 0;
	}

}

