package length;

/**
 * 
 * @author Matthew Yoder
 *
 */

public class Foot extends Length {

    /**
	* 1 foot = 0.3048 meters
	*/
	public static final double METERS_PER_FOOT = 0.3048;
	public double temp;

	/**
	 * initialize length of type Foot
	 * @param length
	 */
	public Foot(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	/**
	 * add method that converts everything to meters then to feet
	 */
	public void add(Length other) {
		// TODO Auto-generated method stub
		temp += (other.toMeters() * (1/METERS_PER_FOOT));
	    this.setLength(temp);
	}

	/**
	 * method that returns the type of unit
	 */
	public String getUnit() {
		// TODO Auto-generated method stub
		if(getLength() > 1)
		   return "feet";
		else
		   return "foot";
	}

	/**
	 * method that converts the unit to meters
	 */
	public double toMeters() {
		// TODO Auto-generated method stub
		return getLength() * METERS_PER_FOOT;
	}

}
