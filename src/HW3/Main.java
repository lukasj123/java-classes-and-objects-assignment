package HW3;
import HW3.Pet;

public class Main {

	public static void main(String[] args) {
		
		Pet myPet = new Pet("Buffy", 2, "NYC", "Bunny");
		
		System.out.println(myPet.getName());

		ChocolateBar choco = new ChocolateBar();
		
		System.out.println(choco.getExcite());
	}

}
