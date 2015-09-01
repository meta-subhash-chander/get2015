/***************************************************************************************
 * Class Name  :Concordance
 * @author     :Subhash
 * Revision log:9/1/2015
 * use         :Concordance operation on string
 *****************************************************************************************/
import java.util.*;
class Concordance {
	private static Map<Character, Set<Integer>> characterConcordance(
			final String input) {

		Map<Character, Set<Integer>> concordance = new HashMap<Character, Set<Integer>>();

		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			if (charAt == ' ') {
				continue; 
			}
			Set<Integer> set = concordance.get(charAt);
			if (set == null) {
				set = new HashSet<Integer>();
			}
			set.add(i + 1); 
			concordance.put(charAt, set);
		}

		return concordance;
	}

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.next();
		System.out.println(Concordance.characterConcordance(input));
		sc.close();

	}
}