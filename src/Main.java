
public class Main {
	
	/**
	 * Main method which is called when the application
	 * first launches.
	 * @param argv
	 */
	public static void main(String[] argv) {
		System.out.println("Launching Dominion...");
		Game g = new Game();
		g.setLookingForPlayers();
	}

}
