public class ParkingMeter
{
   /**
   The ParkingMeter Class: This class should simulate a parking meter. The class’s only responsibility is as follows:
      - To know the number of minutes of parking time that has been purchased.
   */
   
   //declare fields
   private int parkingTimePurchased;
   
   //no arg constructor
   public ParkingMeter()
   {
      parkingTimePurchased = 1;
   }
   
   /**
   Constructor with args
   @param parkingTimePurchased The parking time purchased
   */
   public ParkingMeter(int parkingTimePurchased)
   {
      this.parkingTimePurchased = parkingTimePurchased;
   }
   
   /**
	COPY CONSTRUCTOR
	@param obj A ParkingMeter object to make a copy
	*/
	public ParkingMeter(ParkingMeter obj)
	{
		parkingTimePurchased = obj.parkingTimePurchased;
	}
   
   //setter method
   
   /**
   This is the setter method for the parking time purchase
   @param parkingTimePurchased The parking time purchased
   */
   public void setParkingPurchased(int parkingTimePurchased)
   {
      this.parkingTimePurchased = parkingTimePurchased;
   }
   
   //getter method
   
   /**
   This is the getter method for the parking time purchased
   @return parkingTimePurchased The parking time purchased
   */
   public int getParkingPurchased()
   {
      return this.parkingTimePurchased;
   }
}