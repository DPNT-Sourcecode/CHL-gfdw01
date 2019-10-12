package befaster.solutions.CHK;

import java.util.*;
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

            List<Promotion> currentPromotions = key.getPromotions();

            if(value > 0 && currentPromotions!=null) {

                currentPromotions.sort(
                        (Promotion a, Promotion b)
                                -> b.getQuantity().compareTo(a.getQuantity())
                );

                for(Promotion promotion : currentPromotions) {

                    while(value>=promotion.getQuantity()) {
                        checkOut = checkOut + promotion.getNewPrice();

                        value = value - promotion.getQuantity();
                    }
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

        applySpecialPromotions(mappedInput);

        /*for(Promotion promotion:Promotion.values()) {

            Product freeProduct = promotion.getFreeProduct();

            if(freeProduct !=null) {

            }
        }*/

       // applyPromotionForEProduct(mappedInput);

      //  applyPromotionForFProduct(mappedInput);


        return mappedInput;
    }

    private void applySpecialPromotions(Map<Product, Integer> mappedInput) {

        for(Product product:mappedInput.keySet()) {

            SpecialPromotion specialPromotion = product.getSpecialPromotion();

            if(specialPromotion !=null){

                Integer numberOfCurrentProducts = mappedInput.get(product);
                Integer quantity = specialPromotion.getQuantity();
                Product freeProduct = Product.valueOf(specialPromotion.getFreeProduct());
                Integer appliedTimes = 0;
                while(numberOfCurrentProducts>=quantity) {

                    numberOfCurrentProducts = numberOfCurrentProducts-quantity;
                    if(freeProduct.equals(product)) {
                        numberOfCurrentProducts--;
                    }

                    if(numberOfCurrentProducts>0)
                    appliedTimes++;
                }
                Integer numberOfProductsOfTypeFreeProduct = mappedInput.get(freeProduct);

                Integer newValue = numberOfProductsOfTypeFreeProduct - appliedTimes;

                if(newValue<0) {
                    mappedInput.put(freeProduct, 0);
                } else {
                    mappedInput.put(freeProduct,newValue);
                }
            }
        }
    }

    private void applyPromotionForEProduct(Map<Product, Integer> mappedInput) {

        Integer numberOfEProducts = mappedInput.get(Product.E);
        Integer numberOfBProducts = mappedInput.get(Product.B);

        if(numberOfBProducts>0) {

            while (numberOfEProducts >=2) {
                numberOfBProducts--;
                numberOfEProducts = numberOfEProducts-2;
            }
            mappedInput.put(Product.B,numberOfBProducts);
        }
    }

    private void applyPromotionForFProduct(Map<Product, Integer> mappedInput) {
        Integer initialNumberOfFProducts = mappedInput.get(Product.F);

        Integer numberOfFProducts = initialNumberOfFProducts;

        Integer appliedTimes = 0;

        while(numberOfFProducts>=3) {
            appliedTimes++;
            numberOfFProducts = numberOfFProducts - 3;
        }
        mappedInput.put(Product.F, initialNumberOfFProducts-appliedTimes);
    }

    private Map<Product, Integer> initialiseMap() {

        Map<Product,Integer> map = new HashMap<>();

        for(Product product: Product.values()) {
            map.put(product,0);
        }

        return map;
    }


}


