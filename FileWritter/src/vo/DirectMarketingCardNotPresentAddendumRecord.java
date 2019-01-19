package vo;

public class DirectMarketingCardNotPresentAddendumRecord {
	public String recordType;
	public String PurchaseIdentifier;
	public String avsResult;
	public String installmentSequence;
	public String installmentCount;
	public String totalAuthorizedAmount;
	public String customerServiceNumber;
	public String shipDate;
	public String multiClearingSequenceNumber;
	public String multiClearingSequenceCount;
	public String multiClearingPartialReversalFlag;
	public String multiClearingPartialReversalAmount;
	public String reserved;

	public String getrecordType() {
		return recordType;
	}

	public void setrecordType(String ecordType) {
		this.recordType = ecordType;
	}

	public String getPurchaseIdentifier() {
		return PurchaseIdentifier;
	}

	public void setPurchaseIdentifier(String purchaseIdentifier) {
		PurchaseIdentifier = purchaseIdentifier;
	}

	public String getAvsResult() {
		return avsResult;
	}

	public void setAvsResult(String avsResult) {
		this.avsResult = avsResult;
	}

	public String getInstallmentSequence() {
		return installmentSequence;
	}

	public void setInstallmentSequence(String installmentSequence) {
		this.installmentSequence = installmentSequence;
	}

	public String getInstallmentCount() {
		return installmentCount;
	}

	public void setInstallmentCount(String installmentCount) {
		this.installmentCount = installmentCount;
	}

	public String getTotalAuthorizedAmount() {
		return totalAuthorizedAmount;
	}

	public void setTotalAuthorizedAmount(String totalAuthorizedAmount) {
		this.totalAuthorizedAmount = totalAuthorizedAmount;
	}

	public String getCustomerServiceNumber() {
		return customerServiceNumber;
	}

	public void setCustomerServiceNumber(String customerServiceNumber) {
		this.customerServiceNumber = customerServiceNumber;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getMultiClearingSequenceNumber() {
		return multiClearingSequenceNumber;
	}

	public void setMultiClearingSequenceNumber(String multiClearingSequenceNumber) {
		this.multiClearingSequenceNumber = multiClearingSequenceNumber;
	}

	public String getMultiClearingSequenceCount() {
		return multiClearingSequenceCount;
	}

	public void setMultiClearingSequenceCount(String multiClearingSequenceCount) {
		this.multiClearingSequenceCount = multiClearingSequenceCount;
	}

	public String getMultiClearingPartialReversalFlag() {
		return multiClearingPartialReversalFlag;
	}

	public void setMultiClearingPartialReversalFlag(String multiClearingPartialReversalFlag) {
		this.multiClearingPartialReversalFlag = multiClearingPartialReversalFlag;
	}

	public String getMultiClearingPartialReversalAmount() {
		return multiClearingPartialReversalAmount;
	}

	public void setMultiClearingPartialReversalAmount(String multiClearingPartialReversalAmount) {
		this.multiClearingPartialReversalAmount = multiClearingPartialReversalAmount;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

}
