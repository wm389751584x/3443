package length;

public class Inch extends Length {
	
	/**
	* 1 inch = 0.0254 meters
	*/
    public static final double METERS_PER_INCH = 0.0254;
    public double temp;


    /**
	 * initialize length of type Inch
	 * @param length
	 */
	public Inch(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	/**
	 * add method that converts everything to meters then to inches
	 */
	public void add(Length other) {
		// TODO Auto-generated method stub
	    temp += (other.toMeters() * (1/METERS_PER_INCH));
	    this.setLength(temp);
	}

	/**
	 * method that returns the type of unit
	 */
	public String getUnit() {
		// TODO Auto-generated method stub
		if(getLength() > 1)
		   return "inches";
		else
		   return "inch";
	}

	/**
	 * method that converts the unit to meters
	 */
	public double toMeters() {
		// TODO Auto-generated method stub
		return getLength() * METERS_PER_INCH;
	}

}
