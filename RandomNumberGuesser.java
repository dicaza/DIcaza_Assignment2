/*
 * Class: CMSC203 
 * Instructor: Professor Tsai
 * Description: (Give a brief description for each Class)
 * Due: 09/27/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: David Icaza
*/

import java.util.Scanner;

public class RandomNumberGuesser
{
  public static void main (String[]args)
  {
    try (Scanner sc = new Scanner(System.in))
    {
        int guess1;
        int count;
        String choice = "yes";
        System.out.println("This application generates a random integer between 1 and 100");
        System.out.println("and asks the user to guess repeatedly until they guess correctly.\n");
    
        do 
		{	
	        int low = 1;
            int high = 100;
			RNG.resetCount();
			int randomNum = RNG.rand();
			System.out.println("Enter your first guess:");
			guess1 = sc.nextInt();
			for (count = 1; count < 7; count++) {
				
			
			if (guess1 == randomNum)
			{
				count = 7;
				System.out.println("Congratulations, you guessed correctly");
				System.out.println("Try again? (yes or no)");
				choice = sc.nextLine();
				choice = sc.nextLine();
			}
			else if (guess1 < randomNum && guess1 > low)
			{
				low = guess1;
				System.out.println("Your guess is too low");
				System.out.println("Number of guesses is: " + count);
				System.out.println("Enter you next guess between " + low + " and " + high);
				guess1 = sc.nextInt();
			}
			else if (guess1 > randomNum && guess1 < high)
			{
				high = guess1;
				System.out.println("Your guess is too high");
				System.out.println("Number of guesses is: " + count);
				System.out.println("Enter your next guess between " + low + " and " + high);
				guess1 = sc.nextInt();
			}
			
		
		
			else if (guess1 <= low || guess1 >= high)
			{
				RNG.inputValidation(guess1, low, high);
				count--;
				guess1 = sc.nextInt();
			}
			}
			
			if (count == 7 && guess1 != randomNum)
		{
		    System.out.println("You have exceeded the maximum number of guesses, " + count + ". Try again.");
		    break;
		}    
			
			
		}
		while (choice.equals("yes") || choice.equals("Yes") || choice.equals("YES"));
	   
        if (choice.equals("no") || choice.equals("No") || choice.equals("NO"))
        {
            System.out.println("Thanks for playing...");
        }
        
        System.out.println("\nProgrammer name: David Icaza");
    }
  }
}

