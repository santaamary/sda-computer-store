/**
 * HardDisk class explain the cost, size and brand.
 * 
 * @author (maryam kiashemshaki) 
 * @version (17.1.27)
 */
public class HardDisk
{
    private int cost;
    private int size;
    private String brand;
       /**
     * Constructor for objects of class HardDisk
     */
    public HardDisk()
    {
        size = 0;
        cost = 0;
        brand = null;
    }
    public int setCost(int cost) 
    {
		this.cost = cost;
        return cost;
    }
    public int setSize(int size) 
    {
		this.size = size;
        return size;
    }
    public String setbrand(String brand) 
    {
		this.brand = brand;
        return brand;
    }
    public String getBrand() 
    {
		return brand;
	}
    public int getcost() 
      {
        return cost;
    }
    public String HardDiskSpecification() {
       System.out.println ("Hard Disk Specification is : brand "+ brand + ", size " + size+ ", Cost "+cost);
        return "Hard Disk Specification is : brand "+ brand + ", size " + size+ ", Cost "+cost;
    }
}
