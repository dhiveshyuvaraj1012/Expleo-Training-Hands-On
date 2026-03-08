package com.classandobjandencap;

public class Product {
	// Private Attributes (Encapsulation)
	    private int productId;
	    private String productName;
	    private double price;
	    private int quantity;

	    // Constructor
	    public Product(int productId, String productName, double price, int quantity) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price > 0 ? price : 0;
	        this.quantity = quantity >= 0 ? quantity : 0;
	    }

	    // Getter for productId (needed for removal)
	    public int getProductId() {
	        return productId;
	    }

	    // Safely update quantity
	    public void setQuantity(int newQty) {
	        if (newQty >= 0) {
	            this.quantity = newQty;
	        } else {
	            System.out.println("Invalid quantity.");
	        }
	    }

	    // Calculate total cost of this product
	    public double calculateTotal() {
	        return price * quantity;
	    }

	    // Return formatted product details
	    public String getProductDetails() {
	        return "ID: " + productId +
	               ", Name: " + productName +
	               ", Price: " + price +
	               ", Quantity: " + quantity +
	               ", Total: " + calculateTotal();
	    }
	}
