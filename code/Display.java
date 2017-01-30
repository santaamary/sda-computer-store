/**
 * Display class explain the cost, size and brand.
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
    public Display()
    {
       cost = 0;
       size = 0;
       brand = null;
    }
    public int setCost( int cost) {
		this.cost = cost;
        return cost;
    }
    public int setSize(int size) {
		this.size = size;
        return size;
    }
    public String setBrand(String brand) {
		this.brand = brand;
        return brand;
	}
    public String getBrand() {
		return brand;
	}
    public int getcost() 
      {
        return cost;
    }
    public String DisplaySpecification() {
    System.out.println("Display Specification is : brand "+ brand + ", size " + size+ ", Cost "+cost);
    return "Display Specification is : brand "+ brand + ", size " + size+ ", Cost "+cost;
    }
}
