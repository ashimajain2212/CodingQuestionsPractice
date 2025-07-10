
public class RemoveExtraWhiteSpacesString {

	public static void main(String[] args) {



		String input= "   hello   world    ";
		System.out.println(input);
		String str = input.trim(); // trim will remove white spaces from starting & ending of the string
		
		System.out.println(str);
		
		//to remove white spaces within two words we will use replaceAll method
		
		//s= means single white space
		
		//s+ = more than 1 white space
		//now we will use replaceAll method to remove the white spaces within the words
		
		str= str.replaceAll("\\s+", " ");
		System.out.println(str);
		
	}

	}

