package rpg;

import java.util.ArrayList;
import java.util.LinkedList;

public class Inventory {
private ArrayList<Item> items;

/**
 * @param items
 */
public Inventory() {
	super();
	this.items = items;
	initInventory();
}

	private ArrayList<Item> initInventory() {
		items = new ArrayList<Item>();
		return items;
		
	}
}
