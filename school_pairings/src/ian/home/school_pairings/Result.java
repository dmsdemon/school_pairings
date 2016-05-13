package ian.home.school_pairings;

public class Result {

	PlayerResult white;
	public PlayerResult getWhite() {
		return white;
	}

	public PlayerResult getBlack() {
		return black;
	}

	PlayerResult black;
	
	public Result(PlayerResult white, PlayerResult black)
	{
		this.white = white;
		this.black = black;
	}
	
	
	
	
	
}
