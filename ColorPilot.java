import java.io.File;

import lejos.nxt.*;
import lejos.robotics.Color;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;

public class ColorPilot extends Thread {
	DataTransfer DTObj;

	private ColorSensor color1;
	private ColorSensor color2;
	private ColorSensor color3;
	private ColorSensor colorS;
	private ColorSensor light;
	private UltrasonicSensor ultra;

	DifferentialPilot pilot = new DifferentialPilot(56, 100, Motor.A, Motor.B);

	File soundFile = new File("need_spd(3).wav");
	File soundFile2 = new File("target_rich(1).wav");
	
	public ColorPilot(DataTransfer DT) {
		DTObj = DT;

		color1 = new ColorSensor(SensorPort.S1);
		color2 = new ColorSensor(SensorPort.S1);
		color3 = new ColorSensor(SensorPort.S1);
		colorS = new ColorSensor(SensorPort.S1);
		light = new ColorSensor(SensorPort.S1);

		ultra = new UltrasonicSensor(SensorPort.S2);
	}

	public void run() {
		pilot.setTravelSpeed(120);
		pilot.setRotateSpeed(90);
		
		LCD.drawString("F-14 Tomcat!", 0, 0);
		Sound.playSample(soundFile, 200);
		Delay.msDelay(5000);
		LCD.clear();
		
		// Loop for movement
		while (colorS.getColorID() != Color.BLACK) {
			pilot.forward();

			// Object detection and avoidance, plays sound clip when object detected
			if (DTObj.getCMD() == 0) {
				pilot.stop();
				Sound.playSample(soundFile2, 200);
				Delay.msDelay(4500);
				pilot.rotate(-90);
				pilot.arc(230, 180);
				pilot.rotate(-90);
			}

			// Detects the color red and performs action accordingly
			while (color1.getColorID() == Color.RED) {

				pilot.stop();
				pilot.rotate(170);
				pilot.rotate(10);
				pilot.rotate(-10);
				pilot.rotate(10);
				pilot.rotate(-10);
				pilot.rotate(10);
				pilot.rotate(-10);
				pilot.rotate(10);
				pilot.rotate(-70);

			}

			// Detects the color blue and performs action accordingly
			while (color2.getColorID() == Color.BLUE) {

				pilot.rotate(110);
			}

			// Detects the color yellow and performs action accordingly
			while (color3.getColorID() == Color.YELLOW) {

				pilot.rotate(-120);
			}
		}

		pilot.stop();
		light.setFloodlight(Color.RED);
		pilot.rotate(170);
		pilot.rotate(10);
		pilot.rotate(-10);
		pilot.rotate(10);
		pilot.rotate(-10);
		pilot.rotate(10);
		pilot.rotate(-10);
		pilot.rotate(10);
		pilot.rotate(-70);
		light.setFloodlight(Color.WHITE);
	}
}
