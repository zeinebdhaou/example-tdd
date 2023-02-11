package shopping;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
	
	private List<Product> productList;
	private double totalCartValue; 

	public ShoppingCart() {
		super();
		this.productList = new ArrayList<>();
		this.totalCartValue = 0; 
		
	}
	
	public double getTotalCartValue() {
		return totalCartValue;
	}

	public void setTotalCartValue(double totalCartValue) {
		this.totalCartValue = totalCartValue;
	}

	public int getProductCount() {
		return productList.size();
	}

	public void addProduct(Product product) {
		productList.add(product);
		totalCartValue += product.getProductPrice();
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	
//	public double getTotalCartValue() {
//		double totalCartValue = 0; 
//		for (Product product : productList) {
//			totalCartValue = totalCartValue + product.getProductPrice();
//		}
//		return totalCartValue;
//	}
	
	 

}
