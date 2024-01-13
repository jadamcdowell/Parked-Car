public class ParkingTicket
{

   /**
   The ParkingTicket Class: This class should simulate a parking ticket. The class’s responsibilities are as follows:
      –To report the make, model, color, and license number of the illegally parked car
      –To report the name and badge number of the police officer issuing the ticket
   */
   
   //declare fields
   private ParkedCar car;
   private double fine;
   private ParkingMeter meter;
   private PoliceOfficer policeOfficer;
   
   /**
   Constructor with args
   @param car The info for the car
   @param fine The fine for the ticket
   */
   public ParkingTicket(ParkedCar car, double fine, ParkingMeter meter, PoliceOfficer policeOfficer)
   {
      this.car = new ParkedCar(car); 
      this.fine = fine;  
      this.meter = new ParkingMeter(meter);
      this.policeOfficer = new PoliceOfficer(policeOfficer);
   }
   
   /**
	COPY CONSTRUCTOR
	@param obj A ParkingTicket object to make a copy
	*/
	public ParkingTicket(ParkingTicket obj)
	{
		car = obj.car; 
      fine = obj.fine;
      meter = obj.meter;
      policeOfficer = obj.policeOfficer;
	}
   
   //setter methods
   
   /**
   This is the setter method for the car
   @param car The info for the car
   */
   public void setCar(ParkedCar car)
   {
      this.car = new ParkedCar(car);
   }
   
   /**
   This is the setter method for the fine
   @param fine The info for the fine
   */
   public void setFine(double fine)
   {
      this.fine = fine;
   }
   
   /**
   This is the setter method for the car
   @param meter The meter info for the car
   */
   public void setMeter(ParkingMeter meter)
   {
      this.meter = new ParkingMeter(meter);
   }
   
   /**
   This is the setter method for the police officer info
   @param policeOfficer The police officer info
   */
   public void setOfficer(PoliceOfficer policeOfficer)
   {
      this.policeOfficer = new PoliceOfficer(policeOfficer);
   }
   
   //getter methods
   
   /**
   This is the getter method for the car
   @return car The info for the car
   */
   public ParkedCar getCar()
   {
      return new ParkedCar(car);
   }
   
   /**
   This is the getter method for the car
   @return meter The meter info for the car
   */
   public ParkingMeter getMeter()
   {
      return new ParkingMeter(meter);
   }
   
   /**
   This is the getter method for the fine
   @param fine The info for the fine
   */
   public double getFine()
   {
      return this.fine;
   }
   
   /**
   This is the getter method for the police officer info
   @return policeOfficer The police officer info
   */
   public PoliceOfficer getOfficer()
   {
      return new PoliceOfficer(policeOfficer);
   }
   
   /**
         –To report the make, model, color, and license number of the illegally parked car
   */
   
   /**
   –To report the amount of the fine, which is $25 for the first hour or part of an hour 
   that the car is illegally parked, plus $10 for every additional hour or part of 
   an hour that the car is illegally parked
   */
   public double calculateFine()//ParkedCar car, ParkingMeter meter)
   {
      //declare constants
      final int FIRST_HOUR = 25;
      final int ADDITIONAL_HOUR = 10;
      
      //declare variable
      double fine = 0;
      
      int timeOver = (car.getMinutesParked()-meter.getParkingPurchased());      
      
      //if statement
      if(car.getMinutesParked() > meter.getParkingPurchased())// || car.getMinutesParked() == .5)
      {
         //fine += FIRST_HOUR;
         if(timeOver > 1)
         {
            fine += FIRST_HOUR+(timeOver-1)*ADDITIONAL_HOUR;
         }
         else if(timeOver <= 1)
         {
            //fine += FIRST_HOUR+(timeOver-1)*ADDITIONAL_HOUR;
            fine += FIRST_HOUR;
         }
        // else
            //fine = 0;
      }
      else
         fine = 0;
         
      return fine;
   }
   
   /**
   toString method
   */
   
   public String toString()
   {
      return "Car Information"+
             "\n\tMake: "+car.getMake()+
             "\n\tModel: "+car.getModel()+
             "\n\tColor: "+car.getColor()+
             "\n\tLicense Number: "+car.getLicenseNum()+
             "\n\tTotal Minutes Parked: "+car.getMinutesParked()+" minutes"+
             "\n\tTotal Minutes Purchased: "+meter.getParkingPurchased()+" minutes"+"\n"+"\n"+
             "Police Officer Information"+
             "\n\tOfficer Name: "+policeOfficer.getOfficerName()+
             "\n\tBadge Number: "+policeOfficer.getBadgeNum();             
   }
  
}