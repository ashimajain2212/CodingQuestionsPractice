
public class decodeString {

	public static void main(String[] args)
	
	{
		
		String input = "d3m4y5" ; 
		
		StringBuilder result= new StringBuilder();
		
	
		
		int count=0;
		for (int i=0;i<input.length();i=i+2)
		{
			

			char letter = input.charAt(i);
			
			count= Character.getNumericValue(input.charAt(i+1));
		

	
		
		for(int j=0;j<count;j++)
		{
			
			result.append(letter);
		}}
		System.out.println(result);
		}
}
