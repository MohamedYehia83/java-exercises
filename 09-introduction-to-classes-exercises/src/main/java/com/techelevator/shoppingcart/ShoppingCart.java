package com.techelevator.shoppingcart;

public class ShoppingCart {

private int totalNumberOfItems;
private double totalAmountOwed;
private double pricePerItem = 0.0;

public ShoppingCart() {
	totalNumberOfItems = 0;
	totalAmountOwed = 0.0;
	pricePerItem = 0.0;
}

public double getPricePerItem() { // whT I WANT THIS TO DO 
	return pricePerItem;
}

public void setPricePerItem(double pricePerItem) {
	this.pricePerItem = pricePerItem;
}

public double getAveragePricePerItem() {
	
	if ( totalNumberOfItems == 0) {
		return 0;
	}
	else return(totalAmountOwed / totalNumberOfItems);
}


/*addItems(int numberOfItems, double pricePerItem) updates totalNumberOfItems and 
 * increases totalAmountOwed by (pricePerItem * numberOfItems)
 */
public void addItems(int numberOfItems, double pricePerItem)	{
	totalNumberOfItems = totalNumberOfItems + numberOfItems;
	totalAmountOwed = totalAmountOwed + (pricePerItem * numberOfItems);
}

public double getTotalAmountOwed() {
	return(totalAmountOwed);
}

public int getTotalNumberOfItems() {
	return totalNumberOfItems;
}

public void setTotalNumberOfItems(int totalNumberOfItems) {
	this.totalNumberOfItems = totalNumberOfItems;
}



public void setTotalAmountOwed(double totalAmountOwed) {
	this.totalAmountOwed = totalAmountOwed;
}
// empty() resets totalNumberOfItems to 0 and totalAmountOwed to 0.0.
public void  empty() {
	totalNumberOfItems = 0;
	totalAmountOwed = 0.0;
}
}
