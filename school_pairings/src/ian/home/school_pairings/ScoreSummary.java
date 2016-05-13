package ian.home.school_pairings;

public class ScoreSummary {
	private Player player;
	private double bareScore;
	private int roundsPlayed;
	private double compositeScore;
	
	public ScoreSummary(Player player, double bareScore, int roundsPlayed, double compositeScore) {
		super();
		this.player = player;
		this.bareScore = bareScore;
		this.roundsPlayed = roundsPlayed;
		this.compositeScore = compositeScore;
	}
	public Player getPlayer() {
		return player;
	}
	public double getBareScore() {
		return bareScore;
	}
	public int getRoundsPlayed() {
		return roundsPlayed;
	}
	public double getCompositeScore() {
		return compositeScore;
	}
	
	
}
