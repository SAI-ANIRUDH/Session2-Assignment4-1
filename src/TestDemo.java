package assignment2;
import java.util.Scanner;
public class TestDemo {

	public static void main(String[] abc) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char x=4;
		int ascii=(char)x;
			
			abc((char)x);
				}
			public static void abc(int x) { 

				 //x = 0; 
				 if (x==0)
				 {
					System.out.println("You Have Entered Zero x"+(char)x);
				}
				else if (x>0) {
					System.out.println("You Have Positive number" +(char)x);
				}
				else if(x<0) {
					System.out.println("You Have Negative Number"+(char)x);
				}
			}
			 }
		
