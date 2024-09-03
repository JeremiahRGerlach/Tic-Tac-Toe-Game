package Main;

public class Hard_AI 
	{
	public static void playAgainstHardAI()
		{
		Universal_Methods.prepareBoard();
        Universal_Methods.displayBoard();
		
		while(Universal_Methods.stillPlaying && !Universal_Methods.tie)
        {
		Universal_Methods.playerInput();
	    Universal_Methods.displayBoard();
	    Universal_Methods.isWonGame();
	    Universal_Methods.checkForTie();
	    hardAITurn();
	    Universal_Methods.displayBoard();
	    Universal_Methods.isWonGame();
	    Universal_Methods.checkForTie();	
        }
		}
	
	//level 2 ai checks each row, col, and diag for wins and blocks
    public static void hardAITurn()
      {
      checkWin();
      checkBlock();
      playCenter();
      playRandom();
      }
  
    //for the level 2 ai, it checks if it can move in any spot to win
    public static void checkWin()
      {
      Universal_Methods.foundMove = false;
      checkWinRow();
      checkWinCol();
      checkWinDiagonal();
      checkWinReverseDiagonal();
      }
  
    //for the level 2 ai, it checks if it can block the player from winning 
    public static void checkBlock()
      {
    	Universal_Methods.foundMove = false;
      checkBlockRow();
      checkBlockCol();
      checkBlockDiag();
      checkBlockReverseDiag();
      }
    
    //checks the rows to see if it can win
    public static void checkWinRow()
      {
      if(Universal_Methods.foundMove == false)
        {
        for(int row = 0; row < 3; row++)
          {
          int counter = 0;
          for(int col = 0; col < 3; col++)
            {
            counter = counter + Universal_Methods.myMatrix2[row][col];
            if(counter == 10)
              {
              for(col = 0; col < 3; col++)
                {
                if(Universal_Methods.myMatrix[row][col].equals(" "))
                  {
                	Universal_Methods.myMatrix[row][col] = "O";
                	Universal_Methods.myMatrix2[row][col] = 5;
                	Universal_Methods.playCount++;
                	Universal_Methods.foundMove = true;
                  return;
                  }
                }
              }
            }
          }
        }
      }
  
    //checks the colums to see if it can win
    public static void checkWinCol()
      {
      if(Universal_Methods.foundMove == false)
        {
        for(int col = 0; col < 3; col++)
          {
          int counter = 0;
          for(int row = 0; row < 3; row++)
            {
            counter = counter + Universal_Methods.myMatrix2[row][col];
            if(counter == 10)
              {
              for(row = 0; row < 3; row++)
                {
                if(Universal_Methods.myMatrix[row][col].equals(" "))
                  {
                	Universal_Methods.myMatrix[row][col] = "O";
                	Universal_Methods.myMatrix2[row][col] = 5;
                	Universal_Methods.playCount++;
                	Universal_Methods.foundMove = true;
                  return;
                  }
                }
              }
            }
          }
        }
      }
  
    //checks the diagionals for a winning position
    public static void checkWinDiagonal() 
      {
      if (Universal_Methods.foundMove == false) 
        {
        int counter = 0;
        for (int i = 0; i < 3; i++) 
          {
          counter = counter + Universal_Methods.myMatrix2[i][i];
          }
        if (counter == 10) 
          {
          for (int i = 0; i < 3; i++) 
            {
            if (Universal_Methods.myMatrix[i][i].equals(" ")) 
              {
            	Universal_Methods.myMatrix[i][i] = "O";
            	Universal_Methods.myMatrix2[i][i] = 5;
            	Universal_Methods.playCount++;
            	Universal_Methods.foundMove = true;
              return;
              }
            }
          }
        }
      }
  
    //checks the reverse diagionals for winning positions
    public static void checkWinReverseDiagonal() 
      {
    if (Universal_Methods.foundMove == false) 
      {
      int counter = 0;
      for (int i = 0; i < 3; i++) 
        {
        counter = counter + Universal_Methods.myMatrix2[i][2 - i];
        }
      if (counter == 10) 
        {
        for (int i = 0; i < 3; i++) 
          {  
          if (Universal_Methods.myMatrix[i][2 - i].equals(" ")) 
            {
        	  Universal_Methods.myMatrix[i][2 - i] = "O";
        	  Universal_Methods.myMatrix2[i][i] = 5;
        	  Universal_Methods.playCount++;
        	  Universal_Methods.foundMove = true;
            return;
            }
          }
        }
      }
    }
  
    //checks the rows to see if it can block the player from winning
    public static void checkBlockRow()
      {
      if(Universal_Methods.foundMove == false)
        {
        for(int row = 0; row < 3; row++)
          {
          int counter = 0;
          for(int col = 0; col < 3; col++)
            {
            counter = counter + Universal_Methods.myMatrix2[row][col];
            if(counter == 4)
              {
              for(col = 0; col < 3; col++)
                {
                if(Universal_Methods.myMatrix[row][col].equals(" "))
                  {
                	Universal_Methods.myMatrix[row][col] = "O";
                	Universal_Methods.myMatrix2[row][col] = 5;
                	Universal_Methods.playCount++;
                	Universal_Methods.foundMove = true;
                  return;
                  }
                }
              }
            }
          }
        }
      }
  
    //checks the colums to see if it can block the player from winning
    public static void checkBlockCol()
      {
      if(Universal_Methods.foundMove == false)
        {
        for(int col = 0; col < 3; col++)
          {
          int counter = 0;
          for(int row = 0; row < 3; row++)
            {
            counter = counter + Universal_Methods.myMatrix2[row][col];
            if(counter == 4)
              {
              for(row = 0; row < 3; row++)
                {
                if(Universal_Methods.myMatrix[row][col].equals(" "))
                  {
                	Universal_Methods.myMatrix[row][col] = "O";
                	Universal_Methods.myMatrix2[row][col] = 5;
                	Universal_Methods.playCount++;
                	Universal_Methods.foundMove = true;
                  return;
                  }
                }
              }
            }
          }
        }
      }
  
    //checks the diagionals to see if it can block the player from winning
    public static void checkBlockDiag()
      {
      if (Universal_Methods.foundMove == false) 
        {
        int counter = 0;
        for (int i = 0; i < 3; i++) 
          {
          counter = counter + Universal_Methods.myMatrix2[i][i];
          }
        if (counter == 4) 
          {
          for (int i = 0; i < 3; i++) 
            {
            if (Universal_Methods.myMatrix[i][i].equals(" ")) 
              {
            	Universal_Methods.myMatrix[i][i] = "O";
            	Universal_Methods.myMatrix2[i][2 - i] = 5;
            	Universal_Methods.playCount++;
            	Universal_Methods.foundMove = true;
              return;
              }
            }
          }
        }
      }
  
    //checks the reverse diagionals to see if it can block the player from winning
    public static void checkBlockReverseDiag()
      {
      if (Universal_Methods.foundMove == false) 
      {
      int counter = 0;
      for (int i = 0; i < 3; i++) 
        {
        counter = counter + Universal_Methods.myMatrix2[i][2 - i];
        }
      if (counter == 4) 
        {
        for (int i = 0; i < 3; i++) 
          {  
          if (Universal_Methods.myMatrix[i][2 - i].equals(" ")) 
            {
        	  Universal_Methods.myMatrix[i][2 - i] = "O";
        	  Universal_Methods.myMatrix2[i][2 - i] = 5;
        	  Universal_Methods.playCount++;
        	  Universal_Methods.foundMove = true;
            return;
            }
          }
        }
      }
      }
  
    //if the ai can't block or win, it plays in the center
    public static void playCenter()
      {
      if(Universal_Methods.foundMove == false)
        {
        if(Universal_Methods.myMatrix[1][1].equals(" "))
          {
        	Universal_Methods.myMatrix[1][1] = "O";
        	Universal_Methods.myMatrix2[1][1] = 5;
        	Universal_Methods.playCount++;
        	Universal_Methods.foundMove = true;
          return;
          }
        }
      }
  
    // if the ai can't win, block, or play in the center, it makes a random move
    public static void playRandom()
      {
      if(Universal_Methods.foundMove == false)
        {
    	  Easy_AI.easyAITurn();
    	  Universal_Methods.foundMove = true;
        return;
        }
      }
	}
