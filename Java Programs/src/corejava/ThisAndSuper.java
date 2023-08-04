package corejava;
/* Program aim is use of this and super keyword */
class ProductCategory {
	private String categoryname;
	public void setdata(String categoryname) {
		this.categoryname = categoryname;
	}

	public void showdata() {
		System.out.println("Product Category Name : " + categoryname);
	}
}
class Product extends ProductCategory {
	private String name;
	private float price;
	public void setdata(String name, float price, String categoryname) {
		super.setdata(categoryname); // set method of parent class
		this.name = name;
		this.price = price;
	}
	
	public void showdata() {
		System.out.println("Product Name : " + name);
		System.out.println("Product Price : " + price);
		super.showdata(); // show data of parent class
	}
}
class ThisAndSuper {
	
	public static void main(String[] args) {
		Product productDetails = new Product();
		productDetails.setdata("Monitor",25000f,"Computer Parts"); // set data manually 
		productDetails.showdata(); // calling method of product class
	}
	
}
