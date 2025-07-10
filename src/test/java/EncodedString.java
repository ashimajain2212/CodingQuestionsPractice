
public class EncodedString {

	public static void main(String[] args) {
		
		String input="dddmmmmyyyyttt";
		StringBuilder str= new StringBuilder(); //we want to perform modification hence taking stringBuilder
		
	int count=1;
	
	char[] arr =input.toCharArray();
	
	for(int i=1;i<input.length();i++)
	{
		
		if (input.charAt(i)==input.charAt(i-1))
		{
			count++;
			
		}
	
		else
		{
			str.append(input.charAt(i-1));
			
			str.append(count);
			count=1;
		}

	}
	
	str.append(input.charAt(input.length()-1));
	
	

	}

}
