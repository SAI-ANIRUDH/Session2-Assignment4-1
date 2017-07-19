package assignment2; // Declaring package //
import java.util.Scanner; // Importing Scaner class from Util Package //
public class TestDemo {

	public static void main(String[] abc) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // Taking input from user //
		char x=4; // Declaring variable x //
		int ascii=(char)x; // Type Casting char variable into int value //
			
			abc((char)x);
				}
			public static void abc(int x) // Declaring and initializing method abc //
			{ 

				 //x = 0; 
				 if (x==0)
				 {
					System.out.println("You Have Entered Zero x"+(char)x);
				}
				else if (x>0)
				{
					System.out.println("You Have Positive number" +(char)x);
				}
				else if(x<0) {
					System.out.println("You Have Negative Number"+(char)x);
				}
			}
			 }
		
