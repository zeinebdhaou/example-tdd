package shopping;

import org.junit.Test;
import org.junit.Assert;

public class ShoppingCartAppTest{	

	//	Requirement: Create an empty shopping cart
	//	When: An empty shopping cart created.
	//	Then: the product count of cart should be 0.

	@Test
	public void testCreateEmptyShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getProductCount());
	}

	//	Requirement: Add Product to shopping cart
	//	When: Add 1 unit of ‘Olive Oil’, unit price $30.
	//	Then:
	//	– The product count of the cart should be 1.
	//	– The total value of cart should be $30.
	@Test
	public void testAddSingleProductToShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Product oil = new Product("oilve Oil", 1, 30.0);
		cart.addProduct(oil);
		Assert.assertEquals(1, cart.getProductCount());
		Assert.assertEquals(30.0, cart.getTotalCartValue(), 0.0);
	}

	//	Requirement: Add different Products to shopping cart
	//	When:
	//	– Add 1 unit of ‘Olive Oil’, unit price $30.
	//	– Add 1 unit of ‘Soap’, unit price $10.
	//	Then:
	//	– The product count of the cart should be 2.
	//	– The total value of cart should be $40.

	@Test
	public void addDifferentProductsToTheCart(){
		ShoppingCart cart = new ShoppingCart();
		Product oil = new Product("Olive Oil", 1, 30.0);
		Product soap = new Product("Soap", 1, 10.0);
		cart.addProduct(oil);
		cart.addProduct(soap);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(40.0, cart.getTotalCartValue(),0.0);
	}	
}