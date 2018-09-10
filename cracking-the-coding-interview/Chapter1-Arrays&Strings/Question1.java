
public class Question1 {
	public boolean uniqueChars(String str){
		/*
		We assume that characters are ASCII so we have max of 128 diffrent-types
		*/

		if(str.length() > 128) return false;
		boolean[] char_array = new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			if(char_array[str.charAt(i)])
				return false;
			char_array[str.charAt(i)] = true;
		}

		return true;
	}

	/* https://www.geeksforgeeks.org/determine-string-unique-characters/ 
	This explains best way without data strctures use, for a-z chars, use bit_cheker logic 
	We are certain that we dont traverse more than 128 characters in string as we would return false, once we see it repeating. Worst case O(128)
	*/
}
