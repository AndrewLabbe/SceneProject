/**
 * Author: Andrew Labbe
 * Class Window: creates a rectangle window with two lines within and their respective getters/setters
 */
import java.awt.Color;
import wheels.users.Rectangle;

public class Window {
	
	//creating instance variables Rectangle window and the two rectangle lines that are inside the window
	private Rectangle window;
	private Rectangle line1;
	private Rectangle line2;
	
	//creates the window at position (x, y), size (xsize, ysize) and Color "color"; and the lines within
	public Window(int x, int y, int xsize, int ysize, Color color) {
		//creating window
		window = new Rectangle();
		window.setColor(color);
		window.setSize(xsize, ysize);
		window.setLocation(x, y);
		
		//creates vertical line
		line1 = new Rectangle();
		line1.setSize(1, 35);
		line1.setLocation(x + 12, y);
		line1.setColor(Color.black);
		
		//creates horizontal line
		line2 = new Rectangle();
		line2.setSize(25, 1);
		line2.setLocation(x, y + 17);
		line2.setColor(Color.black);
		
	}
	
	//sets the color of the window to wColor and color of the lines to lColor
	public void setColor(Color wColor, Color lColor) {
		window.setColor(wColor);
		line1.setColor(lColor);
		line2.setColor(lColor);
	}
	
	//sets the location of window and the lines in respect to the window to position (x, y)
	public void setLocation(int x, int y) {
		window.setLocation(x, y);
		line1.setLocation(x + 12, y);
		line2.setLocation(x, y + 17);
	}
	
	public Color getWindowColor() {
		return window.getColor();
	}
	
	public Color getLineColor() {
		return line1.getColor();
	}
	
	public int getXPos() {
		return window.getXLocation();
	}
	
	public int getYPos() {
		return window.getYLocation();
	}
}
