package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import pkgEnum.eGameType;

public class Table {

	private UUID TableID;
	private HashMap<UUID, Player> hmTablePlayers = new HashMap<UUID,Player>();
	private Deck TableDeck;
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	protected void CreateDeck(eGameType eGT) {
		switch(eGT) {
		case BLACKJACK:
			TableDeck = new Deck(6);
			break;
		case POKER:
			TableDeck = new Deck();
			break;
		}
	}
	
	public void AddPlayerToTable(Player p)
	{
		hmTablePlayers.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		hmTablePlayers.remove(p.getPlayerID());		
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		return hmTablePlayers.get(p.getPlayerID());	
		
	}
	public void ClearTable()
	{
		hmTablePlayers.clear();	
	}
	public ArrayList<Player> GetTable() {
		return new ArrayList<Player> (hmTablePlayers.values());
	}
	public Deck GetTableDeck() {
		return this.TableDeck;
	}
}
