package utils;

import java.util.function.Consumer;

import entities.Product;

public class UpdatePrice implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
