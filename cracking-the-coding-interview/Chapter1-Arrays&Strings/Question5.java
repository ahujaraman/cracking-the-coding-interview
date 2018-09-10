/*
 * I took the question considering any permutation and order does not matter, thus solution is 
 * according to without considering the order of characters i string.
 */
public class Question5 {

	public static boolean oneEditAway(String str1,String str2)
	{
		if(Math.abs(str1.length() - str2.length()) > 1) return false;
		int[] str_map = new int[26];
		if(str2.length() >= str1.length())
		{
			str_map = getMap(str2);
			str_map = getSubtractMap(str1,str_map);
		}
		else {
			str_map = getMap(str1);
			str_map = getSubtractMap(str2,str_map);
		}
		int diff = 0;
		for(int i=0;i<26;i++) {
			diff += Math.abs(str_map[i]);
		}
		if(str1.length() == str2.length() && diff > 2) return false;
		else if(str1.length() != str2.length()  && diff > 1) return false;
		return true;
	}
	
	public static int[] getMap(String str)
	{ 
		int[] map = new int[26];
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i) - 'a';
			map[val]++;
		}
		return map;
	}
	
	public static int[] getSubtractMap(String str,int[] str_map)
	{ 
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i) - 'a';
			str_map[val]--;
		}
		return str_map;
	}
	
	public static void main(String[] args) {
		String str1 = "pse";
		String str2 = "pale";
		boolean isOneEdit = oneEditAway(str1, str2);
		System.out.println(str1 + ", " + str2 + ": " + isOneEdit);
	} 
}
