package Main;

import java.util.Scanner;

public class Two_Players 
	{
	public static void playWith2Players()
	{
	Universal_Methods.prepareBoard();
    Universal_Methods.displayBoard();
	
	while(Universal_Methods.stillPlaying && !Universal_Methods.tie)
    {
	player1Input();
    Universal_Methods.displayBoard();
    Universal_Methods.isWonGame();
    Universal_Methods.checkForTie();
    player2Input();
    Universal_Methods.displayBoard();
    Universal_Methods.isWonGame();
    Universal_Methods.checkForTie();	
    }
	}
	
	//if there are 2 players, this takes the first players input
    public static void player1Input()
      {
              Scanner userStringInput = new Scanner(System.in);
              System.out.println("Where would you like to place your X?");  
              String placement1 = userStringInput.nextLine();
              placement1 = placement1.toUpperCase();
  
              int row = -1;
              int col = -1;
              if(placement1.substring(0,1).equals("A"))
                {
                row = 0;
                }
  
              else if(placement1.substring(0,1).equals("B"))
                {
                row = 1;
                }
  
              else if(placement1.substring(0,1).equals("C"))
                {
                row = 2;
                }
  
              col = Integer.parseInt(placement1.substring(1))-1;
  
              if(Universal_Methods.myMatrix[row][col].equals(" "))
                {
            	  Universal_Methods.myMatrix[row][col] = "X";
            	  Universal_Methods.myMatrix2[row][col] = 2;
                }
  
              else
                {
                player1Input();
                }
              }
  
    //this will take the 2nd players input if there are 2 players
    public static void player2Input()
      {
              Scanner userStringInput = new Scanner(System.in);
              System.out.println("Where would you like to place your O?");  
              String placement2 = userStringInput.nextLine();
              placement2 = placement2.toUpperCase();
  
              int row = -1;
              int col = -1;
              if(placement2.substring(0,1).equals("A"))
                {
                row = 0;
                }
  
              else if(placement2.substring(0,1).equals("B"))
                {
                row = 1;
                }
  
              else if(placement2.substring(0,1).equals("C"))
                {
                row = 2;
                }
  
              else 
                  {
                  player2Input();
                  }
  
              col = Integer.parseInt(placement2.substring(1))-1;
  
              if(Universal_Methods.myMatrix[row][col].equals(" "))
                {
            	  Universal_Methods.myMatrix[row][col] = "O";
            	  Universal_Methods.myMatrix2[row][col] = 2;
                }
  
              else
                {
                player2Input();
                }
              
              }
	}
