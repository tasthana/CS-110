//CS110, Tushar Asthana, Lab 5, 
//demo showing Area.java results  

import java.util.Scanner;

public class AreaDemo
{

   /**
   * @param args
   */
   public static void main(String[] args) 
   {
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter radius of circle");
       double radius = scan.nextDouble();
       
       System.out.println("Circle Area : "+Area.getArea(radius));
       System.out.println("Please enter the width and length of Ractangle");
       double width = scan.nextDouble();
       double length = scan.nextDouble();
       
       System.out.println("Ractangle Area : "+Area.getArea(width, length));
       System.out.println("Please enter the width, length and height of Cylinder");
       double cylWidth = scan.nextDouble();
       double cylLength = scan.nextDouble();
       double cylHeight = scan.nextDouble();
       
             
      
   }

}