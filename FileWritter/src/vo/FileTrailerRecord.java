package vo;

public class FileTrailerRecord {
	public String recordType;
	public String filePurchasesCount;
	public String filePurchasesAmount;
	public String fileReturnCount;
	public String fileReturnAmount;
	public String fileTotalCount;
	public String fileNetAmount;
	public String fileNetSign;
	public String fileRecordCount;
	public String fileCreateDate;
	public String fileCreateTime;
	public String reserved;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getFilePurchasesCount() {
		return filePurchasesCount;
	}

	public void setFilePurchasesCount(String filePurchasesCount) {
		this.filePurchasesCount = filePurchasesCount;
	}

	public String getFilePurchasesAmount() {
		return filePurchasesAmount;
	}

	public void setFilePurchasesAmount(String filePurchasesAmount) {
		this.filePurchasesAmount = filePurchasesAmount;
	}

	public String getFileReturnCount() {
		return fileReturnCount;
	}

	public void setFileReturnCount(String fileReturnCount) {
		this.fileReturnCount = fileReturnCount;
	}

	public String getFileReturnAmount() {
		return fileReturnAmount;
	}

	public void setFileReturnAmount(String fileReturnAmount) {
		this.fileReturnAmount = fileReturnAmount;
	}

	public String getFileTotalCount() {
		return fileTotalCount;
	}

	public void setFileTotalCount(String fileTotalCount) {
		this.fileTotalCount = fileTotalCount;
	}

	public String getFileNetAmount() {
		return fileNetAmount;
	}

	public void setFileNetAmount(String fileNetAmount) {
		this.fileNetAmount = fileNetAmount;
	}

	public String getFileNetSign() {
		return fileNetSign;
	}

	public void setFileNetSign(String fileNetSign) {
		this.fileNetSign = fileNetSign;
	}

	public String getFileRecordCount() {
		return fileRecordCount;
	}

	public void setFileRecordCount(String fileRecordCount) {
		this.fileRecordCount = fileRecordCount;
	}

	public String getFileCreateDate() {
		return fileCreateDate;
	}

	public void setFileCreateDate(String fileCreateDate) {
		this.fileCreateDate = fileCreateDate;
	}

	public String getFileCreateTime() {
		return fileCreateTime;
	}

	public void setFileCreateTime(String fileCreateTime) {
		this.fileCreateTime = fileCreateTime;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

}
