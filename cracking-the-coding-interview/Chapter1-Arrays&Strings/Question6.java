public class Question6 {

	
	public static String compress(String input) {
		if(input.length() <2) return input;
		String result ="";
		char[] char_array =  new char[50];
		//char[] char_array =  new input.toCharArray();
		char cur_char = char_array[0];
		int stop = 0;
		int count = 1;
	
		for(int i=1;i<char_array.length && stop ==0;i++) {
			if(cur_char != char_array[i]) {
				result = result + cur_char + count;
				if(result.length() > input.length()) {
					stop =1;
					return input;}
				count = 1;
				cur_char = char_array[i];
			}
			else {
				count++;}
		}
		result = result + cur_char + count;
		
		return (result.length() > input.length())?input:result;
	}
}
