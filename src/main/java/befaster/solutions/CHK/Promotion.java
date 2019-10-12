package befaster.solutions.CHK;

public enum Promotion {

	PROMOTION_A(3,130),

	PROMOTION_B(2,45);

	private Integer quantity;

	private Integer newPrice;

	Promotion(Integer quantity,Integer newPrice) {
		this.quantity = quantity;
		this.newPrice = newPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getNewPrice() {
		return newPrice;
	}
}
