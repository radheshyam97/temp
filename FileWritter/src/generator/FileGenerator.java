package generator;

import java.util.Formatter;

import vo.FileHeaderRecordVO;

public class FileGenerator {
	public void writeFileHeaderRecord(StringBuilder record, FileHeaderRecordVO fileHeaderRecordVO) {

	}

	private void writeAlphaNumeric(String value, char fillChar, int length) {
 	}

	private void writeNumeric(String value, char fillChar) {
	}
	
	public static String padLeftSpaces(String str, int n) {
		return String.format("%1$" + n + "s", str);
	}

}
