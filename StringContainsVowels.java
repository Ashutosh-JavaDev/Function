package Function;
public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("ToV")); // false
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}