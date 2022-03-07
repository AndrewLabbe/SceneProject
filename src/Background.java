/**
 * Author: Andrew Labbe
 * Class Background: creates the background for the scene with an ellipse resembling the sun with respective getters/setters
 */
import java.awt.Color;
import wheels.users.Ellipse;
import wheels.users.Rectangle;

public class Background {
	
	//defining instance variables background (rectangle) and sun (ellipse)
	private Rectangle background;
	private Ellipse sun;
	
	//creates a background rectangle at position (xpos, ypos), size (xsize, ysize) and Color "color"
	//also creates the sun (ellipse) and sets it in relative position to the background with color yellow
	public Background(int xpos, int ypos, int xsize, int ysize, Color color) {
		//creating background
		background = new Rectangle();
		background.setLocation(xpos, ypos);
		background.setSize(xsize, ysize);
		background.setColor(color);
		
		//creating sun
		sun = new Ellipse();
		sun.setColor(Color.yellow);
		sun.setLocation(xpos + 640, ypos + 10);
		sun.setSize(100, 100);
	}
	
	//sets color of background rectangle to bColor and sun (ellipse) to sColor
	public void setColor(Color bColor, Color sColor) {
		background.setColor(bColor);
		sun.setColor(sColor);
	}
	
	//sets location of background rectangle to (x, y) and sun (ellipse) to a relative position to (x, y)
	public void setLocation(int x, int y) {
		background.setLocation(x, y);
		sun.setLocation(x + 640, y + 10);
	}
	
	public Color getBackgroundColor() {
		return background.getColor();
	}
	
	public Color getSunColor() {
		return sun.getColor();
	}
	
	public int getXPos() {
		return background.getXLocation();
	}
	
	public int getYPos() {
		return background.getYLocation();
	}
	
}
