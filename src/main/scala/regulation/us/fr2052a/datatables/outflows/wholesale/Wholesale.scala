package regulation.us.fr2052a.datatables.outflows.wholesale

import regulation.us.fr2052a.fields._

case class Wholesale(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  counterparty: Option[Counterparty],
  gSIB: Option[GSIB],
  maturityAmount: MaturityAmount,
  maturityBucket: MaturityBucket,
  maturityOptionality: Option[MaturityOptionality],
  collateralClass: Option[CollateralClass],
  collateralValue: Option[CollateralValue],
  forwardStartAmount: Option[ForwardStartAmount],
  forwardStartBucket: Option[ForwardStartBucket],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  lossAbsorbency: Option[LossAbsorbency],
  businessLine: BusinessLine
)

sealed trait Product
case object AssetBackedCommercialPaperSingleSeller extends Product
case object AssetBackedCommercialPaperMultiSeller extends Product
case object CollateralizedCommercialPaper extends Product
case object AssetBackedSecurities extends Product
case object CoveredBonds extends Product
case object TenderOptionBonds extends Product
case object OtherAssetBackedFinancing extends Product
case object CommercialPaper extends Product
case object OnshoreBorrowing extends Product
case object OffshoreBorrowing extends Product
case object UnstructuredLongTermDebt extends Product
case object StructuredLongTermDebt extends Product
case object GovernmentSupportedDebt extends Product
case object UnsecuredNotes extends Product
case object StructuredNotes extends Product
case object WholesaleCDs extends Product
case object DrawsOnCommittedLines extends Product
case object FreeCredits extends Product
case object OtherUnsecuredFinancing extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(AssetBackedCommercialPaperSingleSeller)
    case 2 => Some(AssetBackedCommercialPaperMultiSeller)
    case 3 => Some(CollateralizedCommercialPaper)
    case 4 => Some(AssetBackedSecurities)
    case 5 => Some(CoveredBonds)
    case 6 => Some(TenderOptionBonds)
    case 7 => Some(OtherAssetBackedFinancing)
    case 8 => Some(CommercialPaper)
    case 9 => Some(OnshoreBorrowing)
    case 10 => Some(OffshoreBorrowing)
    case 11 => Some(UnstructuredLongTermDebt)
    case 12 => Some(StructuredLongTermDebt)
    case 13 => Some(GovernmentSupportedDebt)
    case 14 => Some(UnsecuredNotes)
    case 15 => Some(StructuredNotes)
    case 16 => Some(WholesaleCDs)
    case 17 => Some(DrawsOnCommittedLines)
    case 18 => Some(FreeCredits)
    case 19 => Some(OtherUnsecuredFinancing)
    case _ => None
  }
}
