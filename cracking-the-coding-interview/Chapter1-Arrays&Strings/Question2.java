
public class Question2 {
	/* Given two strings check whether one is permutation of the other */

	public boolean permStrings(String left, String right){
		/* First check there lengths are not equal, return false */
		if(left.length() != right.length()) return false;
		int[] left_arr = new int[128];
		int[] right_arr = new int[128];

		for(int i=0;i<left.length();i++){
			left_arr[left.charAt(i)]++;
		}
		for(int i=0;i<right.length();i++){
			right_arr[right.charAt(i)]++;
		}
		for(int i=0;i<128;i++){
			if(left_arr[i]!=right_arr[i]) return false;
		}
		return true;
	}

	/* Here, I have done with two arrays to maintain hash of two strings, you can develop Hash in fist array and 
	then just decrement the count for next string, if the value < 0, return false */
}