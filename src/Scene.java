/**
 * Author: Andrew Labbe
 * Class Scene: creates 3 buildings, a line of clouds and a background to be displayed in the window, has the main method to execute code
 */
import java.awt.Color;
import wheels.users.Frame;

public class Scene extends Frame{
	
	//initializing variables
	private Background background;
	private Building building1;
	private Building building2;
	private Building building3;
	private Cloud[] cloudLine; 
	
	//Creates a scene object with 3 buildings, the background and a cloud line
	public Scene() {
		//creates background
		background = new Background(0, 0, 1000, 1000, Color.cyan);
		
		//creates buildings
		building1 = new Building(50, 200, 150, 300, Color.gray);
		building2 = new Building(275, 200, 150, 300, Color.gray);
		building3 = new Building(500, 200, 150, 300, Color.gray);
		
		//store all clouds into array
		Cloud[] ar = {new Cloud(-50, 2, 35, 40, Color.lightGray), new Cloud(0, 2, 35, 40, Color.lightGray), new Cloud(50, 2, 35, 40, Color.lightGray), new Cloud(100, 2, 35, 40, Color.lightGray), new Cloud(150, 2, 35, 40, Color.lightGray), new Cloud(200, 2, 35, 40, Color.lightGray), new Cloud(250, 2, 35, 40, Color.lightGray), new Cloud(300, 2, 35, 40, Color.lightGray), new Cloud(350, 2, 35, 40, Color.lightGray), new Cloud(400, 2, 35, 40, Color.lightGray), new Cloud(450, 2, 35, 40, Color.lightGray), new Cloud(500, 2, 35, 40, Color.lightGray), new Cloud(550, 2, 35, 40, Color.lightGray), new Cloud(600, 2, 35, 40, Color.lightGray), new Cloud(650, 2, 35, 40, Color.lightGray)};
		cloudLine = ar;
	}
	
	//changes scene to day time, not implemented yet
	public void toDay() {
		background.setColor(Color.cyan, Color.yellow);
		building1.setColor(Color.gray, Color.lightGray);
		building2.setColor(Color.gray, Color.lightGray);
		building3.setColor(Color.gray, Color.lightGray);
		Cloud.setColor(cloudLine, Color.lightGray);
	}
	
	//changes scene to night time, not implemented yet
	public void toNight() {
		background.setColor(Color.black, Color.lightGray);
		building1.setColor(Color.gray, Color.yellow);
		building2.setColor(Color.gray, Color.yellow);
		building3.setColor(Color.gray, Color.yellow);
		Cloud.setColor(cloudLine, Color.darkGray);
	}
	
	//the main method that creates the scene object with all the other objects
	public static void main(String[] args) {
		new Scene();
	}
}
