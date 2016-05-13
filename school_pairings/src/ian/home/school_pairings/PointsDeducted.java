package ian.home.school_pairings;

public class PointsDeducted {
	final private double pointsDeducted;
	final public double getPointsDeducted() {
		return pointsDeducted;
	}
	public String getReasonForDeduction() {
		return reasonForDeduction;
	}
	private String reasonForDeduction;
	public PointsDeducted(double pointsDeducted, String reasonForDeduction) {
		super();
		this.pointsDeducted = pointsDeducted;
		this.reasonForDeduction = reasonForDeduction;
	}
	public PointsDeducted(double pointsDeducted) {
		super();
		this.pointsDeducted = pointsDeducted;
		this.reasonForDeduction = "-no reason given-";
	}
}
