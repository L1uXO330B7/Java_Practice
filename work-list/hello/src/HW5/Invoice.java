package HW5;


public class Invoice extends Object implements Payable {

	private String partNumber;
	private String partDiscription;
	private double pricePerItem;
	private int quantity;

	public Invoice(String partNumber, String partDiscription, double pricePerItem, int quantity) {
		super();
		setPartNumber(partNumber);
		setPartDiscription(partDiscription);
		setPricePerItem(pricePerItem);
		setQuantity(quantity);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		if (partNumber.equals("")) {
			throw new IllegalArgumentException("輸入錯誤! 貨物編號、貨物描述不可以是完字串!!請重新輸入..");
		}
		this.partNumber = partNumber;

	}

	public String getPartDiscription() {
		return partDiscription;
	}

	public void setPartDiscription(String partDiscription) {
		if (partDiscription.equals("")) {
			throw new IllegalArgumentException("輸入錯誤! 貨物編號、貨物描述不可以是完字串!!請重新輸入..");
		}
		this.partDiscription = partDiscription;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem < 0.0) {
			throw new IllegalArgumentException("輸入錯誤! 貨物單價必須>=0 ");
		}
		this.pricePerItem = pricePerItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("輸入錯誤! 貨物數量必須>0 ");
		}
		this.quantity = quantity;
	}

	public double getPaymentAmount() {
		return (getPricePerItem() * getQuantity());
	}

	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %s%n%s: %.2f%n%s: %2d%n%s: %.2f%n", "貨物編號", getPartNumber(), "貨物描述",
				getPartDiscription(), "貨物單價", getPricePerItem(), "貨物數量", getQuantity(), "總金額", getPaymentAmount());
	}


}
