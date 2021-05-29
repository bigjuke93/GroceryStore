/**
 * @author cd185166
 *
 */

import java.util.Date;

public class Product {
	
	//Initialize variables
	String name="";
	Double price=0.00;
	int quantity=0;
	Date expirationdate= new Date();
	enum categorytype{Unknown, Dairy, Frozen, Produce}
	categorytype category;


	//Default constructor
	public Product() {
		
		String name="";
		Double price=0.00;
		int quantity=0;
		Date expirationdate= new Date();
		categorytype category =categorytype.Unknown;
		
		
	}
	
	//constructor to set variable values
	public Product(String name, Double price, int quantity, Date expirationdate, Product.categorytype category) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.expirationdate = expirationdate;
		this.category = category;
		//Dont need inventory class for now
		//addtoinventory(quantity);
	}
	
	
	
	//getters and setters
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getExpirationdate() {
		return expirationdate;
	}
	public void setExpirationdate(Date expirationdate) {
		this.expirationdate = expirationdate;
	};
	
	
}
