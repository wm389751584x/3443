package length;
import java.io.*;
import java.util.*;


/**
 * Project that deals with multiple types of lengths
 * @author Matthew Yoder
 *
 */
public class Lab4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Length> mLength = new ArrayList<Length>();
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
		    throw new RuntimeException("failed to open data.txt");
		}
		while (in.hasNextDouble()) {
		    double value = in.nextDouble();
		    String unit = in.next();
		    Length length = null;
		   
		    if(unit.equals("yard") || unit.equals("yards")){
		    	length = new Yard(value);
		    }
		    else if(unit.equals("meter") || unit.equals("meters")){
		    	length = new Meter(value);
		    }
		    else if(unit.equals("inch") || unit.equals("inches")){
		    	length = new Inch(value);
		    }
		    else if(unit.equals("foot") || unit.equals("feet")){
		    	length = new Foot(value);
		    }
		    mLength.add(length);
		    System.out.println(length);
		    		    
		}
		Length min = null;
		Length max = null;
		Length t = mLength.get(0);
		double temp = mLength.get(0).getLength(); 
		int i = 0;
        
		for(i = 1; i < mLength.size(); i++){
        	if(t.compareTo(mLength.get(i)) == 1){
		    	t.setLength(mLength.get(i).toMeters());
        		min = mLength.get(i);
		    }
        }
		
		for(i = 1; i < mLength.size(); i++){
        	if(t.compareTo(mLength.get(i)) == -1){
		    	t.setLength(mLength.get(i).toMeters());
        		max = mLength.get(i);
		    }
        }
		System.out.println();
		System.out.println("Minimum is " + min);
		System.out.println("Maximum is " + max);
		
		Inch inch = new Inch(0.0);
		Yard yard = new Yard(0.0);
		Foot foot = new Foot(0.0);
		Meter meter = new Meter(0.0);
		mLength.get(0).setLength(temp);
		
		
		for(i = 0; i < mLength.size(); i++){
        	inch.add(mLength.get(i));
        	yard.add(mLength.get(i));
        	foot.add(mLength.get(i));
        	meter.add(mLength.get(i));
        }
		
		
		System.out.println();
		
		System.out.println("Sum of Lengths adding First to Last");
		System.out.println(meter);
		System.out.println(inch);
		System.out.println(foot);
		System.out.println(yard);
		
		inch = new Inch(0.0);
		yard = new Yard(0.0);
		foot = new Foot(0.0);
		meter = new Meter(0.0);
				
		for(i = mLength.size() - 1; i > -1; i--){
        	inch.add(mLength.get(i));
        	yard.add(mLength.get(i));
        	foot.add(mLength.get(i));
        	meter.add(mLength.get(i));
        }
		
		
		System.out.println();
		
		System.out.println("Sum of Lengths adding Last to First");
		System.out.println(meter);
		System.out.println(inch);
		System.out.println(foot);
		System.out.println(yard);

	}

}
