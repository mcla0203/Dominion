import java.util.ArrayList;


public class Game {
	
	private String gameState = null;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void setInProgress() {
		gameState = "In Progress";
	}
	
	public void setLookingForPlayers() {
		gameState = "Looking for Players";
	}
	
	public void setComplete() {
		gameState = "Game Over";
	}
	
	public String getGameState() {
		return gameState;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public void addNewPlayer(String name) {
		Player p = new Player(name);
		players.add(p);
	}
	
	/**
	 * Returns the count of how many players there are in
	 * the game.
	 * @return
	 */
	public int nPlayers() {
		return players.size();
	}
	
	/** 
	 * Returns true if all players have indicated they are
	 * ready for the game to start.  Otherwise it will return
	 * false.
	 * @return
	 */
	public boolean allPlayersReady() {
		for(Player p : players) {
			if(!p.isReady()) {
				return false;
			}
		}
		return true;
	}
	
}
