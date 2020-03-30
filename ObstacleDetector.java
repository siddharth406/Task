import java.io.File;

import lejos.nxt.*;

public class ObstacleDetector extends Thread {
	DataTransfer DTObj;
	
	private UltrasonicSensor ultra; 
	private final int securityDistance = 20;
	
	//File soundFile2 = new File("target_rich(1).wav");
	
	public ObstacleDetector(DataTransfer DT) {
		DTObj = DT;
		ultra = new UltrasonicSensor(SensorPort.S2);
	}
	
	public void run() {
		while(true) {
			if(ultra.getDistance() > securityDistance) {
				DTObj.setCMD(1);
			}else {
				DTObj.setCMD(0);
				
				//Sound.playSample(soundFile2, 200);
			}
		}
	}
	
	
}
