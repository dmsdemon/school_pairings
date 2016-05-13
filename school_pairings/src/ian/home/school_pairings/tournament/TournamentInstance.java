package ian.home.school_pairings.tournament;

import java.util.Date;

import ian.home.school_pairings.TieBreakTypes;

public class TournamentInstance extends Tournament {
	private int year;
	private Date date_start;
	private Date date_end;
	private int rounds;
	private boolean hasPlayoff;
	private TieBreakTypes tieBreak;
	public TournamentInstance(String name, int year, Date date_start, Date date_end, int rounds, boolean hasPlayoff,
			TieBreakTypes tieBreak) {
		super(name);
		this.year = year;
		this.date_start = date_start;
		this.date_end = date_end;
		this.rounds = rounds;
		this.hasPlayoff = hasPlayoff;
		this.tieBreak = tieBreak;
	}
	public int getYear() {
		return year;
	}
	public Date getDate_start() {
		return date_start;
	}
	public Date getDate_end() {
		return date_end;
	}
	public int getRounds() {
		return rounds;
	}
	public boolean isHasPlayoff() {
		return hasPlayoff;
	}
	public TieBreakTypes getTieBreak() {
		return tieBreak;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}
	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public void setHasPlayoff(boolean hasPlayoff) {
		this.hasPlayoff = hasPlayoff;
	}
	public void setTieBreak(TieBreakTypes tieBreak) {
		this.tieBreak = tieBreak;
	}




}
