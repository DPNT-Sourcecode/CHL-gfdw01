package befaster.solutions.CHK;

public enum Product {
	A(50,Promotion.PROMOTION_A),
	B(30,Promotion.PROMOTION_B),
	C(20),
	D(15),
	E(40);

	private Integer price;

	private Promotion promotion;

	Product(Integer price){
		this.price = price;
	}

	Product(Integer price,Promotion promotion) {
		this(price);
		this.promotion = promotion;
	}

	public Integer getPrice() {

		return this.price;
	}

	public Promotion getPromotion() {

		return this.promotion;
	}
}
