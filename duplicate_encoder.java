// kata 54b42f9314d9229fd6000d9c

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase(); //
    String[] splitword = word.split("");
    String newWord = "";
    for (int i=0; i<word.length(); i++) {
      int occChecker = 0;
      for (int index = word.indexOf(splitword[i]); index >= 0; index = word.indexOf(splitword[i], index + 1))
          occChecker++;
      newWord += (occChecker > 1) ? ")" : "(";
    }
    return newWord;
  }
}

