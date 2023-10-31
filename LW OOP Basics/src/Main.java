
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop my_laptop = new Laptop("MacBook Air", "8 gb", 1300, 123, 2020);
		my_laptop.setProducer("Flaptop");
		System.out.print(my_laptop.getProducer() + ' ');
		System.out.print(my_laptop.getRam() + ' ');
		System.out.print(my_laptop.getCost() + ' ');

	}

}
