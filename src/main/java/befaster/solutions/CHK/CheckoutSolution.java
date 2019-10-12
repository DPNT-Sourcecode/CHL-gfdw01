package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    private InputValidationService validationService;

    public Integer checkout(String skus) {

        Integer checkOut = 0;

        validationService = new InputValidationService();

        if(skus == null || skus.isEmpty()) {
            return 0;
        }

        if(!validationService.isValid(skus)) {
            return -1;
        }

        Map<Product,Integer> mappedInput = computeInputMap(skus);


        return checkOut;
    }

    private Map<Product,Integer> computeInputMap(String skus) {

        Map<Product,Integer> mappedInput = new HashMap<>();

        for(int i=0;i<skus.length();i++){

            Product key = Product.valueOf(skus.charAt(i) + "");

            mappedInput.putIfAbsent(key,0);

            Integer currentNumberOfProducts = mappedInput.get(key);

            mappedInput.put(key,++currentNumberOfProducts);

        }

        return mappedInput;
    }


}


