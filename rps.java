import java.lang.*;
import java.util.*;

class MyTest
{
	public static void main(String args[])
	{
	  Random r = new Random();
	  Scanner s = new Scanner(System.in);
	  
	  System.out.println("RPS");
 
	  char choice = args[0].charAt(0);
	  char cpu = 'P';
	  int ra = r.nextInt(3);
	  String randChar = new String("RPS");
	  
	  cpu = randChar.charAt(ra);

	  System.out.printf("You picked %c! CPU picked %c\n", choice, cpu);
	  
	  String winner = "default";
	  
	  if(choice == cpu)
	  {
		  System.out.println("It's a tie.");
		  return;
	  }
	  
	  winner = validator(choice, cpu);
	  
	  System.out.printf("%s wins!", winner);
	}
	
	public static String validator(char humain_choice, char cpu_choice) 
	{
		
		String winner = new String("a");
		
		switch(humain_choice)
		{
			  case 'P':
				if(cpu_choice == 'R')
					winner = "Human";
				else if(cpu_choice == 'S')
					winner = "Computer";
				else
					System.out.println("Should never happpens.");
				break;

			  case 'S':
				if(cpu_choice == 'R')
					winner = "Computer";
				else if(cpu_choice == 'P')
					winner = "Human";
				else
					System.out.println("404");
				break;

			case 'R':
				if(cpu_choice == 'P')
					winner = "Computer";
				else if(cpu_choice == 'S')
					winner = "Human";
				else
					System.out.println("404");
				break;

			default:
				System.out.println("Hmm no good.");
				break;			
		  }
	return winner;
	}
}
