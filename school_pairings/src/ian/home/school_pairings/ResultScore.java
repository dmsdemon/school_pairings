package ian.home.school_pairings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResultScore {

	final private Double basePoints;

	final private Double quietPoints;
	private List<PointsDeducted> pointsDeducted = new ArrayList<PointsDeducted>(); 
	
	public ResultScore(double basePoints)
	{
		this.basePoints = Double.valueOf(basePoints);
		this.quietPoints = Double.valueOf(0);
	}
	
	public ResultScore(double basePoints, double quietpoints)
	{
		this.basePoints = Double.valueOf(basePoints);
		this.quietPoints = Double.valueOf(quietpoints);
	}
	
	public double getBasePoints() {
		return basePoints.doubleValue();
	}
	/**
	 * Work out the points to be allocated for this result
	 * @return
	 */
	public double getPoints()
	{
		return basePoints.doubleValue() + quietPoints.doubleValue() - calculatePointsDeducted();
	}
	private double calculatePointsDeducted()
	{
		double runningtotal = 0;
		for (Iterator<PointsDeducted> iterator = pointsDeducted.iterator(); iterator.hasNext();) {
			PointsDeducted pointsDeducted2 = (PointsDeducted) iterator.next();
			runningtotal += pointsDeducted2.getPointsDeducted();
			
		}
		return runningtotal;
	}
	
}
