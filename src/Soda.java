public class Soda {
	// fields
	private int name;
	private int price;

	// constructor
	Soda(int n) {
		name = n;
		price = n*33%10+2;
	}

	// am
	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// methods
	// toString()
	@Override
	public String toString() {
		return "Soda Brand #"+name + "\n\tPrice: " + price;
	}
}
