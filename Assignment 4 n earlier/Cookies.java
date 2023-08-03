import java.util.Scanner;

public class Cookies 
{
   public static void main (String [] args)
   
      {
         double sugar = 1.5;
         double butter = 1;
         double flour = 2.75;
         double batch;
         double cookies ;
         double newsugar;
         double newbutter;
         double newflour;
         double roundsugar;
         double roundbutter;
         double roundflour;
         
         Scanner keyboard = new Scanner(System.in);

         System.out.print("Enter the number of cookies :"); 
         cookies = keyboard.nextInt();
         
         batch = cookies / 48;
         newsugar = sugar * batch;
         newbutter = butter * batch;
         newflour = flour * batch; 
         roundsugar = Math.round(newsugar*10.0)/10.0;
         roundbutter = Math.round(newbutter*10.0)/10.0;
         roundflour = Math.round(newflour*10.0)/10.0;

         
         System.out.print("To make"+" " + cookies + " " + "cookies, you will need: \n");
         System.out.print(roundsugar + " " + "cups of sugar.\n");
         System.out.print(roundbutter + " " + "cups of butter.\n");
         System.out.print(roundflour + " " + "cups of flour.\n");
         
      }
}         
         