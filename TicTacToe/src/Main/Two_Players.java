package Main;

import java.util.Scanner;

public class Two_Players 
	{
	public static void playWith2Players()
		{
		Universal_Methods.prepareBoard();
	    Universal_Methods.displayBoard();
		
		while(!Universal_Methods.tie)
		    {
			Universal_Methods.playerInput();
			Universal_Methods.placeX();
		    Universal_Methods.displayBoard();
		    Universal_Methods.isWonGame();
		    Universal_Methods.checkForTie();
		    Universal_Methods.playerInput();
		    Universal_Methods.placeO();
		    Universal_Methods.displayBoard();
		    Universal_Methods.isWonGame();
		    Universal_Methods.checkForTie();	
		    }
		}
	
	}
