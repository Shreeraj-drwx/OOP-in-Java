public class Main{
	public static void main(String [] args){

		Garage garage = new Garage();
		//Instantiation of object using contructor (attributes of the object come from the car class)
		Car myCar1 = new Car("Aventador", "Lamborghini", 2000);
		Car myCar2 = new Car("Veneno", "Lamborghini", 1000);
		//Objects car and car 2, with different argumetns passed based on attributes added in Cars class.

		//System.out.println(Veneno.brand);
		System.out.println(myCar1.price);
		System.out.println(myCar2.price);

		garage.park(myCar1);
		garage.park(myCar2);
		
	}
}