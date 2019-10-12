package befaster.solutions.CHK;

public enum SpecialPromotion {

	PROMOTION_E(2,Product.B),

	PROMOTION_F(3,Product.F);

	private Integer quantity;

	private Product freeProduct;

	SpecialPromotion(Integer quantity, Product freeProduct) {
		this.quantity = quantity;
		this.freeProduct = freeProduct;
	}
}

