package befaster.solutions.CHK;

public enum SpecialPromotion {

	PROMOTION_E(2,"B"),

	PROMOTION_F(2,"F");

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
