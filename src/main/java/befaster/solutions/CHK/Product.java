package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.List;

public enum Product {
	A(50, Arrays.asList(Promotion.PROMOTION_A1,Promotion.PROMOTION_A2)),
	B(30,Arrays.asList(Promotion.PROMOTION_B)),
	C(20),
	D(15),
	E(40,SpecialPromotion.PROMOTION_E),
	F(10,SpecialPromotion.PROMOTION_F),
	G(20),
	H(10,Arrays.asList(Promotion.PROMOTION_H1,Promotion.PROMOTION_H2)),
	I(35),
	J(60),
	K(80,Arrays.asList(Promotion.PROMOTION_K1)),
	L(90),
	M(15),
	N(40),
	O(10),
	P(50,Arrays.asList(Promotion.PROMOTION_P1)),
	Q(30,Arrays.asList(Promotion.PROMOTION_Q1)),
	R(50,SpecialPromotion.PROMOTION_R),
	S(30),
	T(20),
	U(40,SpecialPromotion.PROMOTION_U),
	V(50,Arrays.asList(Promotion.PROMOTION_V1,Promotion.PROMOTION_V2)),
	W(20),
	X(90),
	Y(10),
	Z(50);

	private Integer price;

	private List<Promotion> promotions;
	private SpecialPromotion specialPromotion;

	Product(Integer price){
		this.price = price;
	}

	Product(Integer price,List<Promotion> promotions) {
		this(price);
		this.promotions = promotions;
	}

	Product(Integer price, SpecialPromotion specialPromotion) {
		this(price);
		this.specialPromotion = specialPromotion;
	}

	public Integer getPrice() {

		return this.price;
	}

	public List<Promotion> getPromotions() {

		return this.promotions;
	}

	public SpecialPromotion getSpecialPromotion() {
		return this.specialPromotion;
	}
}

