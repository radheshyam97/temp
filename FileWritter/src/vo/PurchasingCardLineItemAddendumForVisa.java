package vo;

public class PurchasingCardLineItemAddendumForVisa {
	public String recordType;
	public String itemDescription;
	public String productCode;
	public String itemCommodityCode;
	public String quantity;
	public String unitOfMeasure;
	public String unitCost;
	public String discountPerlineItem;
	public String VATORTaxRate;
	public String VATORTaxAmount;
	public String lineItemTotal;
	public String reserved;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getItemCommodityCode() {
		return itemCommodityCode;
	}

	public void setItemCommodityCode(String itemCommodityCode) {
		this.itemCommodityCode = itemCommodityCode;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}

	public String getDiscountPerlineItem() {
		return discountPerlineItem;
	}

	public void setDiscountPerlineItem(String discountPerlineItem) {
		this.discountPerlineItem = discountPerlineItem;
	}

	public String getVATORTaxRate() {
		return VATORTaxRate;
	}

	public void setVATORTaxRate(String vATORTaxRate) {
		VATORTaxRate = vATORTaxRate;
	}

	public String getVATORTaxAmount() {
		return VATORTaxAmount;
	}

	public void setVATORTaxAmount(String vATORTaxAmount) {
		VATORTaxAmount = vATORTaxAmount;
	}

	public String getLineItemTotal() {
		return lineItemTotal;
	}

	public void setLineItemTotal(String lineItemTotal) {
		this.lineItemTotal = lineItemTotal;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
}
