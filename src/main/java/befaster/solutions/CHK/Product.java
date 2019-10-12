package befaster.solutions.CHK;

import java.util.List;

public enum Product {
	A(50,Promotion.PROMOTION_A1),
	B(30,Promotion.PROMOTION_B),
	C(20),
	D(15),
	E(40);

	private Integer price;

	private List<Promotion> promotions;

	Product(Integer price){
		this.price = price;
	}

	Product(Integer price,List<Promotion> promotions) {
		this(price);
		this.promotions = promotions;
	}

	public Integer getPrice() {

		return this.price;
	}

	public Promotion getPromotion() {

		return this.promotion;
	}
}


