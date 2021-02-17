package entities;

public class Product {

	private String name;
	private Double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProdutPredicate(Product p) {
		return p.getPrice() >= 100;
	}

	public boolean nonStaticProdutPredicate() {
		return price >= 100;
	}

	@Override
	public String toString() {
		return name + "," + String.format("%.2f", price);
	}

}
