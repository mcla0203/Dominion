
public class Player {

	private boolean isReady = false;
	private String name = "";
	
	public Player(String name) {
		this.name = name;
	}

	public void setReady(boolean b) {
		isReady = b;
	}
	
	public boolean isReady() {
		return isReady;
	}
	
	public String getName() {
		return name;
	}
	
}
