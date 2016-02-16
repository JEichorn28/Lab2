public class Stapler{
	
	private int numStaples; 
	
	//============================
	
	public Stapler(){
		numStaples = 10;
	}
	
	public void estimateWeight(){
		if(numStaples >10){
			System.out.println("The stapler feels really heavy.");
		}
		else if(numStaples >5){
			System.out.println("The stapler feels heavy.");
		}
		else if(numStaples >0){
			System.out.println("The stapler feels light.");
		}
		else {
			System.out.println("The stapler feels really light.");
		}
	}
	
	public void incrementStaples(){
		numStaples += 10;
	}
	
	public int getNumStaples(){
		return numStaples;
	}
	
	public boolean staple(int numPages){
		if(numPages<=50){
			numStaples--;
		}
		else{
			System.out.println("Stapler Jammed! -3 Staples");
			numStaples-=3;
		}
		if (numStaples <0){
			numStaples=0;
			return false;
		}
		return true;
		
	}
	

}