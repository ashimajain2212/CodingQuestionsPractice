
public class UniqueElementInString {

	public static void main(String[] args) {
	
		String str="aaassshhhiiima";
		
		for(int i=0;i<str.length()-1;i++)
		{
			int count=0;
			
			for(int j=0;j<str.length();j++)
			{
			if(str.charAt(i)==str.charAt(j))
			{
				
				count=count+1;
			}}
			
		if(count==1)
		{
			
			System.out.println(str.charAt(i));
		}
		}}
		
	}


