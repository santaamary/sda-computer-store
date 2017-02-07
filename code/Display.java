/**
 * Display class explain the cost, size and brand.
 * 
 * @author (maryam kiashemshaki) 
 * @version (17.1.27)
 */
public class Display extends Component
{
    //public int cost;
    public int size;
   // public String manufacturer;
     /**  
     * Constructor for objects of class Display
     */
    public Display()
    {
       //cost = 0;
       size = 0;
       //manufacturer = null;
    }
    public void setCost( int cost) {
		super.cost = cost;
    }
    
    public int setSize(int size) {
		this.size = size;
        return size;
    }
    /*public String setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
        return manufacturer;
	}
    public String getmanufacturer() {
		return manufacturer;
	} */
    public int getcost() 
      {
        return super.cost;
    }
    
    public String DisplaySpecification() {
    System.out.println("Display Specification is : manufacturer "+ manufacturer + ", size " + size+ ", Cost "+cost);
    return "Display Specification is : manufacturer "+ manufacturer + ", size " + size+ ", Cost "+cost;
    }
}
