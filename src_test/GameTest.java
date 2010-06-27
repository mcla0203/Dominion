import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class GameTest {

	@Test
	public void testSetInProgress() {
		Game g = new Game();
		assertNull(g.getGameState());
		g.setInProgress();
		assertNotNull(g.getGameState());
	}

	@Test
	public void testSetLookingForPlayers() {
		Game g = new Game();
		assertNull(g.getGameState());
		g.setLookingForPlayers();
		assertNotNull(g.getGameState());
	}

	@Test
	public void testSetComplete() {
		Game g = new Game();
		assertNull(g.getGameState());
		g.setComplete();
		assertNotNull(g.getGameState());
	}

	@Test
	public void testNPlayers() {
		Game g = new Game();
		assertEquals(0, g.nPlayers());
		g.addNewPlayer("Bob");
		g.addNewPlayer("Bob2");
		assertEquals(2, g.nPlayers());
	}

	@Test
	public void testAllPlayersReady() {
		Game g = new Game();
		g.addNewPlayer("Bob");
		g.addNewPlayer("Bob2");
		assertFalse(g.allPlayersReady());
		
		for(Player p : g.getPlayers()) {
			p.setReady(true);
		}
		assertTrue(g.allPlayersReady());
	}

}
