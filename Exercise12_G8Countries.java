/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise12_G8Countries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(g8Country("France"));
		System.out.println(g8Country("Ireland"));


	}

	
	/**
	 * This method returns the capital city of an inputed G8 country
	 * @param country - Country who's capital you would like to know
	 * @return - Capital of country inputed to param country
	 */
	public static String g8Country (String country) {
		
		if (country.equalsIgnoreCase("France")) {
			return "Paris is the capital of France.";
		} else if (country.equalsIgnoreCase("Germany")) {
			return "Berlin is the capital of Germany.";
		}else if (country.equalsIgnoreCase("Italy")) {
			return "Rome is the capital of Italy.";
		} else if (country.equalsIgnoreCase("Japan")) {
			return "Tokyo is the capital of Japan.";
		}	else if (country.equalsIgnoreCase("Russia")) {
			return "Moscow is the capital of Russia.";
		}	else if (country.equalsIgnoreCase("United Kingdom")) {
			return "London is the capital of the United Kingdom.";
		}else if (country.equalsIgnoreCase("United States")) {
			return "Washington is the capital of the United States.";
		}else {
			return "Not a G8 Country.";
		}
			
	}
}
