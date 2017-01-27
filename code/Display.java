/**
 * Write a description of class HardDisk here.
 * 
 * @author (maryam kiashemshaki) 
 * @version (17.1.27)
 */
public class Display
{
    private int cost;
    private int size;
    private String brand;
     /**  
     * Constructor for objects of class Display
     */
    public Display(int newcost, int newsize, String newbrand )
    {
        brand = newbrand;
    }
    public int setCost() {
		return cost;
    }
    public int setSize() {
		return size;
    }
    public String getBrand() {
		return brand;
	}

    public void DisplaySpecification() {
    System.out.println("Display Specification is : brand "+ brand + ", size " + size+ ",Cost "+cost);
    }
}
