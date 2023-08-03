package corejava;

/* Java program to demonstrate use of constructor */

class Triangle {
	double width;
	double height;
	double depth;
	Triangle() {
		System.out.println("Constructor without parameter");
		width = 10;
		height = 10;
		depth = 10;
	}
	Triangle(int parameterwidth, int parameterheight, int parameterdepth) {
		System.out.println("Constructor with parameter");
		width = parameterwidth;
		height = parameterheight;
		depth = parameterdepth;
	}
	/* Formula for calculate volume */
	double volume() {
		return width * height * depth;
	}
}
public class Constructor {
	
	public static void main(String args[]) {
		Triangle defaultconstructor = new Triangle();
		double result;
		result = defaultconstructor.volume();
		System.out.println("Volume is : " + result);
		Triangle parameterconstructor = new Triangle(7, 8, 9);
		result = parameterconstructor.volume();
		System.out.println("Volume is : " + result);
	}

}
