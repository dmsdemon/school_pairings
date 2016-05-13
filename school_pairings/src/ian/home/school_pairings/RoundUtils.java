package ian.home.school_pairings;

import java.util.List;

public class RoundUtils {
	public static int calculateNextRound(List<Round> roundsSoFar)
	{
		int nextround = 0;
		for (Round round : roundsSoFar) {
			if (round.getRoundNumber() > nextround)
				nextround = round.getRoundNumber();
		}
		return nextround+1;
	}
	
	
}
