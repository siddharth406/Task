
public class DataTransfer {
	//ObstacleDetector
	//private boolean obstacleDetected = false; 
	
	private int CMD = 1;
	
	public DataTransfer() {       
		
	}
	
	//Getters & Setters
	/*
	public void setObstacleDetected(boolean status){ 
		obstacleDetected = status;      	
	}
	
	public boolean getObstacleDetected(){
		return obstacleDetected;      
	}
	*/
	public void setCMD(int command){ 
		CMD = command;       
	}
	
	public int getCMD(){ 
		return CMD;       
	} 
	
}
