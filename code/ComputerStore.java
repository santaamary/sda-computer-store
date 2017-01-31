import java.util.ArrayList;
import java.util.Iterator;
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
   
     // This version will use a traditional for loop
    public Computer findMostExpensiveComputerV1( Computer newcomputer ) {
            Computer MostExpensiveComputerV1=computers.get(0);
		for (int index=1; index<computers.size();index++){
			if (MostExpensiveComputerV1.totalPrice() < newcomputer.totalPrice()) {
			MostExpensiveComputerV1= computers.get(index);
			}
		}
		return MostExpensiveComputerV1;
    }
    
    // This version will use a traditional while loop
    public Computer findMostExpensiveComputerV2(Computer newcomputer ) {
            Computer MostExpensiveComputerV2 = newcomputer;
            int index = 0;
        while(index <= computers.size()){
              if(MostExpensiveComputerV2.totalPrice() >newcomputer.totalPrice()){
              MostExpensiveComputerV2 = newcomputer;
              }
          index ++;
        }
         return MostExpensiveComputerV2;
    }

    // This version will use a for-each loop
    public Computer findMostExpensiveComputerV3( Computer newcomputer ) {
           Computer MostExpensiveComputerV3 = newcomputer;   
      for (Computer c : computers){
          if(c.totalPrice()>newcomputer.totalPrice())
          MostExpensiveComputerV3= c;
        }
        return MostExpensiveComputerV3;
    }
       
    // This version will use a for-each loop
    public Computer findMostExpensiveComputerV4(Computer newcomputer ) { 
        Computer MostExpensiveComputerV4= computers.get(0);
		Iterator<Computer> it= computers.iterator();
		while(it.hasNext()) {
			newcomputer=it.next();
			if (MostExpensiveComputerV4.totalPrice()<newcomputer.totalPrice()) 
            MostExpensiveComputerV4 = newcomputer;
        }
      return MostExpensiveComputerV4;
    }
}
