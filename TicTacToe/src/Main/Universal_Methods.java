package Main;

import java.util.Scanner;

public class Universal_Methods 
	{
	static String [] [] myMatrix = new String [3] [3];
	static int [] [] myMatrix2 = new int [3][3];
	static boolean isWonGame = false;
	static boolean foundMove = false; 
	static int playCount = 0;
	static boolean tie = false;
	static int chosenRow = -1;
    static int chosenCol = -1;
    static String placement;
	
	//creates the game board
    public static void prepareBoard()
      {
      for (int row = 0; row < myMatrix.length; row++)
	      {
	      System.out.println(" ");
	      for (int col = 0; col < myMatrix[0].length; col++)
	          {
	          myMatrix[row][col] = " ";
	          System.out.print(myMatrix[row][col]+" ");
	          }
	      }
      }
	
	//displays the game board
    public static void displayBoard()
		{ 
	    System.out.println(" ");
	    System.out.println("     1   2   3");
	    System.out.println("   -------------");
	    System.out.println("A  | " + myMatrix[0][0] +    " | " + myMatrix[0][1] +    " | " + myMatrix[0][2] +  " | " );
	    System.out.println("   -------------");
   	    System.out.println("B  | " + myMatrix[1][0] +    " | " + myMatrix[1][1] +    " | " + myMatrix[1][2] +  " | " );
 	    System.out.println("   -------------");
	    System.out.println("C  | " + myMatrix[2][0] +    " | " + myMatrix[2][1] +    " | " + myMatrix[2][2] +  " | " );
	    System.out.println("   -------------");
	    }
    
  //takes input from the user to play on the board
    public static void playerInput()
    	{
	    Scanner userStringInput = new Scanner(System.in);
	    System.out.println("Which spot would you like to play in?");  
	     placement = userStringInput.nextLine();
	    placement = placement.toUpperCase();
	    }
    
    //places an "X" in the spot chosen by the user
    public static void placeX()
    	{
    	if(placement.substring(0,1).equals("A"))
	        {
	        chosenRow = 0;
	        }

        else if(placement.substring(0,1).equals("B"))
	        {
	        chosenRow = 1;
	        }

        else if(placement.substring(0,1).equals("C"))
	        {
	        chosenRow = 2;
	        }

        chosenCol = Integer.parseInt(placement.substring(1))-1;

        if(myMatrix[chosenRow][chosenCol].equals(" "))
	        {
	      	myMatrix[chosenRow][chosenCol] = "X";
	      	myMatrix2[chosenRow][chosenCol] = 2;
	        playCount++;
	        }

        else
	        {
	        playerInput();
	        }
        displayBoard();
    	}
    
    //places an "O" in the spot chosen by the user
    public static void placeO()
		{
	    if(placement.substring(0,1).equals("A"))
	    	{
	    	chosenRow = 0;
	    	}

		else if(placement.substring(0,1).equals("B"))
		    {
		    chosenRow = 1;
		    }
		
        else if(placement.substring(0,1).equals("C"))
		    {
		    chosenRow = 2;
		    }
		
		  chosenCol = Integer.parseInt(placement.substring(1))-1;
		
		if(myMatrix[chosenRow][chosenCol].equals(" "))
		    {
		  	myMatrix[chosenRow][chosenCol] = "O";
		  	myMatrix2[chosenRow][chosenCol] = 2;
		    playCount++;
		    }
		
		else
		    {
		    playerInput();
		    }
		
		displayBoard();
		}
    
  //this checks to see if the game has been won
    public static void isWonGame()
  		{
  		if ((myMatrix[0][0].equals(myMatrix[0][1]) && myMatrix[0][1].equals(myMatrix[0][2]) && !myMatrix[0][1].equals(" ")) ||
  			(myMatrix[1][0].equals(myMatrix[1][1]) && myMatrix[1][1].equals(myMatrix[1][2]) && !myMatrix[1][1].equals(" ")) ||
  			(myMatrix[2][0].equals(myMatrix[2][1]) && myMatrix[2][1].equals(myMatrix[2][2]) && !myMatrix[2][1].equals(" ")) ||
  			(myMatrix[0][0].equals(myMatrix[1][0]) && myMatrix[1][0].equals(myMatrix[2][0]) && !myMatrix[1][0].equals(" ")) ||				
  			(myMatrix[0][1].equals(myMatrix[1][1]) && myMatrix[1][1].equals(myMatrix[2][1]) && !myMatrix[1][1].equals(" ")) ||
  			(myMatrix[0][2].equals(myMatrix[1][2]) && myMatrix[1][2].equals(myMatrix[2][2]) && !myMatrix[1][2].equals(" ")) ||
  			(myMatrix[0][0].equals(myMatrix[1][1]) && myMatrix[1][1].equals(myMatrix[2][2]) && !myMatrix[1][1].equals(" ")) ||
  			(myMatrix[0][2].equals(myMatrix[1][1]) && myMatrix[1][1].equals(myMatrix[2][0]) && !myMatrix[1][1].equals(" ")))
  			{
  			isWonGame = true;
  			System.out.println("The game is over!");
  			System.exit(0);
  			}
  		}
    
  //checks for a full board, then checks if a player has won, if no win is found, it is a tie
    public static void checkForTie()
      {
      if(playCount == 9)
        {
        Hard_AI.checkWin();
        if(!isWonGame)
        	{
            System.out.println("The game ended in a tie!");
            System.exit(0);
          }
        }
      }
	}
