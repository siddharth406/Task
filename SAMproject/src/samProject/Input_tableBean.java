package samProject;

public class Input_tableBean {
   private int id;
   private String name;
   private int age;
   private String gender;
   private String dob;
   private String goal;
   private int win;
   private byte[] photo;
   
   
     public Input_tableBean(int id, String name, int age, String gender, String dob, String goal, int win, byte[] photo) {
    	 this.id=id;
    	 this.name=name;
    	 this.age=age;
    	 this.gender=gender;
    	 this.dob=dob;
    	 this.goal=goal;
    	 this.win=win;
    	 this.photo=photo;
    	 
     }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGoal() {
		return goal;
	}


	public void setGoal(String goal) {
		this.goal = goal;
	}


	public int getWin() {
		return win;
	}


	public void setWin(int win) {
		this.win = win;
	}


	public byte[] getPhoto() {
		return photo;
	}


	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
   
     
}
