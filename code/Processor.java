/**
 *  Processor class explain the cost, clockspeed and  manufacturer companey.
 * 
 * @author (maryam kiashemshaki) 
 * @version (17.1.27)
 */
public class Processor
{
    private int cost;
    private int clockspeed;
    private String manufacturer;
       /**
     * Constructor for objects of class Processor
     */
    public Processor()
    {
       cost = 0;
       clockspeed = 0;
       manufacturer = null;
    }
    public void setcost( int cost) 
      {
        this.cost = cost;
    }
    public int setclockspeed(int clockspeed) 
    {
        this.clockspeed=clockspeed;
        return clockspeed;
    }
    public String setmanufacturer(String manufacturer) 
    {
        this.manufacturer = manufacturer;
        return manufacturer;
    }
      public int getcost() 
      {
        return cost;
    }
    public String ProcessorSpecification() 
    {
    System.out.println ("Processor Specification is : manufacturer "+ manufacturer + ", clockspeed " + clockspeed+ ", Cost "+cost);
    return "Processor Specification is : manufacturer "+ manufacturer + ", clockspeed " + clockspeed+ ", Cost "+cost ;
    }
} 

