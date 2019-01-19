
package vo;
public class FileHeaderRecordVO {

	private String recordType;
	private String fileCreateDate;
	private String fileCreateTime;
	private String versionNumber;
	private String elavonFileNumber;
	private String sendingInstitutionName;
	private String originatingFileName;
	private String reserved;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
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

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getElavonFileNumber() {
		return elavonFileNumber;
	}

	public void setElavonFileNumber(String elavonFileNumber) {
		this.elavonFileNumber = elavonFileNumber;
	}

	public String getSendingInstitutionName() {
		return sendingInstitutionName;
	}

	public void setSendingInstitutionName(String sendingInstitutionName) {
		this.sendingInstitutionName = sendingInstitutionName;
	}

	public String getOriginatingFileName() {
		return originatingFileName;
	}

	public void setOriginatingFileName(String originatingFileName) {
		this.originatingFileName = originatingFileName;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

}
