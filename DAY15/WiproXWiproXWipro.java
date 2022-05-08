/*
 * Given two strings, word and a separator, return a big string made of count 
 * occurrences of the word, separated by the separator string.
 * if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".
 * */



public class WiproXWiproXWipro {

	public static void main(String[] args) {
		String str1 = "Wipro";
		String str2 = "X";
		int separator = 3;
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0 ; i < separator - 1; i++) 
			sb.append(str1).append(str2);
		sb.append(str1);
		
		System.out.println(sb);
	}

}