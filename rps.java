import java.lang.*;
import java.util.*;
import java.util.Random;

class MyTest
{
	public static void main(String args[])
	{
	  /*String str = "something@gmail.com";
	  
	  int i = str.indexOf("@");
	  String userName = str.substring(0, i); // something
	  String domain = str.substring(i + 1, str.length()); // hotmail.com | gmail.com
	  
	  System.out.println("Username = " + userName + "\n" + "Domain = " + domain);
	  
	  int j = domain.indexOf(".");
	  String name = domain.substring(0, j); // hotmail | gmail
	  //System.out.printf("%s\n", name);
	  
	  System.out.println(name.equals("gmail"));
	  
	  String str2 = "Weeeeeeeed";
	  
	  String newStr2 = str2.replaceAll("[e]", "");
	  
	  System.out.println(newStr2);
	  
	  System.out.println(str.compareTo(str2));  // 28 ?*/
	  
	  
	  
	  
	  Random r = new Random();
	  
	  Scanner s = new Scanner(System.in);
	  
	  System.out.println("RPS");
	  
	  //char choice = s.next().charAt(0);
	  
	  char choice = args[0].charAt(0);
	  
	  char cpu = 'P';
	  
	  int ra = r.nextInt(2);
	  
	  String randChar = "RPS";
	  
	  
	  
	  cpu = (char)randChar[ra];
	  
	  //System.out.println("DEBUG choice: " + choice);
	  
	  System.out.printf("You picked %c! CPU picked %c\n", choice, cpu);
	  
	  String winner = "default";
	  
	  if(choice == cpu)
	  {
		  System.out.println("It's a tie.");
		  return;
	  }
	  
	  switch(choice)
	  {
		  case 'P':
			if(cpu == 'R')
				winner = "Human";
			else if(cpu == 'S')
				winner = "Computer";
			else
				System.out.println("Should never happpens.");
			break;
			
		  case 'S':
			if(cpu == 'R')
				winner = "Computer";
			else if(cpu == 'P')
				winner = "Human";
			else
				System.out.println("404");
			break;
			
			case 'R':
				if(cpu == 'P')
					winner = "Computer";
				else if(cpu == 'S')
					winner = "Human";
				else
					System.out.println("404");
			break;
			
			default:
				System.out.println("Hmm no good.");
				break;			
	  }
	  
	  System.out.println(winner + " wins!");
	  
	}
};
