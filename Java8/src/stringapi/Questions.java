package stringapi;

public class Questions {

	public static void reverseWord(String word) {
		String[] arr = word.split("");
		for (int i = 4; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	};

	public static String reverseWord1(String word) {
		String[] arr = word.split("");
		String str = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			// str=str+arr[i];
			// str = str.concat(arr[i]);
			char ch = word.charAt(i);
			str = str + ch;
		}
		return str;
	};

	public static String reverseSentence(String sentence) {
		String[] words = sentence.split(" ");
		String str="";
		
		for(int i=words.length-1 ; i>=0; i-- ) {
			str=str+words[i]+" ";
		}
		System.out.println(str.length());
		return str;
	}

	public static void main(String[] args) {
		String result = Questions.reverseWord1("Naysha");
		System.out.println(result);
		System.out.println(reverseSentence("My name is khan "));
		System.out.println(reverseSentence("My name is khan ").length());
	}

}
