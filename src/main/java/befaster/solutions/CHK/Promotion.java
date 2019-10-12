package befaster.solutions.CHK;

public enum Promotion {

	PROMOTION_A1(3,130),

	PROMOTION_A2(5,200),

	PROMOTION_B(2,45),

	PROMOTION_H1(5,45),

	PROMOTION_H2(10,80),

	PROMOTION_K1(2,150),

	PROMOTION_P1(5,200),

	PROMOTION_Q1(3,80),

	PROMOTION_V1(2,90),

	PROMOTION_V2(3,130);

	private Integer quantity;

	private Integer newPrice;

	private Product freeProduct;

	Promotion(Integer quantity,Integer newPrice) {

		this.quantity = quantity;
		this.newPrice = newPrice;
	}

	Promotion(Integer quantity, Product freeProduct) {

		this.quantity = quantity;

		this.freeProduct = freeProduct;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getNewPrice() {
		return newPrice;
	}

	public Product getFreeProduct() {return freeProduct;}
}

