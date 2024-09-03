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
	static boolean stillPlaying = true;
	
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
  
        if(myMatrix[row][col].equals(" "))
          {
        	myMatrix[row][col] = "X";
        	myMatrix2[row][col] = 2;
          playCount++;
          }
  
        else
          {
          playerInput();
          }
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
