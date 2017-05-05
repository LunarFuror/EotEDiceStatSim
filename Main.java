import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
			int yellow=0, 
				green=0,
				blue=0,
				red=0,
				purple=0,
				black=0,
				success=0,
				advantage=0,
				triumph=0,
				failure=0,
				threat=0,
				despair=0,
				totalPassed=0;
			float totalSuccess=0,
				totalAdvantage=0,
				totalTriumph=0,
				totalFailure=0,
				totalThreat=0,
				totalDespair=0;
			float percentPassed = 0;
			Scanner scan = new Scanner(System.in);
			int numberOfRolls = 10000; //Change me for more or less rolls
			
			while(true){
				System.out.println("Yellow Dice:");
				yellow = scan.nextInt();
				
				System.out.println("Green Dice:");
				green = scan.nextInt();
				
				System.out.println("Blue Dice:");
				blue = scan.nextInt();
				
				System.out.println("Red Dice:");
				red = scan.nextInt();
				
				System.out.println("Purple Dice:");
				purple = scan.nextInt();
				
				System.out.println("Black Dice:");
				black = scan.nextInt();
				
				System.out.println("\nY:" + yellow + " G:" + green + " U:" + blue);
				System.out.println("R:" + red + " P:" + purple + " B:" + black);
				System.out.println("Rolling " + numberOfRolls + " checks.");
				
				for(int j=0; j<numberOfRolls; j++){
					success=0;
					advantage=0;
					triumph=0;
					failure=0;
					threat=0;
					despair=0;
	
					//roll yellows
					for(int i=0; i<yellow; i++){
						int randomNum = ThreadLocalRandom.current().nextInt(1, 12 + 1);
						switch(randomNum){
							case 1:
								break;
							case 2: success ++;
								break;
							case 3: success ++;
								break;
							case 4: success ++; success ++;
								break;
							case 5: success ++; success ++;
								break;
							case 6: advantage ++;
								break;
							case 7:advantage ++;success ++;
								break;
							case 8:advantage ++;success ++;
								break;
							case 9:advantage ++;success ++;
								break;
							case 10:advantage ++;advantage ++;
								break;
							case 11:advantage ++;advantage ++;
								break;
							case 12:triumph ++;success ++;
								break;
						}
					}
					//roll green
					for(int i=0; i<green; i++){
						int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);
						switch(randomNum){
							case 1:
								break;
							case 2: success ++;
								break;
							case 3: success ++;
								break;
							case 4: success ++; success ++;
								break;
							case 5: advantage ++;
								break;
							case 6: advantage ++;
								break;
							case 7:advantage ++;success ++;
								break;
							case 8:advantage ++;advantage ++;
								break;
						}
					}
					//roll blue
					for(int i=0; i<blue; i++){
						int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
						switch(randomNum){
							case 1:
								break;
							case 2: 
								break;
							case 3: advantage ++;advantage ++;
								break;
							case 4: advantage ++;
								break;
							case 5: success ++; advantage ++;
								break;
							case 6: success ++;
								break;
						}
					}
					
					//roll red
					for(int i=0; i<red; i++){
						int randomNum = ThreadLocalRandom.current().nextInt(1, 12 + 1);
						switch(randomNum){
							case 1:
								break;
							case 2: failure ++;
								break;
							case 3: failure ++;
								break;
							case 4: failure ++; failure ++;
								break;
							case 5: failure ++; failure ++;
								break;
							case 6: threat ++;
								break;
							case 7:threat ++;
								break;
							case 8:threat ++; failure ++;
								break;
							case 9:threat ++;failure ++;
								break;
							case 10:threat ++;threat ++;
								break;
							case 11:threat ++;threat ++;
								break;
							case 12:despair ++;failure ++;
								break;
						}
					}
					//roll purple
					for(int i=0; i<purple; i++){
						int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);
						switch(randomNum){
							case 1:
								break;
							case 2: failure ++;
								break;
							case 3: failure ++; failure ++;
								break;
							case 4: threat ++;
								break;
							case 5: threat ++; 
								break;
							case 6: threat ++;
								break;
							case 7:threat ++;threat ++;
								break;
							case 8:threat ++;failure ++;
								break;
						}
					}
					// roll black
					for(int i=0; i<black; i++){
						int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
						switch(randomNum){
							case 1:
								break;
							case 2: 
								break;
							case 3: failure ++;
								break;
							case 4: failure ++;
								break;
							case 5: threat ++;
								break;
							case 6: threat ++;
								break;
						}
					}
					//System.out.print("\nS:" + success + " A:" + advantage + " T:" + triumph + " || F:" + failure + " H:" + threat + " D:" + despair);
					totalSuccess+=success;
					totalAdvantage+=advantage;
					totalTriumph+=triumph;
					totalFailure+=failure;
					totalThreat+=threat;
					totalDespair+=despair;
					if(success > failure){totalPassed ++; 
						//System.out.print(" SUCCESS");
					}
				}
				//calculate success rate
				percentPassed = ((float)totalPassed/(float)numberOfRolls)*100;
				//print it
				System.out.println("Success:" + totalSuccess + " Advantage:" + totalAdvantage + " Triumph:" + totalTriumph);
				System.out.println("Failure:" + totalFailure + " Threat:" + totalThreat + " Despair:" + totalDespair);
				System.out.println("Average Success:" + totalSuccess/numberOfRolls + " Average Advantage:" + totalAdvantage/numberOfRolls + " Average Triumph:" + totalTriumph/numberOfRolls);
				System.out.println("Average Failure:" + totalFailure/numberOfRolls + " Average Threat:" + totalThreat/numberOfRolls + " Average Despair:" + totalDespair/numberOfRolls);
				System.out.println("Total Passed Checks: " + totalPassed + " out of " + numberOfRolls);
				System.out.println("Average passing rate:" + percentPassed + "%\n\n");
				//reset values
				totalSuccess = 0;
				totalAdvantage = 0;
				totalTriumph = 0;
				totalFailure = 0;
				totalThreat = 0;
				totalDespair = 0;
				totalPassed = 0;
				percentPassed = 0;
		}
	}
}
