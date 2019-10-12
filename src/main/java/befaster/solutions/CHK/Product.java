package befaster.solutions.CHK;

public enum Product {
	A(50),
	B(30),
	C(20),
	D(15);

	private Integer price;

	Product(Integer price){
		this.price = price;
	}

	public Integer getPrice() {

		return this.price;
	}
}
