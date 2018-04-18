package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {

	@Test
	public void testGamePlay() {
		eGameType eGame = eGameType.BLACKJACK;
		GamePlayBlackJack gp = new GamePlayBlackJack(eGame);
		
		Player p1 = new Player("John", 123);
		Player p2 = new Player("Jim", 456);
		
		ArrayList<Player> PList = new ArrayList<>();
		PList.add(p1);
		PList.add(p2);
		
		gp.AddPlayersToGame(PList);
		
		assertEquals("John",gp.GetPlayerInGame(p1).getPlayerName());
		assertEquals(123, gp.GetPlayerInGame(p1).getiPokerClientID());
		assertEquals(p1.getPlayerID(), gp.GetPlayerInGame(p1).getPlayerID());
		
		assertEquals("Jim",gp.GetPlayerInGame(p2).getPlayerName());
		assertEquals(456, gp.GetPlayerInGame(p2).getiPokerClientID());
		assertEquals(p2.getPlayerID(), gp.GetPlayerInGame(p2).getPlayerID());
		
		gp.RemovePlayerFromGame(p1);
		gp.RemovePlayerFromGame(p2);
		assertEquals(null,gp.GetPlayerInGame(p1));
		assertEquals(null,gp.GetPlayerInGame(p2));
	}

}
