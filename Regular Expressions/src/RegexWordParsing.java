/**
 * Demonstrates basic word matching in regular expressions. Requires
 * the {@link RegexHelper} class.
 *
 * @see RegexHelper
 * @see RegexClasses
 * @see RegexQuantifiers
 * @see RegexBoundaries
 * @see RegexWordParsing
 * @see RegexQuiz
 */
public class RegexWordParsing {

	public static void main(String[] args) {

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
		// 0     1   2     3  4   5       6    7   8
		System.out.println("Start of Word \\b\\w");
		RegexHelper.showMatches(RegexHelper.sample, "\\b\\w");

		System.out.println();

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
	    //     0   1     2  3   4      5   6     7         8
		System.out.println("End of Word \\w\\b");
		RegexHelper.showMatches(RegexHelper.sample, "\\w\\b");

		System.out.println();

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
		// 00000 111 22222 33 444 555555  66   777 888888888
		System.out.println("Words (Sans Hyphen) \\b\\w+\\b");
		RegexHelper.showMatches(RegexHelper.sample, "\\b\\w+\\b");

		System.out.println();

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
		// 00000 111 22222 33 444 555555  66   777 888888888
		System.out.println("Words (Sans Hyphen) \\w+");
		RegexHelper.showMatches(RegexHelper.sample, "\\w+");

		System.out.println();

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
		// 00000 111 22222 33 4444444444  55   666 777777777
		System.out.println("Words (With Hyphen) \\S+\\b");
		RegexHelper.showMatches(RegexHelper.sample, "\\S+\\b");

		System.out.println();

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
		// 00000 111 22222 33 44444444444 55   666 7777777777
		System.out.println("Words (With Symbol) \\S+");
		RegexHelper.showMatches(RegexHelper.sample, "\\S+");

		System.out.println();

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
		// 00000 111 22222    3333333333           444444444
		System.out.println("Words that start with S (?i)s\\S+\\b");
		RegexHelper.showMatches(RegexHelper.sample, "(?i)s\\S+\\b");

		System.out.println();

		// Sally Sue sells 76 sea-shells, by   the sea_shore.
		//       000 11111    2222222222       333 444444444
		System.out.println("Words that contain an e \\b\\S*e\\S*\\b");
		RegexHelper.showMatches(RegexHelper.sample, "\\b\\S*e\\S*\\b");
	}
}
