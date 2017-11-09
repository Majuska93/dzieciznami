package data;

import java.util.ArrayList;
import view.*;
import control.*;
import model.*;

public class ProductDB {
private ArrayList<Product> productList = new ArrayList<Product>();
//constructor
public ProductDB() {
}

public Product browseByProductID(String productID) {
	for(int i=0;i<productList.size();i++) {
		if(productID.equals(productList.get(i).getProductID())) {
			return productList.get(i);
		}
	}
	return new Product();
}
public void assignProductList() {
	while(/*sth is there*/) {
		Product product = new Product(/*bierz szczegóły productu*/);
		productList.add(product);
	}
}
}
