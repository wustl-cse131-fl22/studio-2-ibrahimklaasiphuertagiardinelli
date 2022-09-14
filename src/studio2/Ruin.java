package studio2;

import java.util.*;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		System.out.println("Starting Amount:");
		int startAmount = in.nextInt();
		System.out.println("Win Limit:");
		int winLimit = in.nextInt();
		System.out.println("Win Chance:");
		double winChance = in.nextDouble();
		System.out.println("Simulations:");
		int totalSimulations = in.nextInt();
		
		
		
		for(int day = 1; day < totalSimulations; day++) {
		int plays = 0;
		while (startAmount < winLimit && startAmount >= 0){
		
			if (Math.random() < winChance )
			{
				startAmount ++;
			}
			else
			{
				startAmount --;
			}
		plays ++;
		
	
		
	}
		System.out.println("Money: " + startAmount + " Days played: " + plays);
	}
		
		
	}
}
	
	
