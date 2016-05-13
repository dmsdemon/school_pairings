package ian.home.school_pairings;

public enum RatingTypes {
ECF,
FIDE_ELO
;

public static String convert(String rating, RatingTypes fromtype, RatingTypes totype)
{
	final String retRating;
	if (rating==null || fromtype==null || totype == null)
		throw new NullPointerException("cannot pass null values to this call");
	
	if (fromtype==totype)	// no work needed if identity
		return rating;
	
	if (fromtype == ECF)
	{
		switch (totype) {
		case FIDE_ELO:
			final double ecf = Double.parseDouble(rating); 
			final long fide = Math.round((7.5*ecf)+700); 
			retRating = String.valueOf(fide);
			break;

		default:
			retRating = rating;
			break;
		}
	}
	else if (fromtype == FIDE_ELO)
	{
		switch (totype) {
		case ECF:
			final double fide = Integer.parseInt(rating); 
			final long ecf = Math.round((fide-700)/7.5); 
			retRating = String.valueOf(ecf);
			break;

		default:
			retRating = rating;
			break;
		}
	}
	else
	{
		// FIXME section not yet implemented
		retRating = rating;
	}
	return retRating;
		
			
}


}
