package ian.home.school_pairings;

import java.util.Map;
import java.util.TreeMap;

public class Scores {
	private Map<Player,ScoreSummary> scores = new TreeMap<Player,ScoreSummary>();
	
	public void addScore(ScoreSummary score)
	{
		if (score != null)
			scores.put(score.getPlayer(), score);
	}
	
	public ScoreSummary getScore(Player player)
	{
		if (player == null) return null;
		return scores.get(player);
	}
}
