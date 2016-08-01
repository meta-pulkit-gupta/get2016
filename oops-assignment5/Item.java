package session5;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a java bean class for creating Item.
 * 
 * @author Pulkit Gupta
 *
 */

public class Item {
	String name; // to store the name of the list.
	List<Item> items; // to store the sub menu of the particular item.

	Item() {
		items = new ArrayList<Item>(); // creates a ArrayList for every new Item object
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addElement(Item item) {
		items.add(item);
	}

}
