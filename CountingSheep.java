import java.lang.*;
import java.util.Scanner;

public class CountingSheep
{
	public static void main (String[] args)
	{
		Scanner readLine = new Scanner(System.in); 
			
			String instructions = "Please, input answer when prompted \n";
			String countAgain   = "";
			String operations   = "How would you like to count the sheep?\n1: Addition\n2: Subtraction\n3: Multiplication";
			String greeting     = "Welcome to Sleep Sheep,count the sheep till you sleep";
			String userString   = "";
			
		do
		{
			int i		 = 0;
			int baw		 = 0;
			int sheepTotal	 = 0;
			int sheepProduct = 0;
			int leftOver	 = 0;
			int sheepSum	 = 0;
			int multBy	 = 0;
			int addBy	 = 0;
			int subBy	 = 0;
			int userInt	 = 0;
			
			System.out.println ("\n" + greeting + "\n");
			
			do
			{
				try
				{
					System.out.println (instructions);
					System.out.println (operations);
			
					System.out.print ("User Input: ");
					userInt = Integer.parseInt (readLine.next());
				}
				catch (Exception e)
				{
					System.out.println ("\nInvalid input, please enter a number between 1 and 3");
				}
			} while (userInt < 1 || userInt > 3);
			
			if (userInt == 1)
			{
				do
				{
					try
					{
						i = 0;
						System.out.println ("");
						System.out.println ("We will count sheep by Addition \n");
						System.out.println ("How many sheep, in total would you like to enter the pin?");
				
						System.out.print   ("User Input: ");
						sheepTotal = Integer.parseInt (readLine.next());
						System.out.println ("");
				
						System.out.println ("How many sheep at a time do you want to count? ");
				
						System.out.print   ("User Input: ");
						addBy = Integer.parseInt (readLine.next());
						System.out.println ("");
					}
					catch (Exception e)
					{
						System.out.println ("Invalid input, please enter numbers only");
						i = 1;
					}
				} while ( i == 1); 	
				
				while (sheepSum < sheepTotal)
				{
					baw = baw + addBy;
					sheepSum = baw;
					
					if(sheepSum > sheepTotal)
					{
						System.out.println ("\nOpps we can't fit all the sheep into the pin");
						while (sheepSum != sheepTotal)
						{	
							sheepSum --;
							leftOver ++;
						}
						
					}
					if (leftOver > 0)
					{
						System.out.println ("\nWe have " + sheepSum + " bawing sheep in the pin");
						System.out.println ("And " + leftOver + " bawing sheep too many");
					
					}
					if (leftOver == 0)
					{
						System.out.println (sheepSum + " Bawing sheep have entered the pin");
					}				
				}
					System.out.println ("\nStill awake, would you like to count again?");
					System.out.println ("Input \"Yes\" to continue  ");
				
					System.out.print   ("User Input: ");
					countAgain = readLine.next ();
			}
			
			if (userInt == 2)
			{
				do
				{
					try
					{
						i = 0;
						System.out.println ("");
						System.out.println ("We will count sheep by Subtraction \n");
						System.out.println ("How many sheep, in total would you like to let out of the pin?");
				
						System.out.print   ("User Input: ");
						sheepTotal = Integer.parseInt (readLine.next ());
						System.out.println ("");
				
						System.out.println ("How many sheep do you want to let out at a time?");
				
						System.out.print   ("User Input: ");
						subBy = Integer.parseInt (readLine.next());
						System.out.println ("");
					}
					catch (Exception e)
					{
						System.out.println ("\nInvalid input, please enter numbers only");
						i = 1;
					}
				} while (i == 1);
				
				int sheepDifference = sheepTotal;
				
				while (sheepDifference > 0)
				{
					sheepTotal = sheepTotal - subBy;
					sheepDifference = sheepTotal;
					
					if (sheepDifference < 0)
					{
						System.out.println ("\nOpps there aren't enough sheep left in the pin to subtract by " + subBy);
						while (sheepDifference != 0)
						{
							sheepDifference ++;
							leftOver++;
						}	
					}
					if (leftOver > 0)
					{
						System.out.println ("The pin is " + leftOver + " bawing sheep short ");						
					}
					if (leftOver == 0)
					{
					System.out.println (sheepDifference + " Bawing sheep have left the pin ");
					}
				}
				
				System.out.println ("\nStill awake, would you like to count again?");
				System.out.println ("Input \"Yes\" to continue  ");
				
				System.out.print   ("User Input: ");
				countAgain = readLine.next ();
			}
			
			if (userInt == 3)
			{
				do
				{
					try
					{
						i = 0;
						baw = 1;
				
						System.out.println ("");
						System.out.println ("We will count sheep by Multiplication \n");
						System.out.println ("How many sheep, in total would you like to enter the pin?");
					
						System.out.print   ("User Input: ");
						sheepTotal = Integer.parseInt (readLine.next ());
						System.out.println ("");
						
						System.out.println ("What factor do you want the groups of sheep to enter by?");
				
						System.out.print   ("User Input: ");
						multBy = Integer.parseInt (readLine.next ());
						System.out.println ("");
					}
					catch (Exception e)
					{
							System.out.println ("\nInvaild input, please enter numbers only");
							i = 1;
					}
				} while(i ==1);
				
				while ( multBy <= 1)
				{
					System.out.println ("Please input a number greater than 1");
					System.out.print ("Re-enter number: ");
					multBy = Integer.parseInt (readLine.next());
				}
				
				while (sheepProduct < sheepTotal)
				{
					baw = baw * multBy;
					sheepProduct = baw;
				
					if (sheepProduct > sheepTotal)
					{
						System.out.println ("\nOpps we can't fit all the sheep into the pin");
						
						while (sheepProduct != sheepTotal)
						{
							sheepProduct --;
							leftOver ++;
						}
					}
					if (leftOver > 0)
					{
						System.out.println ("\nWe have have " + sheepProduct + " bawing sheep in the pin ");
						System.out.println ("And " + leftOver + " sheep too many");
					}
					if (leftOver == 0)
					{
						System.out.println (sheepProduct + " Bawing sheep have enter the pin");
					}
				}
				
				System.out.println ("\nStill awake, would you like to count again?");
				System.out.println ("Input \"Yes\" to continue  ");
				
				System.out.print   ("User Input: ");
				countAgain = readLine.next ();
			}
		}while (countAgain.equalsIgnoreCase ("Yes"));
	}
}
