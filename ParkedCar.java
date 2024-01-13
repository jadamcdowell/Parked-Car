public class ParkedCar
{
   /**
   The ParkedCar Class: This class should simulate a parked car. The class’s responsibilities are as follows:
      -car’s make, model, color, license number, and the number of minutes that the car has been parked.
   */
   
   //declare fields
   private String make;
   private String model;
   private String color;
   private String licenseNum;
   private int minutesParked;
   
   //no arg constructor
   public ParkedCar()
   {
      make = "";
      model = "";
      color = "";
      licenseNum = "";
      minutesParked = 1;
   }
   
   /**
   Constructor with arguments
   @param make The make of the car
   @param model The model of the car
   @param color The color of the car
   @param licenseNum The license number of the car
   @param minutesParked The minutes parked for the car
   */
   public ParkedCar(String make, String model, String color, String licenseNum, int minutesParked)
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.licenseNum = licenseNum;
      this.minutesParked = minutesParked;
   }
   
   /**
	COPY CONSTRUCTOR
	@param obj A ParkedCar object to make a copy
	*/
	public ParkedCar(ParkedCar obj)
	{
		make = obj.make;
      model = obj.model;
      color = obj.color;
      licenseNum = obj.licenseNum;
      minutesParked = obj.minutesParked;
	}
   
   //setter methods
   
   /**
   This is the setter method for the make of the car
   @param make The make of the car
   */
   public void setMake(String make)
   {
      this.make = make;
   }
   
   /**
   This is the setter method for the model of the car
   @param model The model of the car
   */
   public void setModel(String model)
   {
      this.model = model;
   }
   
   
   /**
   This is the setter method for the color of the car
   @param color The color of the car
   */
   public void setColor(String color)
   {
      this.color = color;
   }
   
   /**
   This is the setter method for the licenseNum of the car
   @param licenseNum The licenseNum of the car
   */
   public void setLicenseNum(String licenseNum)
   {
      this.licenseNum = licenseNum;
   }
   
   /**
   This is the setter method for the minutesParked of the car
   @param minutesParked The minutesParked of the car
   */
   public void setMinutesParked(int minutesParked)
   {
      this.minutesParked = minutesParked;
   }
   
   //getter methods
   
   /**
   This method will return the make of the car
   @return make The make of the car
   */
   public String getMake()
   {
      return this.make;
   }
   
   /**
   This method will return the model of the car
   @return model The model of the car
   */
   public String getModel()
   {
      return this.model;
   }
   
   /**
   This method will return the color of the car
   @return color The color of the car
   */
   public String getColor()
   {
      return this.color;
   }
   
   /**
   This method will return the licenseNum of the car
   @return licenseNum The licenseNum of the car
   */
   public String getLicenseNum()
   {
      return this.licenseNum;
   }
   
   /**
   This method will return the minutesParked of the car
   @return minutesParked The minutesParked of the car
   */
   public int getMinutesParked()
   {
      return this.minutesParked;
   }
}