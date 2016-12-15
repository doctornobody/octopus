package rpg;

import java.util.ArrayList;
import java.util.Random;

public class Player {
private static String name = "DOOFUS"; 
private	byte level = 1;
private Body body = new Body(null);
private static int power = 3;
private static int karma = 2;
private Inventory inventory;

/**
 * @param level
 * @param body
 * @param power
 * @param karma
 * @param inventory
 */
public Player() {
	super();
	this.level = level;
	this.body = body;
	this.power = power;
	this.karma = karma;
	this.inventory = inventory;
}
public byte getLevel() {
	return level;
}
public void setLevel(byte level) {
	this.level = level;
}
public Body getBody() {
	return body;
}
public void setBody(Body body) {
	this.body = body;
}
public int getPower() {
	return power;
}
public void setPower(int power) {
	this.power = power;
}
public int getKarma() {
	return karma;
}
public void setKarma(int karma) {
	this.karma = karma;
}
public Inventory getInventory() {
	return inventory;
}
public void setInventory(Inventory inventory) {
	this.inventory = inventory;
}

public static String getName() {
	return name;
}

public void initStats() {
	// later to be randomly generated
	power = 3;
	karma = 2;
	
}

}
