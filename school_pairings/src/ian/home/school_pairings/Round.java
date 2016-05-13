package ian.home.school_pairings;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Round {
	final private int roundNumber;
	private Date startDate;
	private Date endDate;
	private List<Pairing> pairings = new ArrayList<Pairing>();
	public Round(int roundNumber) {
		super();
		this.roundNumber = roundNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<Pairing> getPairings() {
		return pairings;
	}
	public void setPairings(List<Pairing> pairings) {
		this.pairings = pairings;
	}
	public int getRoundNumber() {
		return roundNumber;
	}
	
	
	
	// board number 
}
