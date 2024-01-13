import java.util.Scanner; //import for scanner

public class ParkingTicketDemo
{  
   /**
   Write a program that demonstrates how these classes collaborate.
   */
   
   public static void main(String[]args)
   {
      //declare variables
      String make = "", model = "", color = "", licenseNum = "";
      String officerName = "", badgeNum = "";
      int minutesParked = 0, parkingTimePurchased = 0;
      double fine = 0;
            
      //create a scanner object 
      Scanner scan = new Scanner(System.in);
      
      //prompt for make of car
      System.out.print("Enter the make of your car: ");
      make = scan.nextLine();
      
      //prompt for model of car
      System.out.print("Enter the model of your car: ");
      model = scan.nextLine();
      
      //prompt for color of car
      System.out.print("Enter the color of your car: ");
      color = scan.nextLine();
      
      //prompt for license number of car
      System.out.print("Enter the license number of your car: ");
      licenseNum = scan.nextLine();
      
      //prompt for color of car
      System.out.print("Enter the minutes parked for your car: ");
      minutesParked = scan.nextInt();
      
      //prompt for color of car
      System.out.print("Enter the parking time purchased for your car: ");
      parkingTimePurchased = scan.nextInt();
      
      //clear buffer
      scan.nextLine();
      
      //if statement if minutes are greater than minutes purchased
      if(minutesParked > parkingTimePurchased)
      {
         //prompt for officers name
         System.out.print("Enter the officers name: ");
         officerName = scan.nextLine();
         
         //prompt for officers badge number
         System.out.print("Enter the officers badge number: ");
         badgeNum = scan.nextLine();
      }
      
      //create objects
      ParkedCar car = new ParkedCar(make, model, color, licenseNum, minutesParked);
      ParkingMeter meter = new ParkingMeter(parkingTimePurchased);
      //PoliceOfficer policeOfficer = new PoliceOfficer(officerName, badgeNum, car, ticket, meter);
      PoliceOfficer policeOfficer = new PoliceOfficer(officerName, badgeNum, car, meter);
      ParkingTicket ticket = new ParkingTicket(car,fine,meter,policeOfficer);

      //output info for car
      
      //determine if fine is required depending on time purchased and time parked
      System.out.println("\nParking Time Expired? "+policeOfficer.getTimeExpired());
      
      //if Time Expired is "Yes", then output Officer Information
      if(policeOfficer.getTimeExpired().equals("Yes"))
      {
         //calculate fine and output ticket
         System.out.println("\n--------------Ticket Below----------------");
         System.out.println(ticket);
         System.out.println("\nFine: $"+ticket.calculateFine());
      }
      else
      {
         System.out.println("No ticket is required.");
      }
   }
   
}