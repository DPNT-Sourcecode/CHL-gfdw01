package befaster.solutions.CHK;

/**
 * @author acozma
 */
public class InputValidationService {

	public Boolean isValid(String input) {

		for(int i = 0; i<input.length();i++){

			char c = input.charAt(i);

			try{
				Product product = Product.valueOf(c+"");
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
}
