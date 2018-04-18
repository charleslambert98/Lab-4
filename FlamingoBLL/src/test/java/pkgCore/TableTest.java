package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void testTable() {
		Table t = new Table();
		Player p = new Player("John", 123);
		t.AddPlayerToTable(p);
		assertEquals("John", t.GetPlayerFromTable(p).getPlayerName());
		assertEquals(123, t.GetPlayerFromTable(p).getiPokerClientID());
		assertEquals(p.getPlayerID(), t.GetPlayerFromTable(p).getPlayerID());
		t.RemovePlayerFromTable(p);
		assertEquals(null, t.GetPlayerFromTable(p));
	}

}