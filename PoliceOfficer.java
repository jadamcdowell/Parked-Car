public class PoliceOfficer
{
   /**
   The PoliceOfficer Class: This class should simulate a police officer inspecting parked cars. The class’s responsibilities are as follows:
   – To know the police officer’s name and badge number
   – To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired
   */
   
   //declare fields
   private String officerName;
   private String badgeNum;
   private ParkedCar car;
   private ParkingMeter meter;
   
   //no arg constructor
   public PoliceOfficer()
   {
      officerName = "";
      badgeNum = "";
      car = car;//new ParkedCar(car);
      meter = meter;//new ParkingMeter(meter);
   }
   /**
   Constructor with args
   @param officerName The officer's name
   @param badgeNum The officer's badge number
   @param car The info for the car
   @param meter The parking meter
   */
   public PoliceOfficer(String officerName, String badgeNum, ParkedCar car, ParkingMeter meter)
   {
      this.officerName = officerName;
      this.badgeNum = badgeNum;
      this.car = new ParkedCar(car);
      this.meter = new ParkingMeter(meter);
   }

   /**
	COPY CONSTRUCTOR
	@param obj A PoliceOfficer object to make a copy
	*/
   
	public PoliceOfficer(PoliceOfficer obj)
	{
		officerName = obj.officerName;
      badgeNum = obj.badgeNum;
      car = obj.car;
      meter = obj.meter;
	}
   
   
   //setter method 
   
   /**
   This is the setter method for the officer's name
   @param officerName The officer Name 
   */
   public void setOfficerName(String officerName)
   {
      this.officerName = officerName;
   }
   
   /**
   This is the setter method for the officer's badge number
   @param badgeNum The officer badgeNum
   */
   public void setBadgeNum(String badgeNum)
   {
      this.badgeNum = badgeNum;
   }
   
   /**
   This is the setter method for the car
   @param car The info for the car
   */
   public void setCar(ParkedCar car)
   {
      this.car = new ParkedCar(car);
   }
   
   /**
   This is the setter method for the car
   @param car The info for the car
   */
   /**
   public void setTicket(ParkingTicket ticket)
   {
      this.ticket = new ParkingTicket(ticket);
   }
   */
   /**
   This is the setter method for the car
   @param meter The meter info for the car
   */
   public void setMeter(ParkingMeter meter)
   {
      this.meter = new ParkingMeter(meter);
   }
   
   //getter methods
   
   /**
   This is the getter method for the officer's name
   @return officerName The officer Name 
   */
   public String getOfficerName()
   {
      return this.officerName;
   }
   
   /**
   This is the getter method for the officer's badge number
   @return badgeNum The officer badgeNum
   */
   public String getBadgeNum()
   {
      return this.badgeNum;
   }
   
   /**
   This is the getter method for the car
   @return car The info for the car
   */
   public ParkedCar getCar()
   {
      return new ParkedCar(car);
   }
   
   /**
   This is the setter method for the car
   @param car The info for the car
   */
   /**
   public ParkingTicket getTicket()
   {
      return new ParkingTicket(ticket);
   }
   */
   /**
   This is the getter method for the car
   @return meter The meter info for the car
   */
   public ParkingMeter getMeter()
   {
      return new ParkingMeter(meter);
   }
   
   /**
    – To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired
   */
   public String getTimeExpired()
   {
      //declare variable
      String expired = "";
      
      //if statement
      if(car.getMinutesParked() > meter.getParkingPurchased())
      {
         expired = "Yes";
      }
      else
      {
         expired = "No";   
      }
      return expired;
   }
   
   /**
      – To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired
   */
   public double getTicketInfo()
   {
      //declare variable
      double fine = 0;
      
      //if statement
      if(getTimeExpired().equals("Yes"))
      {
         //fine = ticket.calculateFine();
      }
      else
      {
         fine = 0;
      }
      return fine;
   }
   /**
   public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter)
   {
      ParkingTicket ticketIssued = new ParkingTicket(ticketIssued);
      
      //declare constants
      final int FIRST_HOUR = 25;
      final int ADDITIONAL_HOUR = 10;
      
      //declare variable
      double fine = 0;
      
      int timeOver = (car.getMinutesParked()-meter.getParkingPurchased());      
      
      if(getTimeExpired().equals("Yes"))
      {
         //if statement
         if(car.getMinutesParked() > meter.getParkingPurchased())
         {
            if(timeOver > 1)
            {
               ticketIssued.getFine() += FIRST_HOUR+(timeOver-1)*ADDITIONAL_HOUR;
            }
            else if(timeOver <= 1)
            {
               ticketIssued.getFine() += FIRST_HOUR;
            }
         }
         else
            ticketIssued.getFine() = 0;
      }
      else //(getTimeExpired().equals("No")) 
         ticketIssued.getFine() = 0;
         
      return ticketIssued;
   }
   */

   
}