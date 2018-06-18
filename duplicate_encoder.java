/* Adrien Scrève 2018
 * https://www.codewars.com/kata/duplicate-encoder/train/java
*/

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase(); // get rid of uppercase
    String[] splitword = word.split("");
    String newWord = "";
    for (int i=0; i<word.length(); i++) {
      int occChecker = 0; // occChecker is an occurence counter
      for (int index = word.indexOf(splitword[i]); index >= 0; index = word.indexOf(splitword[i], index + 1))
          occChecker++; // if there's more than 1 occurence then we put a )
      newWord += (occChecker > 1) ? ")" : "(";
    }
    return newWord;
  }
}

