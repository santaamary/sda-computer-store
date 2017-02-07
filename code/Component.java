
/**
 * Write a description of class Component here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Component
{
   
    protected String manufacturer;
    protected int cost;

    /**
     * Constructor for objects of class Component
     */
    public Component()
    {
                
    }
     public void setCost (int cost) {
    this.cost= cost;
    }
    public int getCost()
    {
        return cost;
    }
    public void setManufacturer(String manufacturer) {
		this.manufacturer= manufacturer;
    }
     public String getManufacturer() {
		return manufacturer;
	}
    public void getDescription()//String
    {
    System.out.println("Compenent's manufacturer: "+ manufacturer +" ,Compenent's cost "+ cost);
    }
    
}
