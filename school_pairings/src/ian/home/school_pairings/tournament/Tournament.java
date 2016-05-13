package ian.home.school_pairings.tournament;

public class Tournament {
	final private String name;
	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	final private String school;
	
	public Tournament(String name)
	{
		this.name = name;
		this.school = "N/A"; 
	}

	public Tournament(String name, String school)
	{
		this.name = name;
		this.school = school; 
	}

}
