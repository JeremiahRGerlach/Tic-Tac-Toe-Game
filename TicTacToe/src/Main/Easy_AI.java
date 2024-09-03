package Main;

public class Easy_AI 
	{
	public static void playAgainstEasyAI()
	{
	Universal_Methods.prepareBoard();
    Universal_Methods.displayBoard();
	
	while(Universal_Methods.stillPlaying && !Universal_Methods.tie)
    {
	Universal_Methods.playerInput();
    Universal_Methods.displayBoard();
    Universal_Methods.isWonGame();
    Universal_Methods.checkForTie();
    easyAITurn();
    Universal_Methods.displayBoard();
    Universal_Methods.isWonGame();
    Universal_Methods.checkForTie();	
    }
	}
	
	//level 1 ai makes random moves on the board
    public static void easyAITurn()
      {
          int row = (int)(Math.random()*3);
          int col = (int)(Math.random()*3);
    
          if(Universal_Methods.myMatrix[row][col].equals(" "))
            {
            Universal_Methods.myMatrix[row][col] = "O";
            Universal_Methods.myMatrix2[row][col] = 5;
            Universal_Methods.playCount++;
            }
            
          else
            {
            easyAITurn();
            }
        }
	}
