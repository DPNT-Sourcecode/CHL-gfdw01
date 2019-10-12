package befaster.solutions.CHK;

public enum Promotion {

	PROMOTION_A1(3,130),

	PROMOTION_A2(5,200),

	PROMOTION_B(2,45),

	PROMOTION_E(2,Product.B),

	PROMOTION_F(2,Product.F);

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
