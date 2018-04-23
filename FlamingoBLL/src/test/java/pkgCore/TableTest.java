package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TableTest {

	@Test
	public void testTable() {
		Table t = new Table();
		assertNotNull(t);
		
		Player p = new Player("John", 123);
		ArrayList<Player> pList = new ArrayList<>();
		pList.add(p);
		assertEquals(1, pList.size());
		
		t.AddPlayerToTable(p);
		assertEquals("John", t.GetPlayerFromTable(p).getPlayerName());
		assertEquals(123, t.GetPlayerFromTable(p).getiPokerClientID());
		assertEquals(p.getPlayerID(), t.GetPlayerFromTable(p).getPlayerID());
		
		assertEquals(1, t.GetTable().size());
		
		t.RemovePlayerFromTable(p);
		assertNull(t.GetPlayerFromTable(p));
	}

}