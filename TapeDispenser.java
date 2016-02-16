public class TapeDispenser{
	
	private double inches;
	
	public TapeDispenser(){
		inches = 50;
	}
	
	public void refillInches(){
		while (inches <50){
			inches++;
		}
	}
	
	public void estimateInches(){
		if (inches >= 45){
			System.out.println("The tape dispenser looks full.");
		}
		else if (inches >= 35){
			System.out.println("The tape dispenser is almost full.");
		}
		else if (inches >= 15){
			System.out.println("The tape dispenser is about halfway full.");
		}
		else if (inches >= 1){
			System.out.println("The tape dispenser is almost empty.");
		}
		else{
			System.out.println("The tape dispenser is empty.");
		}
			
	}
	
	public boolean tape(int numPages){
		inches -= (numPages * .25);
		if(inches<0){
			inches = 0;
			return false;
		}
		return true;
	}
	
	
	
	
}