package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pkgEnum.eGameType;

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
	@Test
	public void testTableDeck() {
		Table t = new Table();
		assertNotNull(t);
		
		t.CreateDeck(eGameType.BLACKJACK);
		
		assertNotNull(t.GetTableDeck());
		
		assertEquals(52*6, t.GetTableDeck().getiDeckCount());
	}

}