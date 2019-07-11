package neegar_sultana;

public class Main {
	
	public static void main(String[] s) {
		Admin a = new Admin();
		a.name = "Shah Muhammad Arif";
		
		System.out.println(a);
		
		Address address1=new Address("Nawabpur", "Dhaka", "Bangladesh");
		Customer c = new Customer("neegar sultana", address1);

		System.out.println(c);
	}
}
