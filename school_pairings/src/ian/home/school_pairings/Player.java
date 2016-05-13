package ian.home.school_pairings;

public class Player {
	private final Guid guid;
	public Player(Guid guid)
	{
		if (guid==null)
			 throw new IllegalArgumentException("parameters cannot be null");
		this.guid = guid;
	}
}
