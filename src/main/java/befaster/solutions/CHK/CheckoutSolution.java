package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<Product,Integer> mappedInput = initialiseMap();

        for(int i=0;i<skus.length();i++){

            Product key = Product.valueOf(skus.charAt(i) + "");

            Integer currentNumberOfProducts = mappedInput.get(key);

            mappedInput.put(key,++currentNumberOfProducts);

        }

        /*for(Promotion promotion:Promotion.values()) {

            Product freeProduct = promotion.getFreeProduct();

            if(freeProduct !=null) {

            }
        }*/

        Integer numberOfEProducts = mappedInput.get(Product.E);
        Integer numberOfBProducts = mappedInput.get(Product.B);

        if(numberOfBProducts!=null && numberOfBProducts>0) {

            while (numberOfEProducts >=2) {
                numberOfBProducts--;
                numberOfEProducts = numberOfEProducts-2;
            }
            mappedInput.put(Product.B,numberOfBProducts);
        }


        return mappedInput;
    }

    private Map<Product, Integer> initialiseMap() {

        Map<Product,Integer> map = new HashMap<>();

        for(Product product: Product.values()) {
            map.put(product,0);
        }

        return map;
    }


}






