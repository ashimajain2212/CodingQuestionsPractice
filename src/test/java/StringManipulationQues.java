
public class StringManipulationQues {

	public static void main(String[] args) {
	
		
		//whenever any modification on any string.. it creates a new String
		// so take StringBuilder// as it is memory efficient//as its an class we will create a object
		String input= "99956";
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<input.length()-1;i++)
			
		{
			result.append(input.charAt(i)); //append the current character
			int currentNumber= Character.getNumericValue(input.charAt(i));
			int nextNumber= Character.getNumericValue(input.charAt(i+1));
			
			if (currentNumber%2 !=0 && nextNumber%2 !=0 && currentNumber==nextNumber)
			{
				
				result.append("-");
			}
			
		}
		result.append(input.charAt(input.length()-1));
		System.out.println(result);
	
	}
	

}
