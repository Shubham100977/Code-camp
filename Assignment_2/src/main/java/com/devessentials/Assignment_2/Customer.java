package com.devessentials.Assignment_2;

import java.util.List;

public class Customer {
	String customerName;
	List<Item> listOfItems;
	
	public int calculateBill()
	{
		int total = 0;
		for (Item item:listOfItems) {
			total+=item.getPrice(item.getName());
		}
		return total;
	}
 
	public String getName() {
		return customerName;
	}
 
	public void setName(String name) {
		this.customerName = customerName;
	}
 
	public List<Item> getListOfItems() {
		return listOfItems;
	}
 
	public void setListOfItems(List<Item> listOfItems) {
		this.listOfItems = listOfItems;
	}

}
