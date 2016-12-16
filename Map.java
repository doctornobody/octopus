package octopus;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
private HashMap<String,Room> grid = new HashMap();

	public void initGrid() {
		Room first = new Room();
//		int min = 1;
//		int max = 25;
//		int probabilityOfMoreExits = random.nextInt(max - min + 1) + min;
//		if (probabilityOfMoreExits == 8) {
//			first.setExits(0x1,1x0);			
//		}
//		randomly choose where the next room materialises if just one exit		
		grid.put("0x0",first); // makes the first room where the player appears
	}
	
	public void addRoom(ArrayList<String> exitList, String entry,String direction) {
		String coord;
		coord = "-1x-1";
		String[] coords = entry.split("x");
		int xCoord = Integer.parseInt(coords[0]);
		int yCoord = Integer.parseInt(coords[1]);
		if ((direction == "w") || (direction == "west") ) {
			xCoord-=1;
			}
		
		if ((direction == "e") || (direction == "east") ) {
			xCoord+=1;
			}
		
		if ((direction == "n") || (direction == "north") ) {
			yCoord+=1;
			}
		
		if ((direction == "s") || (direction == "south") ) {
			yCoord-=1;
			}
		
		coord = xCoord+ "x" + yCoord;
		Room justCreated = new Room();
//		justCreated.setEntry(entry);
//		justCreated.setExits(exitList);
		grid.put(coord, justCreated);
	}
}

