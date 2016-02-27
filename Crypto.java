import java.util.*;
import java.io.*;
public class Crypto{
	public static void main(String[] args) {
		List<String> string_list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		int ascii ;
		String word = input.nextLine();
		String[] wordArray = word.split(" ");
		for (int b = 0; b < wordArray.length; b++) {
			char word_char[] = wordArray[b].toCharArray();
			for(int i = 0 ;i < 26; i++){
				for(int j = 0 ; j < wordArray[b].length();  j++){
				ascii= (int)word_char[j];
				if(ascii + i > 122)
				 	word_char[j] = (char)(ascii+i-26);
				else if(ascii == 32)
					continue;
				else
					word_char[j] = (char)(ascii + i);
				}
			}
			string_list.add(String.valueOf(word_char));
			string_list.add(" ");
		}
		for (int i = 0; i < string_list.size(); i++) {
			System.out.print(string_list.get(i));
		}
	}
}
