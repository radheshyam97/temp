package formatter;

import vo.BatchTrailerRecord;
import vo.DetailRecordVO;
import vo.DirectMarketingCardNotPresentAddendumRecord;
import vo.FileTrailerRecord;
import vo.MerchantAddressAddendumRecord;
import vo.PurchasingCardAddendumRecord;
import vo.PurchasingCardFreightORShippingAddendumForVisa;
import vo.PurchasingCardLineItemAddendumForMasterCard;
import vo.PurchasingCardLineItemAddendumForVisaRecord;
import vo.PurchasingCardMasterCardPaymentGatewayAddendumRecord;

public class FileFormatter {

	private final static char SPACE = ' ';
	private final static char ZERO = '0';

	private final static int LEFT = 1;
	private final static int RIGHT = -1;

	public static String formatFileTrailerRecord(FileTrailerRecord rec) {
		StringBuilder sb = new StringBuilder();
		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getFilePurchasesCount(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getFilePurchasesAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getFileReturnCount(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getFileReturnAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getFileTotalCount(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getFileNetAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getFileNetSign(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getFileRecordCount(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getFileCreateDate(), 8, ZERO, RIGHT));
		sb.append(formatValue(rec.getFileCreateTime(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getReserved(), 122, SPACE, LEFT));

		return sb.toString();
	}

	public static String formatBatchTrailerRecord(BatchTrailerRecord rec) {
		StringBuilder sb = new StringBuilder();
		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getBatchPurchasesCount(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getBatchPurchasesAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getBatchReturnCount(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getBatchReturnAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getBatchTotalCount(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getBatchNetAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getBatchNetSign(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getBatchNumber(), 11, ZERO, RIGHT));
		sb.append(formatValue(rec.getReserved(), 131, SPACE, LEFT));
		return sb.toString();
	}

	public static String formatPurchasingCardMasterCardPaymentGatewayAddendumRecord(
			PurchasingCardMasterCardPaymentGatewayAddendumRecord rec) {

		StringBuilder sb = new StringBuilder();

		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getInvoiceNumber(), 25, SPACE, LEFT));
		sb.append(formatValue(rec.getReserved(), 172, SPACE, LEFT));

		return sb.toString();
	}

	public static String formatPurchasingCardLineItemAddendumForMasterCardRecord(
			PurchasingCardLineItemAddendumForMasterCard rec) {

		StringBuilder sb = new StringBuilder();

		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getItemDescription(), 35, SPACE, LEFT));
		sb.append(formatValue(rec.getProductCode(), 12, SPACE, LEFT));
		sb.append(formatValue(rec.getQuantity(), 5, ZERO, RIGHT));
		sb.append(formatValue(rec.getUnitOfMeasure(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getExtendedItemAmount(), 9, ZERO, RIGHT));
		sb.append(formatValue(rec.getDebitORCreditIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getNetORGrossIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getDiscountIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getDiscountAmount(), 9, ZERO, RIGHT));
		sb.append(formatValue(rec.getTaxRateApplied(), 5, SPACE, LEFT));
		sb.append(formatValue(rec.getTaxTypeApplied(), 4, SPACE, LEFT));
		sb.append(formatValue(rec.getTaxAmount(), 9, ZERO, RIGHT));
		sb.append(formatValue(rec.getAlternateTaxIdentifier(), 15, SPACE, LEFT));
		sb.append(formatValue(rec.getReserved(), 88, SPACE, LEFT));

		return sb.toString();
	}

	public static String formatPurchasingCardLineItemAddendumForVisaRecord(
			PurchasingCardLineItemAddendumForVisaRecord rec) {
		StringBuilder sb = new StringBuilder();
		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getItemDescription(), 25, SPACE, LEFT));
		sb.append(formatValue(rec.getProductCode(), 12, SPACE, LEFT));
		sb.append(formatValue(rec.getItemCommodityCode(), 12, SPACE, LEFT));
		sb.append(formatValue(rec.getQuantity(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getUnitOfMeasure(), 12, SPACE, LEFT));
		sb.append(formatValue(rec.getUnitCost(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getDiscountPerlineItem(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getVATORTaxRate(), 4, ZERO, RIGHT));
		sb.append(formatValue(rec.getVATORTaxAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getLineItemTotal(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getReserved(), 72, SPACE, LEFT));
		return sb.toString();
	}

	public static String formatPurchasingCardFreightORShippingAddendumForVisa(
			PurchasingCardFreightORShippingAddendumForVisa rec) {
		StringBuilder sb = new StringBuilder();

		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getOrderDate(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getOtherTax(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getSummaryCommodityCode(), 4, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantVATRegORSingleBusinessReferenceNumber(), 20, SPACE, LEFT));
		sb.append(formatValue(rec.getCustomerVATRegistrationNumber(), 13, SPACE, LEFT));
		sb.append(formatValue(rec.getVATORTaxAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getVATORTaxRate(), 4, ZERO, RIGHT));
		sb.append(formatValue(rec.getVATInvoiceReferenceNumbe(), 15, SPACE, LEFT));
		sb.append(formatValue(rec.getReserved(), 111, SPACE, LEFT));
		return sb.toString();
	}

	public static String formatPurchasingCardAddendumRecord(PurchasingCardAddendumRecord rec) {
		StringBuilder sb = new StringBuilder();

		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getPurchaseIdentifier(), 25, SPACE, LEFT));
		sb.append(formatValue(rec.getSalesTaxIncluded(), 1, ZERO, RIGHT));
		sb.append(formatValue(rec.getSalesTaxAmount(), 8, SPACE, LEFT));
		sb.append(formatValue(rec.getShipFromPostalORZipCode(), 10, SPACE, LEFT));
		sb.append(formatValue(rec.getDestinationPostalORZipCode(), 10, SPACE, LEFT));
		sb.append(formatValue(rec.getDestinationCountryCode(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getDiscountAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getDutyAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getFreightShippingAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getNationalAlternateTaxIncluded(), 1, ZERO, RIGHT));
		sb.append(formatValue(rec.getNationalAlternateTax(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getReserved(), 91, SPACE, LEFT));
		return sb.toString();
	}

	public static String formatDirectMarketingCardNotPresentAddendumRecord(
			DirectMarketingCardNotPresentAddendumRecord rec) {
		StringBuilder sb = new StringBuilder();
		sb.append(formatValue(rec.getrecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getPurchaseIdentifier(), 25, SPACE, LEFT));
		sb.append(formatValue(rec.getAvsResult(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getInstallmentSequence(), 2, ZERO, RIGHT));
		sb.append(formatValue(rec.getInstallmentCount(), 2, ZERO, RIGHT));
		sb.append(formatValue(rec.getTotalAuthorizedAmount(), 10, ZERO, RIGHT));
		sb.append(formatValue(rec.getCustomerServiceNumber(), 10, SPACE, LEFT));
		sb.append(formatValue(rec.getShipDate(), 8, ZERO, RIGHT));
		sb.append(formatValue(rec.getMultiClearingSequenceNumber(), 2, ZERO, RIGHT));
		sb.append(formatValue(rec.getMultiClearingSequenceCount(), 2, ZERO, RIGHT));
		sb.append(formatValue(rec.getMultiClearingPartialReversalFlag(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getMultiClearingPartialReversalAmount(), 12, ZERO, RIGHT));
		sb.append(formatValue(rec.getReserved(), 122, SPACE, LEFT));
		return sb.toString();
	}

	public static String formtMerchantAddressAddendumRecord(MerchantAddressAddendumRecord rec) {

		StringBuilder sb = new StringBuilder();

		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantDBAName(), 25, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantCity(), 13, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantState(), 2, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantPostalCode(), 9, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantCountryCode(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantStreetAddress(), 30, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantPhone(), 20, SPACE, LEFT));
		sb.append(formatValue(rec.getSubMerchantId(), 15, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantEmailAddress(), 40, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantCategoryCode(), 4, ZERO, RIGHT));
		sb.append(formatValue(rec.getSubMerchantTaxId(), 14, SPACE, LEFT));
		sb.append(formatValue(rec.getReserved(), 22, SPACE, LEFT));
		return sb.toString();
	}

	public static String formatDetailRecordVO(DetailRecordVO rec) {

		StringBuilder sb = new StringBuilder();

		sb.append(formatValue(rec.getRecordType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getTransactionCode(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getCardType(), 2, SPACE, LEFT));
		sb.append(formatValue(rec.getCardNumber(), 20, SPACE, LEFT));
		sb.append(formatValue(rec.getExpirationDate(), 4, SPACE, LEFT));
		sb.append(formatValue(rec.getSettlementAmount(), 10, ZERO, RIGHT));
		sb.append(formatValue(rec.getAuthorizationDate(), 8, ZERO, RIGHT));
		sb.append(formatValue(rec.getAuthorizationTime(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getApprovalcode(), 6, SPACE, LEFT));
		sb.append(formatValue(rec.getPosEntryMode(), 2, SPACE, LEFT));

		//
		sb.append(formatValue(rec.getAuthSourcecode(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getCardholderIDMethod(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getCardPresentIndicator(), 00, SPACE, LEFT));
		sb.append(formatValue(rec.getReferenceNumber(), 11, ZERO, RIGHT));
		sb.append(formatValue(rec.getVisaACI(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getConditionalField16(), 15, SPACE, LEFT));
		sb.append(formatValue(rec.getConditionalField17(), 4, SPACE, LEFT));
		sb.append(formatValue(rec.getMailORPhoneORElectronicCommerceIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getCardholderActivatedTerminal(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getPosCapability(), 1, SPACE, LEFT));

		//
		sb.append(formatValue(rec.getResponseCode(), 2, SPACE, LEFT));
		sb.append(formatValue(rec.getAuthorizationCurrencyType(), 3, SPACE, LEFT));
		sb.append(formatValue(rec.getOriginalAuthorizationAmount(), 10, ZERO, RIGHT));
		sb.append(formatValue(rec.getAvsResult(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getPurchaseIdentifierFormatCode(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getDebitNetworkID(), 2, SPACE, LEFT));
		sb.append(formatValue(rec.getDebitSettlementDate(), 4, SPACE, LEFT));
		sb.append(formatValue(rec.getMerchantCategoryCode(), 4, ZERO, RIGHT));
		sb.append(formatValue(rec.getItemNumber(), 4, SPACE, LEFT));
		sb.append(formatValue(rec.getMsdiIndicator(), 1, SPACE, LEFT));

		//
		sb.append(formatValue(rec.getUcafIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getSurchargeAmount(), 8, ZERO, RIGHT));
		sb.append(formatValue(rec.getWaybillNumber(), 13, ZERO, RIGHT));
		sb.append(formatValue(rec.getCardAcceptorId(), 15, SPACE, LEFT));
		sb.append(formatValue(rec.getEcsChargeType(), 4, SPACE, LEFT));
		sb.append(formatValue(rec.getConvenienceFeeAmount(), 8, SPACE, LEFT));
		sb.append(formatValue(rec.getDvv2ORCVC2ORCIDResult(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getAlpORTIC(), 2, SPACE, LEFT));
		sb.append(formatValue(rec.getServiceCode(), 3, ZERO, RIGHT));
		sb.append(formatValue(rec.getFeeProgramIndicator(), 3, SPACE, LEFT));

		//
		sb.append(formatValue(rec.getRealTimeClearingIndicator(), 1, ZERO, RIGHT));
		sb.append(formatValue(rec.getPreAuthCompletionIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getRtcAcquiringBIN(), 6, ZERO, RIGHT));
		sb.append(formatValue(rec.getDebitInterchangeIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getElavonTokenIndicator(), 1, SPACE, LEFT));
		sb.append(formatValue(rec.getSpendQualifier(), 1, SPACE, LEFT));
		return sb.toString();
	}

	public static String formatValue(String value, int lenght, char paddChar, int justifi) {

		return value;
	}
}
