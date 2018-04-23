package pkgCore;

import java.util.HashMap;
import java.util.UUID;
import pkgEnum.eGameType;

public class GamePlayBlackJack extends GamePlay {

	private HashMap<UUID, HandBlackJack> hmGameHands = new HashMap<UUID, HandBlackJack>();
	
	public GamePlayBlackJack(Table t) {
		super(eGameType.BLACKJACK);
		
		t.CreateDeck(eGameType.BLACKJACK);
		this.AddPlayersToGame(t.GetTable());
		
		for (Player p : this.GetPlayersInGame()) {
			hmGameHands.put(p.getPlayerID(), new HandBlackJack());
		}
	}

	/*public void DrawCardToHand(Player p) {
		HandBlackJack hBP = (HandBlackJack)hmGameHands.get(p.getPlayerID());
		hBP.Draw(this.getTable().getTableDeck());
		
		hmGameHands.put(p.getPlayerID(), hBP);
}*/
	
}