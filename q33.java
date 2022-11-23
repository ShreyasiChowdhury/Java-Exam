import java.util.*;

class q33 {
	public static void main(String args[]) {
		String s = "This is a very good practice to use good constructor in coding of a good class, good is always good";
		s = s.toLowerCase();
		String[] words = s.split("\\W+");
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].compareTo(words[j]) > 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(words));
	}
}