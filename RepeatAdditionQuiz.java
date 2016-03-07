//U10416038  馬嘉良
import java.util.Scanner;
import java.util.*;

public class RepeatAdditionQuiz{
	public static void main(String[] args){
		//datafield
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		int ans; 
		ArrayList inputs = new ArrayList();
	
		//Create a Scanner
		Scanner scanner = new Scanner(System.in);
		//scanner ans
		System.out.println("What is" + n1 + "*" +n2 +"?");
		ans = scanner.nextInt();
		
		
		
		
			
		 
		while (n1 * n2 != ans) {
			if(inputs.contains(ans)){
				System.out.println("You already entered "+ans+"!");
			}
			System.out.print("Wrong answer. Try again. What is " + n1 + " * " + n2 + "? ");
			inputs.add(ans);
			ans = scanner.nextInt();
		}
		//RIGHT
		System.out.println("You got it!");
    }
}