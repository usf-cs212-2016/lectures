
/**
 * Demonstrates differences between quantifiers. Requires the
 * {@link RegexHelper} class.
 *
 * @see RegexHelper
 * @see RegexClasses
 * @see RegexQuantifiers
 * @see RegexBoundaries
 * @see RegexWordParsing
 * @see RegexQuiz
 */
public class RegexQuantifiers {

	public static void main(String[] args) {

		String text = "aardvark";
		String regex;

		/*
		 * Basic greedy quantifiers.
		 */

		// aardvark
		// 01   2
		regex = "a";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// aardvark
		// 00***4**
		regex = "a*";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// aardvark
		// 00   1
		regex = "a+";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// aardvark
		// 00
		regex = "a{2}";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		/*
		 * Demonstrate reluctant.
		 */

		// aardvark
		// 0000000
		regex = "a.+r";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// aardvark
		// 000
		regex = "a.+?r";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		/*
		 * Demonstrate possessive.
		 */

		// aardvark
		// 00000000
		regex = "[^k]+k";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// aardvark
		// 00000000
		regex = "[^k]++k";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// aardvark
		// 0000
		regex = "[^k]+d";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// aardvark
		// (none)
		regex = "[^k]++d";
		System.out.println("\nRegex: " + regex);
		RegexHelper.showMatches(text, regex);

		// Possessive is trying to match entire string, no backtracking
		// is done if entire string does not match.
	}
}
