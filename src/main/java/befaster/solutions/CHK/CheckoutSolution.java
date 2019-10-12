package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    public Integer checkout(String skus) {

        InputValidationService validationService = new InputValidationService();

        if(skus == null || skus.isEmpty()) {
            return 0;
        }

        if(!validationService.isValid(skus)) {
            return -1;
        }

        Map<Product,Integer> mappedInput = computeInputMap(skus);

        return computeCheckOut(mappedInput);
    }

    private Integer computeCheckOut(Map<Product, Integer> mappedInput) {

        Integer checkOut = 0;

        for(Map.Entry<Product,Integer> entry : mappedInput.entrySet()) {

            Product key = entry.getKey();

            Integer value = entry.getValue();

            Promotion currentPromotion = key.getPromotion();

            if(currentPromotion!=null) {

                while(value >= currentPromotion.getQuantity()){

                    checkOut = checkOut + currentPromotion.getNewPrice();

                    value = value - currentPromotion.getQuantity();
                }
            }

            checkOut = checkOut + key.getPrice() * value;
        }
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

        Integer numberOfEProducts = mappedInput.get("E");
        mappedInput.get(B)


        return mappedInput;
    }


}

