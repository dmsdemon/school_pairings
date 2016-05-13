package ian.home.school_pairings;

public class Pairing {
	final private Player player_white;
	public Player getPlayer_white() {
		return player_white;
	}

	public Player getPlayer_black() {
		return player_black;
	}

	public int getBoardNumber() {
		return board;
	}

	final private Player player_black;
	private int board;
	
	public Pairing (Player white, Player black)
	{
		player_white = white;
		player_black = black;
	}

	public void setBoard(int board)
	{
		this.board = board;
	}
}
