public class Car{
	
	String name;
	String brand;
	double price;

	Car(String name, String brand, double price){
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	void on(){
		System.out.println("The engine turned on!");
	}
	void off(){
		System.out.println("The engine turned off!");
	}
}