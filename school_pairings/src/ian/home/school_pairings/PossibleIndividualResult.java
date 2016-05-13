package ian.home.school_pairings;

public enum PossibleIndividualResult {
WIN(1,"win"),
DRAW(0.5,"draw"),
LOSS(0,"loss"),
DEFAULTGAME(0,"loss-defaulted"),
BYE(0.5,"bye"),
AGAINSTTEACHER(0.5,"played teacher");
	
private final double score;
private final String description;
private PossibleIndividualResult(double score,String description)
{
	this.score = score;
	this.description = description;
}


}
