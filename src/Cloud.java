/**
 * Author: Andrew Labbe
 * Class Cloud: creates a cloud by using multiple ellipses with their respective getters/setters
 */
import java.awt.Color;
import wheels.users.Ellipse;

public class Cloud {
	
	//creating ellipse instance variables which will makeup the cloud
	private Ellipse cloudBody;
	private Ellipse cloudBump1;
	private Ellipse cloudBump2;
	private Ellipse cloudBump3;
	private Ellipse cloudBump4;
	private Ellipse cloudBump5;
	private Ellipse cloudBump6;
	
	//creates a new cloud object of position (x, y), size (xsize, ysize) and Color "color"
	public Cloud(int x, int y, int xsize, int ysize, Color color) {
		//creates cloud body
		cloudBody = new Ellipse();
		cloudBody.setLocation(x, y);
		cloudBody.setSize(95, 45);
		cloudBody.setColor(Color.lightGray);
		
		//creates first bump
		cloudBump1 = new Ellipse();
		cloudBump1.setLocation(x + 5, y - 5);
		cloudBump1.setSize(xsize, ysize);
		cloudBump1.setColor(color);
		
		//creates second bump
		cloudBump2 = new Ellipse();
		cloudBump2.setLocation(x + 31, y - 10);
		cloudBump2.setSize(xsize, ysize);
		cloudBump2.setColor(color);
		
		//creates third bump
		cloudBump3 = new Ellipse();
		cloudBump3.setLocation(x + 55, y - 5);
		cloudBump3.setSize(xsize, ysize);
		cloudBump3.setColor(color);
		
		//creates fourth bump
		cloudBump4 = new Ellipse();
		cloudBump4.setLocation(x + 5, y + 6);
		cloudBump4.setSize(xsize, ysize);
		cloudBump4.setColor(color);
		
		//creates fifth bump
		cloudBump5 = new Ellipse();
		cloudBump5.setLocation(x + 31, y + 11);
		cloudBump5.setSize(xsize, ysize);
		cloudBump5.setColor(color);
		
		//creates sixth bump
		cloudBump6 = new Ellipse();
		cloudBump6.setLocation(x + 55, y + 6);
		cloudBump6.setSize(xsize, ysize);
		cloudBump6.setColor(color);			
	}

	//sets color of each cloud in array, including all of the bumps
	public static void setColor(Cloud[] ar, Color color) {
		for(int i = 0; i < ar.length; i++) {
			ar[i].cloudBody.setColor(color);
			ar[i].cloudBump1.setColor(color);
			ar[i].cloudBump2.setColor(color);
			ar[i].cloudBump3.setColor(color);
			ar[i].cloudBump4.setColor(color);
			ar[i].cloudBump5.setColor(color);
			ar[i].cloudBump6.setColor(color);
		}
	}
	
	//sets the location of the cloud and each bump to (x, y)
	public void setLocation(int x, int y) {
		cloudBody.setLocation(x, y);
		cloudBump1.setLocation(x + 5, y - 5);
		cloudBump2.setLocation(x + 31, y - 10);
		cloudBump3.setLocation(x + 55, y - 5);
		cloudBump4.setLocation(x + 5, y + 6);
		cloudBump5.setLocation(x + 31, y + 11);
		cloudBump6.setLocation(x + 55, y + 6);
	}
	
	public Color getCloudColor() {
		return cloudBody.getColor();
	}
	
	public int getXPos() {
		return cloudBody.getXLocation();
	}
	
	public int getYPos() {
		return cloudBody.getYLocation();
	}
	
}
