package corejava;
/* Program aim is to use of static method,variables or block */
public class StaticUse {
	static int value1 = 10;
	static int value2;
//	static function
	static void function(int value3) {
		System.out.println("Value 1 : " + value1);
		System.out.println("Value 2 : " + value2);
		System.out.println("Value 3 : " + value3);
	}
	static {
		System.out.println("Static Block"); // static block
		value2 = value1 + 5;
	}

	public static void main(String args[]) {
		function(8);
	}
	
}