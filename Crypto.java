import java.util.*;
import java.io.*;
public class Crypto{
	public static void main(String[] args) {
		List<String> string_list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		int ascii ;
		String word = input.next();
		char word_char[] = word.toCharArray();
		for(int i = 1 ;i < 26; i++){
			for(int j = 0 ; j < word.length();  j++){
			ascii= (int)word_char[j];
			if(ascii + i > 122)
			 	word_char[j] = (char)(ascii+i-26);
			else
				word_char[j] = (char)(ascii + i);

		}
		
		string_list.add(String.valueOf(word_char));
		System.out.println(string_list.get(i-1));
		}
	}
}