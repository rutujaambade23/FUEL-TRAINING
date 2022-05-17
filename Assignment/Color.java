// A Java program to demonstrate working of
// Prototype Design Pattern with example
// of a ColorStore class to store existing objects.

import java.util.HashMap;
import java.util.Map;


abstract class shape implements Cloneable
{
	
	protected String colorName;
	
	abstract void addShape();
	
	public Object clone()
	{
		Object clone = null;
		try
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
}

class SquareShape extends Shape
{
	public SquareShape()
	{
		this.shapeName = "Square";
	}

	@Override
	void addShape()
	{
		System.out.println("square shape added");
	}
	
}

class circleShape extends Color{

	public circleShape()
	{
		this.shaperName = "circle";
	}

	@Override
	void addShape()
	{
		System.out.println("circle shape added");
	}
}

class ShapeStore {

	private static Map<String, Shape> shapeMap = new HashMap<String, Shape>();
	
	static
	{
		colorMap.put("square", new squareShape());
		colorMap.put("circle", new circleShape());
	}
	
	public static Shape getShape(String shapeName)
	{
		return (Shape) shapeMap.get(shapeName).clone();
	}
}


// Driver class
class Prototype
{
	public static void main (String[] args)
	{
		ShapeStore.getShape("blue").addShape();
      ShapeStore.getShape("blue").addShape();
      ShapeStore.getShape("blue").addShape();
      ShapeStore.getShape("blue").addShape();
		
      
      	}
}
