import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		while (!(input.equals("exit"))){
			Scanner kb = new Scanner(System.in);
			System.out.print("Enter Phrase (or \"Exit\" to end the program): ");
			input = kb.nextLine();
			input = removeStuff(input.toLowerCase());
			if(input.equals("exit")){
				break;
			}
			else if (isPalindrome(input)){
				System.out.println("Yes, this is a palindrome.");
			}	
			else{
				System.out.println("No, this is not a palindrome.");
			}
			System.out.println();
		}
		System.out.println("Program Ended.");
	}
	public static String removeStuff(String s){
		if(s.length() > 1){
			if(!(s.charAt(0) >= 97 && s.charAt(0) <= 122)){
				return removeStuff(s.substring(1));
			}
			else{
				return s.substring(0,1) + removeStuff(s.substring(1));
			}
		}
		else{
			if(!(s.charAt(0) >= 97 && s.charAt(0) <= 122)){
				return "";
			}
			else{
				return s;
			}
		}
	}
	public static boolean isPalindrome(String s){
		if (s.length() > 1 ){
			if (s.substring(0,1).equals(s.substring(s.length()- 1))){
				return isPalindrome(s.substring(1,s.length()- 1));
			}
			else{
				return false;
			}
		}
		else{
			return true;
		}
	}

}
