class Ecommerce{
	public void displayProduct(){
		System.out.println("Products");
		System.out.println("1. Laptop");
		System.out.println("2. Mobile");
		System.out.println("3. Headphones");
	}
	
	public void addToCart(){
		Ecommerce e=new Ecommerce();
		System.out.println("Cart:");
		e.displayProduct();
	}

	public void userInfo(){
		Ecommerce e=new Ecommerce();
		e.displayProduct();
		
		e.addToCart();
		System.out.println("User Information:");
		System.out.println("Name: Abc");
		System.out.println("Address: Pune");
	}

	public static void main(String[] args){
		Ecommerce e=new Ecommerce();
		e.userInfo();
	}
}