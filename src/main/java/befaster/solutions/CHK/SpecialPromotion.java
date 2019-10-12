package befaster.solutions.CHK;

public enum SpecialPromotion {

	PROMOTION_E(2,"B"),

	PROMOTION_F(2,"F"),

	PROMOTION_N(3,"M"),

	PROMOTION_R(3,"Q"),

	PROMOTION_U(3,"U");

	private Integer quantity;

	private String freeProduct;

	SpecialPromotion(Integer quantity, String freeProduct) {
		this.quantity = quantity;
		this.freeProduct = freeProduct;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public String getFreeProduct() {
		return freeProduct;
	}
}

