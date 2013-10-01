package length;

public class Yard extends Length {
	
	/**
	* 1 yard = 0.9144
	*/
    public static final double METERS_PER_YARD = 0.9144;
    public double temp = 0.0;


    /**
	 * initialize length of type Yard
	 * @param length
	 */
	public Yard(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	/**
	 * add method that converts everything to meters then to yards
	 */
	public void add(Length other) {
		// TODO Auto-generated method stub
		temp += (other.toMeters() * (1/METERS_PER_YARD));
	    this.setLength(temp);

	}

	/**
	 * method that returns the type of unit
	 */
	public String getUnit() {
		// TODO Auto-generated method stub
		if(getLength() > 1)
		   return "yards";
		else
		   return "yard";
	}

	/**
	 * method that converts the unit to meters
	 */
	public double toMeters() {
		// TODO Auto-generated method stub
		return getLength() * METERS_PER_YARD;
	}

}
