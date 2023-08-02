package HW3;

public class ChocolateBar {

	private float price;
	private String brand;
	private int rating;
	
	public ChocolateBar() {
		System.out.println("New mystery ChocolateBar created.");
	}
	
	public ChocolateBar(String brand, int rating) {
		System.out.println("New priceless ChocolateBar created.");
		this.brand = brand;
		this.rating = rating;
	}
	
	public ChocolateBar(String brand, int rating, float price) {
		System.out.println("New ChocolateBar created.");
		this.brand = brand;
		this.rating = rating;
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setPrice(float newPrice) {
		price = newPrice;
	}
	
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	
	public void setRating(int newRating) {
		rating = newRating;
	}
	
	public boolean getTrue() {
		return true;
	}
	
	public String getExcite() {
		return "I LOVE THIS CHOCOLATE BAR!!!";
	}
	
	
}
