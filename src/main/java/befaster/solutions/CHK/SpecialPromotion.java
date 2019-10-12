package befaster.solutions.CHK;

public enum SpecialPromotion {

	PROMOTION_E(2,Product.B),

	PROMOTION_F(2,Product.F);

	private Integer quantity;

	private Product freeProduct;

	SpecialPromotion(Integer quantity, Product freeProduct) {
		this.quantity = quantity;
		this.freeProduct = freeProduct;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Product getFreeProduct() {
		return freeProduct;
	}
}



