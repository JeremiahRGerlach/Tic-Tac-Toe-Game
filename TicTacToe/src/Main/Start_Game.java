package Main;

import java.util.Scanner;

public class Start_Game 
	{
	public static void greetUser()
    {
      Scanner userStringInput = new Scanner(System.in);
      Scanner userIntInput = new Scanner(System.in);
      System.out.println("Hello, what is your name?");
      String name = userStringInput.nextLine();
      System.out.println("Hello," + name + " let's play a game of tic tac toe!");
      System.out.println("Are there (1) 1 player, or (2) 2 players ?");
      int numPlayers = userIntInput.nextInt();

      if(numPlayers == 1)
        {
        whichAI();
        }

      if(numPlayers == 2)
        {
        Two_Players.playWith2Players();
        }
      }

  public static void whichAI()
  	{
    Scanner userStringInput = new Scanner(System.in);
    Scanner userIntInput = new Scanner(System.in);
    
    System.out.println("Which level ai would you like you play against? (1) easy or (2) hard");
    int aiLevel = userIntInput.nextInt();

    if(aiLevel == 1)
      {
      Easy_AI.playAgainstEasyAI();
      }

    else if(aiLevel == 2)
      {
      Hard_AI.playAgainstHardAI();
      }

    else
      {
      System.out.println("I'm sorry, I don't understand!");
      whichAI();
      }
    
    }
  }
