package ian.home.school_pairings;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rating_fide = "1700";
		String rating_ecf = RatingTypes.convert(rating_fide, RatingTypes.FIDE_ELO, RatingTypes.ECF);
		System.out.println("FIDE->ECF:" + rating_fide + "->" + rating_ecf );
		String rating_fide2 = RatingTypes.convert(rating_ecf, RatingTypes.ECF, RatingTypes.FIDE_ELO);
		System.out.println("ECF -> FIDE:" + rating_ecf + "->" + rating_fide2);
		
	}

}
