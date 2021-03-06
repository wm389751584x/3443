import java.awt.*;
import java.util.ArrayList;

/**
 * The DemoModel class holds the information that is used by the GUI.
 * Ask yourself the question, what data would be needed to recreate
 * the state of the GUI?  This data is what should be stored in the
 * model.
 * <p>
 * The instance variables are from Fig. 14.34.
 * @author Tom Bylander
 */
public class DemoModel {
    
	/** 
	 * An ArrayList of java.awt.Point references 
	 */
	private ArrayList<Point> points;
	
	/** 
	 * An ArrayList of java.awt.Color references 
	 */
	private ArrayList<Color> colors;
	
	/** 
	 * The color selected by the user 
	 */
	private Color selectedColor;
	
	public DemoModel() {
		points = new ArrayList<Point>();
		colors = new ArrayList<Color>();
		selectedColor = Color.CYAN;
	}
	
	/**
	 * Add a Point to the points arraylist.
	 * @param point the Point to be added to points.
	 * Add a Color to the colors arraylist.
	 */
	public void addPoint(Point point) {
		points.add(point);
		colors.add(getSelectedColor());
	}
	
	/**
	 * Returns point at index i.
	 * Returns null if no such point exists.
	 * @param i
	 */
	public Point getPoint(int i) {
		if (i >= 0 && i < points.size()) {
			return points.get(i);
		}
		return null;
	}
	
	/**
	 * Store the color that the user selected.
	 * @param color the color selected by the user
	 */
	public void setSelectedColor(Color color) {
		selectedColor = color;
	}
	
	/**
	 * @return the color selected by the user
	 */
	public Color getSelectedColor() {
		return selectedColor;
	}
	
	/**
	 * Returns color at index i.
	 * Returns null if no such color exists.
	 * @param i
	 * @return the color of a point
	 */
	
	public Color getColor(int i) {
		if (i >= 0 && i < colors.size()) {
			return colors.get(i);
		}
		return null;
	}
}
