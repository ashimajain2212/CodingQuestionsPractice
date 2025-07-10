import java.util.HashMap;
import java.util.Map;

public class countCharactersInString {

	public static void main(String[] args) {

		String str = "ddmmmmyyytt";

		String output = "";

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new HashMap();

	//	int count = 0;
		
		for (char c: arr)
		{
			
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			
			else
				map.put(c, 1);
		}
		
		System.out.println("encoded string is" +map);
	}

}
