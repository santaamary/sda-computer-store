import java.util.ArrayList;
/**
 * ComputerStore store a collection of Computer.
 * 
 * @author (maryam kiashemshaki) 
 * @version (17.1.29)
 */
public class ComputerStore
{
    private ArrayList<Computer> computers;
    /**
     * Constructor for objects of class ComputerStore
     */
    public ComputerStore(){
       computers = new ArrayList<Computer>();
    }

    public boolean addComputer(Computer newComputer) { 
    if(computers.add(newComputer)){
    return true;
    }
    else return false;
    }
        public boolean removeComputer(int index) { 
        if (index>0 && index<computers.size()){
			computers.remove(index);
			return true;
		}
        else return false;
        
     }

     public void printAllComputers( ) {
        int index =1;
         for(Computer newComputer : computers ){
            System.out.println(index + "." +newComputer.getName());
            index ++;
        }
    }

    public void printTotalValue( ) {
      int allcomputersPrice = 0;
      for(int i = 0; i < computers.size(); i++){
        allcomputersPrice += computers.get(i).totalPrice();
        }
      System.out.println(  " total cost of all computers is: " + allcomputersPrice  );
     }
    }
