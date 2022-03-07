/**
 * Author: Andrew Labbe
 * Class Building: creates a rectangle building, two lines of windows and an antenna with their respective getters/setters
 */
import java.awt.Color;
import wheels.users.Rectangle;

public class Building{
	
	//declaring the building, array of windows and antenna
	private Rectangle building;
	private Window[] windows;
	private Rectangle antenna;
	
	//creates a building of position (x, y) and size (xsize, ysize) and Color "color" with the windows and antenna
	public Building(int x, int y, int xsize, int ysize, Color color) {
		//creates building
		building = new Rectangle();
		building.setColor(color);
		building.setSize(xsize, ysize);
		building.setLocation(x, y);
		
		//creates all windows and stores them into array
		Window[] ar = {new Window(x + 20, y + 15, 25, 35, Color.lightGray), new Window(x + 20, y + 65, 25, 35, Color.lightGray), new Window(x + 20, y + 115, 25, 35, Color.lightGray), new Window(x + 20, y + 165, 25, 35, Color.lightGray),new Window(x + 20, y + 215, 25, 35, Color.lightGray), new Window(x + 20, y + 265, 25, 35, Color.lightGray), new Window(x + 100, y + 15, 25, 35, Color.lightGray), new Window(x + 100, y + 65, 25, 35, Color.lightGray), new Window(x + 100, y + 115, 25, 35, Color.lightGray), new Window(x + 100, y + 165, 25, 35, Color.lightGray), new Window(x + 100, y + 215, 25, 35, Color.lightGray), new Window(x + 100, y + 265, 25, 35, Color.lightGray)};
		windows = ar;
		
		//creates antenna
		antenna = new Rectangle();
		antenna.setLocation(x + 70, y - 80);
		antenna.setColor(Color.black);
		antenna.setSize(10, 80);
	}
	
	//sets color of the building to bColor, windows to wColor and the lines in the window to black, the antenna to dark gray
	public void setColor(Color bColor, Color wColor) {
		building.setColor(bColor);
		for(int i = 0; i < windows.length; i++) {
			windows[i].setColor(wColor, Color.black);
		}
		antenna.setColor(Color.darkGray);
	}
	
	//changes location of entire building to (x, y) with the windows and antenna following using relative positioning
	public void setLocation(int x, int y) {
		building.setLocation(x, y);
		int count = 0;
		for(int i = 0; i < windows.length; i++) {
			if(i < 6) {
				windows[i].setLocation(x + 20, y + 15 + (50 * i));
			}
			else if(i >= 6) {
				windows[i].setLocation(x + 100, y + 15 + (50 * count));
				count++;
			}
		}
		antenna.setLocation(x + 70, y - 80);
	}
	
	public Color getBuildingColor() {
		return building.getColor();
	}
	
	public Color getAntennaColor() {
		return antenna.getColor();
	}
	
	public int getXPos() {
		return building.getXLocation();
	}
	
	public int getYPos() {
		return building.getYLocation();
	}
	
}
