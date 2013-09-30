package length;

/**
 * Meter class that extends the Length class
 * @author Matthew Yoder
 *
 */
public class Meter extends Length {
	
	public double temp;

	/**
	 * initialize length of type Meter
	 * @param length
	 */
	public Meter(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	/**
	 * add method that converts everything to meters
	 */
	public void add(Length other) {
		// TODO Auto-generated method stub
		temp += (other.toMeters());
	    this.setLength(temp);

	}

	/**
	 * method that returns the type of unit
	 */
	public String getUnit() {
		// TODO Auto-generated method stub
		if(getLength() > 1)
		   return "meters";
		else
		   return "meter";
	}

	/**
	 * method that converts the unit to meters
	 */
	public double toMeters() {
		// TODO Auto-generated method stub
		return getLength();
	}

}
