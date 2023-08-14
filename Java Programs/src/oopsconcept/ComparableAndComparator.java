package oopsconcept;

import java.util.*;
/* Demonstrate the use of Comparable interface and Comparator interface */
class Mobile implements Comparable<Mobile> {
	private int idendityNumber, quantity;
	private String name;
	public Mobile(int idendityNumber, String name, int quantity) {
		super();
		this.idendityNumber = idendityNumber;
		this.name = name;
		this.quantity = quantity;
	}

	public int getIdendityNumber() {
		return idendityNumber;
	}

	public void setIdendityNumber(int idendityNumber) {
		this.idendityNumber = idendityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + idendityNumber + ", name=" + name + ", qty=" + quantity + "]";
	}
	@Override
	public int compareTo(Mobile mobile) {
		return Integer.compare(this.idendityNumber, mobile.idendityNumber);
	}
}

class IdendityComparator implements Comparator<Mobile> {
	@Override
	public int compare(Mobile type1, Mobile type2) {
		return Integer.compare(type1.getIdendityNumber(), type2.getIdendityNumber());
	}
}

class NameComparator implements Comparator<Mobile> {
	@Override
	public int compare(Mobile type1, Mobile type2) {
		return type1.getName().compareTo(type2.getName());
	}
}

class QuantityComparator implements Comparator<Mobile> {
	@Override
	public int compare(Mobile type1, Mobile type2) {
		return Integer.compare(type1.getQuantity(), type2.getQuantity());
	}
}

public class ComparableAndComparator {
	
	public static void main(String args[]) {
		Mobile nokia = new Mobile(105, "nokia", 5);
		Mobile samsung = new Mobile(102, "samsung", 2);
		Mobile iphone = new Mobile(108, "iphone", 14);
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(nokia);
		mobileList.add(iphone);
		mobileList.add(samsung);
		System.out.println(mobileList);
// 		With Comparable
		Collections.sort(mobileList);
		System.out.println();
		System.out.println("Sorted using Comparable");
		System.out.println(mobileList);
//		With Comparator
		System.out.println();
		System.out.println("Sorted using Comparator");
		Collections.sort(mobileList, new IdendityComparator());
		System.out.println("Sorted by ID");
		System.out.println(mobileList);
		System.out.println();
		Collections.sort(mobileList, new NameComparator());
		System.out.println("Sorted by Name");
		System.out.println(mobileList);
		System.out.println();
		Collections.sort(mobileList, new QuantityComparator());
		System.out.println("Sorted by Quantity");
		System.out.println(mobileList);
	}
	
}