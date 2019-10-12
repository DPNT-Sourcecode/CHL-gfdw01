package befaster.solutions.CHK;

public enum Promotion {

	PROMOTION_A(Product.A,3,130),

	PROMOTION_B(Product.B,2,45),

	PROMOTION_E(Product.E,2,Product.B);

	private Integer quantity;

	private Integer newPrice;

	private Product appliedProductPromotion;

	Promotion(Product appliedProductPromotion,Integer quantity,Integer newPrice) {
		this.appliedProductPromotion = appliedProductPromotion;
		this.quantity = quantity;
		this.newPrice = newPrice;
	}

	Promotion(Product appliedProductPromotion,Integer quantity, Product freeProduct) {

		this.quantity = quantity;

		this.appliedProductPromotion = appliedProductPromotion;
		
		this.newPrice = appliedProductPromotion.getPrice() * quantity + freeProduct.getPrice();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getNewPrice() {
		return newPrice;
	}
}

