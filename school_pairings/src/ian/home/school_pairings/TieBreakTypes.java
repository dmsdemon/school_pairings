package ian.home.school_pairings;

public enum TieBreakTypes {
PLAYOFF,    // no tiebreak via scoring
FIDE_RECOMMENDED,
EQUAL_FOR_SAME_SCORE    // all players on the same score get the same position in tournament
;
	
/* Fide-recommended
 * For Swiss chess tournaments for individuals (not teams), FIDE recommends - in an Annex to the FIDE Tournament Regulations regarding tiebreaks:

The result of the direct encounter(s) between the players (if any)
The greater number of wins
The greater number of games with Black (unplayed games shall be counted as played with White)
The Average Rating of Opponents Cut (the average rating of opponents, excluding one or more of the ratings of the opponents, starting from the lowest-rated opponent)
Buchholz Cut 1 (the Buchholz score reduced by the lowest score of the opponents)
Buchholz (the sum of the scores of each of the opponents of a player)
Sonneborn-Berger
 */

}
