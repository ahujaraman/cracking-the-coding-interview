

/*
 * LeetCode Question - Rotate- String
 */

public class Question9 {
		   /* public boolean rotateString(String A, String B) {
		        if(A.length() != B.length()) return false;
		        if( A.length()==0 && B.length()==0) return true;
		        if( A.length()==0 || B.length()==0) return false;
		        
		        for(int i=0;i<A.length();i++){
		            String first_char = ""+ A.charAt(0);
		            String compare = A.substring(1) + first_char;
		            if(compare.equals(B)) return true;
		            A = compare;
		            System.out.println(A);
		        }
		        return false;
		    }
		    */
		    
		    /* Double the string and search for the other in it. Good Trick   */
		    
		    public boolean rotateString(String A, String B) {
		        if(A.length() != B.length()) return false;
		        if( A.length()==0 && B.length()==0) return true;
		        if( A.length()==0 || B.length()==0) return false;
		        String double_str = "" + A + A;
		        return double_str.contains(B);
		    }
		    
		
}
