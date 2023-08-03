public class ColoredCircle
{
    //declare private instance variables
    private double radius;
    private String color; 
   
   
   //default constructor, initializes radius and color to default values
   public ColoredCircle()
   {
      this(1,"blue");
   }
   
   /**
	 * constructor initializes ColoredCircle with given radius and default color
	 * @param radius of the circle
	 */
   public ColoredCircle(double radius)
   {
      this(radius, "blue");
   }
   
   /**
	 * constructor initializes ColoredCircle with default radius and given color
	 * @param color of the circle
	 */
   public ColoredCircle(String color)
   {
      this(1, color);
   }
   
   /**
	 * constructor initializes ColoredCircle with given radius and given color
	 * @param color
	 * @param radius
	 */
   public ColoredCircle(double radius, String color)
   {
      setRadius(radius);
      setColor(color);
   }
   
   //getter
   public getRadius()
   {
      return radius;
   }
   
   //setter
   public setRadius(double radius)
   {
      this.radius = Math.abs(radius);
   }
   
   //getter
   public String getColor()
   {
      return color;
   }
   
   //setter
   public setColor(String color)
   {
      this.color = color;
   } 
   
   /**
	 * returns area of circle 
	 * @return area
    */
   public double getArea()
   {
      return Math.PI * Math.pow(radius, 2);
   }

}  
      
      
