/**
 * Computer class takes model of processor and HardDisk and Display. After that it explans the cost of the computer 
 * 
 * @author (maryam kiashemshaki) 
 * @version (17.1.27)
 */
public class Computer
{
    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Display theDisplay;
    private int total;
    private String computerName;
    /**
     * constructor for Computer
     * takes no parameters
     * it call the constructor of each of the fields
   */
    public Computer(Processor processor, HardDisk hardDisk, Display display)
    {
       theProcessor = processor;
       theHardDisk = hardDisk;
       theDisplay = display;
       this.total= totalPrice();
       computerName = null;
    }
   public void setName(String computerName){
       this.computerName = computerName;
   }
   public String getName(){
       return computerName;
   }
    // total price of computer = Processor cost + HardDisk cost+ Display cost.
    public int totalPrice()
    {
    total = theProcessor.getcost() + theHardDisk.getcost() + theDisplay.getcost();
    return total;
    }   
    /* print a summary of the Computer components and calculate a total cost
     * you will need method calls to get info about the other components
    * e.g. theProcessor.getCost()
    */
      public void printComputerSummary() {
    System.out.println("The computer specification is : Processor model" + theProcessor.ProcessorSpecification() + " ,Hard disk model " + theHardDisk.HardDiskSpecification() +" , Display model " + theDisplay.DisplaySpecification() );
    System.out.println(  " total cost " + total  );
    }
    }

