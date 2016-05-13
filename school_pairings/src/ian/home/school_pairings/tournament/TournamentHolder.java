package ian.home.school_pairings.tournament;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ian.home.school_pairings.Player;
import ian.home.school_pairings.Round;

public class TournamentHolder {

	private TournamentInstance tournamentinstance;

	private List<Player> players;

	private List<Round> rounds; 
	
	private Map<Player,Withdrawn> withdrawnPlayers = new HashMap<Player,Withdrawn>();

	public TournamentHolder(TournamentInstance tournamentinstance) {
		super();
		this.tournamentinstance = tournamentinstance;
	}

	public TournamentInstance getTournamentinstance() {
		return tournamentinstance;
	}

	public void withdrawPlayer(Withdrawn withdrawal)
	{
		if (withdrawal!=null && players.contains(withdrawal.getPlayer()))
			withdrawnPlayers.put(withdrawal.getPlayer(), withdrawal);
	}
	
	public void addPlayer(Player player)
	{
		if (player!=null)
			players.add(player);
	}
	
	public void addPlayers(List<Player> players)
	{
		if (players!=null)
			players.addAll(players);
	}
	
	public void removePlayer(Player player)
	{
		if (player!=null)
			players.remove(player);
	}
	
	public void removePlayers(List<Player> players)
	{
		if (players!=null)
			players.removeAll(players);
	}
	
	public void addRound(Round round)
	{
		if (round!=null)
			rounds.add(round);
	}
	
	public void addRounds(List<Round> round)
	{
		if (round!=null)
			rounds.addAll(round);
	}
	
	public void removeRound(Round round)
	{
		if (round!=null)
			rounds.remove(round);
	}

	public void clearPlayers()
	{
		players.clear();
	}
	
	public void clearRounds()
	{
		rounds.clear();
	}
}
