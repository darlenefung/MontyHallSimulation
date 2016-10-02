/**
 * the Monty Hall Simulation simulates a Monty Hall Game, 
 * but without taking any user input
 */

public class MontyHallSimulation
{
	public static void main(String[] args) // String[] args so it can take in parameters, as stated below (string args because it is casting as string)
	{
		// System.out.println(args[0]);  (you can pass argument when "java MontyHallSimulation 10000")
		
		String input = args[0]; 
		
		int numSim = Integer.parseInt(input); // changes number to int cast when user enters them in the terminal
		System.out.println(numSim);
		
		int switchWin = 0;
		
		for (int i = 0; i < numSim; i ++)
			switchWin += game();
			
		double percentSwitchWin = format((double) switchWin / numSim * 100); 
		double percentStayWin = format(100 - percentSwitchWin);
			
		System.out.println("% of switch winning: " + percentSwitchWin);
		System.out.println("% of switch loosing: " + percentStayWin);


		
	
	}
	/** 
	 * this method takes in a double and truncates it 2 decimal places
	 * @param d the double input to be truncated
	 * @return double formatted to 2 decimal places
	 */ 
	public static double format(double d) 
	{
		int temp = (int) (d * 100);
		return temp / 100.0; 
	
		
	}
	/** 
	 * This method simulates a Monty Hall game and returns 
	 * 1 if switch wins and returns 0 otherwise
	 * compares randomly generated door and userPick and compares
	 * @return int return 1 if switch wins, 0 otherwise
	 */
	public static int game()
	{
		int car = (int)(Math.random() * 3 + 1);
		int userPick = (int)(Math.random() * 3 + 1);

		if (car == userPick)
			return 0;
		else 
			return 1; 
		
	}

}