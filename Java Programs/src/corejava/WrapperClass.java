package corejava;
/* Program aim is to compare to variable using wrapper class */
public class WrapperClass {

	public static void main(String args[]) {
//		Variable create for integer wrapper class
		Integer value1 = 10;
		Integer value2 = 11;
		Double value3 = 3.14;
		Double value4 = 3.14;
		Float value5 = 1.78f;
		Float value6 = 1.78f;
		Character value7 = 'V';
		Character value8 = 'V';
		String name1 = "Vandan";
		String name2 = "Vandan";
		Boolean value11 = true;
		Boolean value12 = true;
//		Compare the value using equals() method
		System.out.println("Integer : " + value1.equals(value2));
		System.out.println("Double : " + value3.equals(value4));
		System.out.println("Float : " + value5.equals(value6));
		System.out.println("Character : " + value7.equals(value8));
		System.out.println("String : " + name1.equals(name2));
		System.out.println("Boolean : " + value11.equals(value12));
	}

}