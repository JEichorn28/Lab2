import java.util.*;

public class OfficeQuest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int turnNumber = 0;
		int hours = 8;
		int minutes = 0;
		int deliverMan = 0;
		int numPages = 0;
		String tOrS = "";
		boolean playing = true;
		
		
		TapeDispenser dispenser = new TapeDispenser();
		Stapler staples = new Stapler();
		
		while(playing){
			System.out.println("Turn number: " + turnNumber);
			staples.estimateWeight();
			dispenser.estimateInches();
			
			deliverMan = (int) (Math.random() * 20) + 1;
			
			if(deliverMan == 1){
				System.out.println("The delivery person came by with more staples!");
				staples.incrementStaples();
			}
			else if(deliverMan ==2){
				System.out.println("The delivery person refilled the tape dispenser!");
				dispenser.refillInches();
			}
			else{
				numPages = (int) (Math.random() * 60) + 1;
				System.out.println("The deliver person dropped off " + numPages + " to collate!");
				//Staple of tape?
				do{
					System.out.print("[T]ape or [S]taple > ");
					tOrS = sc.nextLine();
				}while(!(tOrS.equals("T")) && !(tOrS.equals("S")));
				
				//taping or stapling
				if (tOrS.equals("T")){
					playing = dispenser.tape(numPages);
				}
				
				else{
					playing = staples.staple(numPages);
				}
				
			}
			if(playing == false){
				break;
			}
			
			//time
			if(minutes ==0){
				hours--;
				minutes = 40;
			}
			else{
				minutes-=20;
			}
			if (minutes == 0 && hours == 0){
				playing = false;
			}
			System.out.println(hours + "hour(s) and " + minutes + " minutes to go...");
			
			turnNumber++;

		}
	}
}