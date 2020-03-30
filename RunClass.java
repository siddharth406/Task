import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;

public class RunClass {
	private static DataTransfer DT;
	private static ObstacleDetector ODObj;
	private static ColorPilot CPObj;
	
	public static void main(String[] args) {
		DT = new DataTransfer();
		ODObj = new ObstacleDetector(DT);
		CPObj = new ColorPilot(DT);
		ODObj.start();
		CPObj.start();			
		
		while(!Button.ENTER.isDown()) {
			//Empty
		}
		LCD.drawString("Finished",0,7);
		LCD.refresh();
		System.exit(0);
	}
}
