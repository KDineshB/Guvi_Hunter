import java.util.Scanner;

public class ReverseWordsInPlace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String[] words = sentence.split(" ");
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			buffer.append(new StringBuffer(words[i]).reverse().toString()+" ");
		}
		System.out.println(buffer);
		scanner.close();
	}

}
