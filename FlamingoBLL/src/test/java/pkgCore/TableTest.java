package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void testTable() {
		Table t = new Table();
		Player p = new Player("Bert", 123);
		t.AddPlayerToTable(p);
		t.GetPlayerFromTable(p);
		t.RemovePlayerFromTable(p);
	}

}