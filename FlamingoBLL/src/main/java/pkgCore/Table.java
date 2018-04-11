package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private HashMap<UUID, Player> hmTablePlayers = new HashMap<UUID,Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		hmTablePlayers.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		hmTablePlayers.remove(p);		
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		hmTablePlayers.get(p);	
		return null;
	}
	public void ClearTable()
	{
		hmTablePlayers.clear();	
	}
}
