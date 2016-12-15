package rpg;

import java.util.LinkedList;

public class Body {
private LinkedList<String> parts;

public Body(LinkedList<String> parts) {
	super();
	this.parts = parts;
	this.parts = initParts();
}

private LinkedList<String> initParts() {
	// TODO Auto-generated method stub
	parts = new LinkedList<String>();
	parts.add("right hand");
	parts.add("left hand");
	parts.add("right leg");
	parts.add("left leg");
	parts.add("head");
	return parts;
}

private boolean stillGotLegs() {
	
	if (parts.contains("left leg") || parts.contains("right leg")){
		return true;
	}
	else{return false;}
}

}

