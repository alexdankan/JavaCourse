
public class Main {
	
	public static void main(String[] args) {
		String input = "abbbccccd";
		
		System.out.println(geLongestSubstring(input));
	}
	
	public static int geLongestSubstring(String input) {
		
		int count=1;
		int max=1;		
		for (int i = 0; i < input.length()-1; i++) {
			if(input.charAt(i)==input.charAt(i+1)) {
				count ++;	
				max=count;			
			}
			else {
				count=1;
				
			}if(count>max) {
				max=count;
			}					
		}		
		return max;		
	}
}
