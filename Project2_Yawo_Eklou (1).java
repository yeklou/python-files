import java.util.Scanner;  //   Needed for this program
/**
This program allows to Determine the BTU's per hour neede to cool a room
*/
public class Project2_Yawo_Eklou
{
  public static void main(String[] args)
 { 
   String name;
   int shade;
   double width;
   double length;
   double area;
   int again;
  // Create scanner object
   Scanner Keyboard = new Scanner(System.in);
    
do
 {    
   // Room name
   name = Keyboard.nextLine();
   System.out.println("Room name:"+ name);
   // Room area
   System.out.print("Enter the length (in feet):");
   length = Keyboard.nextDouble();
   System.out.print("Enter the width (in feet):");
   width = Keyboard.nextDouble();
   area = length * width;
   System.out.println("Room area( in square feet):"+ area);
   System.out.print("Enter room shade:( 1 for little, 2 " + 
                           "for Moderate and 3 for Abundant):");
   // Room shade                                                  
   shade = Keyboard.nextInt();
    {
     while(shade>3)
      System.out.println("Please, enter 1 or 2 or 3");
    }
    
    if(shade == 1)
      System.out.print("Room shade:Little\n");
    else if(shade == 2)
       System.out.print("Room shade: Moderate\n");
    else
       System.out.print("Room shade: abundant\n"); 
       
  // BTU's per hour needed
    
    if( area < 250 && shade == 1)
     System.out.print("BTS's per hour needed:7000");
    else if(area < 250 && shade == 2)
     System.out.print("BTS' per hour needed:5500");
    else if(area < 250 && shade == 3)
     System.out.print("BTU's per hour needed:5000");
    else if(area <= 500 && shade == 1); 
     System.out.print("BTU's per hour needed:12000");
    else if(area <= 500 && shade == 2)
     System.out.print("BTU's per hour needed:10000");
    else if(area <= 500 && shade == 3)
     System.out.print("BTU's per hour needed:8000");
    else if(area <= 1000 && shade == 1)
     System.out.print("BTU's per hour needed:21000");
    else if(area <= 1000 && shade == 2)
     System.out.print("BTU' per hour needed:17500");
    else if(area <= 1000 && shade == 2)
     System.out.print("BTU's per hour needed:15000");
    else if(area > 1000 && shade == 1)
     System.out.print("BTU's per hour needed:28000");
    else if(area > 1000 && shade == 2)
     System.out.print("BTU's per hour needed:24000");
    else
     System.out.print("BTU's per hour needed:20000");
     
      {
       System.out.print(" Enter 1 to enter information for the next room" +
                    "and 0 if there is no more room:");
                    again = Keyboard.nextInt();
      }                    
    } while (again == 1);                  
   }
 }



   
      