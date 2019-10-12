package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.List;

public enum Product {
	A(50, Arrays.asList(Promotion.PROMOTION_A1,Promotion.PROMOTION_A2)),
	B(30,Arrays.asList(Promotion.PROMOTION_B)),
	C(20),
	D(15),
	E(40,SpecialPromotion.PROMOTION_E),
	F(10,SpecialPromotion.PROMOTION_F);

	private Integer price;

	private List<Promotion> promotions;
	private SpecialPromotion specialPromotion;

	Product(Integer price){
		this.price = price;
	}

	Product(Integer price,List<Promotion> promotions) {
		this(price);
		this.promotions = promotions;
	}

	Product(Integer price, SpecialPromotion specialPromotion) {
		this(price);
		this.specialPromotion = specialPromotion;
	}

	public Integer getPrice() {

		return this.price;
	}

	public List<Promotion> getPromotions() {

		return this.promotions;
	}

	public SpecialPromotion getSpecialPromotion() {
		return this.specialPromotion;
	}
}
