// Tushar Asthana, CS110, Lab 05

public class Area 
{
   public static final double PI = 3.14;
   
   public static double getArea(double radius)
   {
       return PI * radius * radius;
   }
   
   public static double getArea(double width, double length)
   {
       return width * length;
   }
   public static double getArea(double radius2,  double height2)
   {
       return  PI * radius * radius * height;
   }  
}