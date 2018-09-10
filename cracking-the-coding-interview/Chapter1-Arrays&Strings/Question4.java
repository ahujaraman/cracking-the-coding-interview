
public class Question4 {

	
	public static boolean isPermutationOfPalindrome(String str) {
		if(str.length() <=1) return true;
		int[] result_map = new int[26];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!= ' ')
			{
				int val = str.charAt(i) - 'a';
				result_map[val]++;
			}
		}
		int count=0;
		for(int i=0;i<26;i++) {
			if(result_map[i]%2 != 0) count++;
		}
		return count<=1?true:false;
	}
	
	public static void main(String[] args) {
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali.toLowerCase()));
	} 
	
	
	/* 
	 * Elegant solution of using integer as it is 32 bits and instead of map, 0-26 bits 
	 * treat as bit to toggle.
	 */
	
	public boolean isPermuteBits(String str) {
		int bitVector = getBitVector(str);
		return checkBits(bitVector);
	}
	
	
	public int getBitVector(String str) {
		int bitVector = 0;
		for(char c : str.toCharArray())
		{
			int val = c;
			bitVector = toggle(bitVector,val);
		}
		return bitVector;
	}
	
	public int toggle(int bitVector, int position) {
		if(position < 0) return bitVector;
		int mask = 1 << position;
		if ((bitVector & mask) == 0) {
			bitVector |= mask;
		} else { 
			bitVector &= ~mask;
		} 
		return bitVector;
	}
	
	public boolean checkBits(int bitVector) {
		return ((bitVector) & (bitVector - 1))==0?true:false;
	}
	
}
