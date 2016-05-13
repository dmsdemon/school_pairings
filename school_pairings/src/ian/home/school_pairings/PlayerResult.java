package ian.home.school_pairings;

public class PlayerResult {

	private final Player player;
	public Player getPlayer() {
		return player;
	}

	public ResultScore getResult() {
		return result;
	}

	private final ResultScore result;
	
	public PlayerResult(Player player, ResultScore result)
	{
		this.player = player;
		this.result = result;
	}

	
}
