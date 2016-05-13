package ian.home.school_pairings;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PairingUtils {
	public static List<Pairing> AllocateBoards(List<Pairing> pairings, Scores scores)
	{
		final Comparator <Pairing> oldStyleComparator = createOldStyleComparator(pairings, scores); 
		pairings.sort(oldStyleComparator);
		
//		// Learning: next line doesn't work; needs board to be final so can't increment
//		{
//			pairings.forEach(pairing->{pairing.setBoard(board++);});
//		}
		
		// apply the board number
		applyBoardNumbers(pairings,1);
		return pairings;
		
	}

	private static void applyBoardNumbers(List<Pairing> pairings,int firstBoard)
	{
		// apply the board number
		for (Iterator<Pairing> iterator = pairings.iterator(); iterator.hasNext();) {
			Pairing pairing = (Pairing) iterator.next();
			pairing.setBoard(firstBoard++);
		}
		
	}
	
	public static List<Pairing> AllocateBoards(List<Pairing> pairings, Scores scores, int firstBoard)
	{
		final Comparator <Pairing> oldStyleComparator = createOldStyleComparator(pairings, scores); 
		pairings.sort(oldStyleComparator);
		
		// apply the board number
		applyBoardNumbers(pairings,firstBoard);
		return pairings;
		
	}

	
	public static Comparator <Pairing> createOldStyleComparator(List<Pairing> _pairings, Scores _scores)
	{
		final Comparator <Pairing> oldStyleComparator = new Comparator<Pairing>() 
		{
				private List<Pairing> pairings = _pairings;
				private Scores scores = _scores;
			
			  private double calculateCompositeScore(ScoreSummary score)
			  {
				  double count = -999;
				  if (score != null)
				  {
					  // How to calculate weighting for pairing order
					  // - Score is most important; large multiplier
					  // - make rounds player negative for weighting
					  count = (score.getRoundsPlayed() * -1) + (score.getBareScore() * 1000);
				  }
				  return count;
				  
			  }
			
			
			  @Override
			  public int compare(Pairing o1, Pairing o2) {
				  double white1 = calculateCompositeScore(scores.getScore(o1.getPlayer_white()));
				  double black1 = calculateCompositeScore(scores.getScore(o1.getPlayer_black()));

				  double white2 = calculateCompositeScore(scores.getScore(o2.getPlayer_white()));
				  double black2 = calculateCompositeScore(scores.getScore(o2.getPlayer_black()));

				  final int result;
				  if (Math.max(white1, black1) == Math.max(white2, black2))
					  if (white1==white2)
						  if (black1==black2)
							  result = 0;
						  else
							  result = (black1>black2?1:-1);
					  else
						  result = (white1>white2?1:-1);
				  else
					  result = (Math.max(white1, black1)>Math.max(white2, black2)?1:-1);
						  
			      return result;
			  }
		};
		return oldStyleComparator;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
