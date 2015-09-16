

/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gass tank 
 * The car may be driven which reduces the amount of gas in the fuel tank.
 * 
 * @author Neil Shah
 * @version 10 September 2015
 */
public class Car
{
    /** the fuel efficiency for the car measured in units of miles/gallon (mpg) */
    private double fuelEfficiency;
    
    /**the amount of fuel in the tank of the car measured in units of gallons*/
    private double fuelInTank; 
    
    
    /** 
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        fuelEfficiency = fuelEfficiency;
        fuelEfficiency = 0;
    }

    /**
     * this method simulates driving the car for the specified distence and 
     * reduces the amount of gas in the fuel tank
     *
     * @pre      the specified distence will not consume more the available gas  
     * @param    distence   the specified distence will not consume more than 
     */
    public void drive( double distance )
    {
        fuelInTank -= distance / fuelEfficiency;
    }
     
    /**
     * Returns the number of gallons of gas in the car's tank
     * 
     * @return  the number of gallons of gas in the car's tank
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     gallonsOfGas must be positive
     * @param   gallonsOfGas    amount of gas to add to the car's tank
     */
    public void addGas(double gallonsOfGas)
    {
       fuelInTank += gallonsOfGas; 
    }
}
