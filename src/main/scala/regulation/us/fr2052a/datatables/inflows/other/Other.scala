package regulation.us.fr2052a.datatables.inflows.other

import regulation.us.fr2052a.fields._

case class Other(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  maturityAmount: MaturityAmount,
  maturityBucket: MaturityBucket,
  forwardStartAmount: Option[ForwardStartAmount],
  forwardStartBucket: Option[ForwardStartBucket],
  collateralClass: Option[CollateralClass],
  collateralValue: Option[CollateralValue],
  treasuryControl: TreasuryControl,
  counterparty: Option[Counterparty],
  gSIB: Option[GSIB],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  businessLine: BusinessLine
)

sealed trait Product
case object DerivativeReceivables extends Product
case object CollateralCalledForReceipt extends Product
case object TBASales extends Product
case object UndrawnCommittedFacilitiesPurchased extends Product
case object LockUpBalance extends Product
case object InterestAndDividendsReceivable extends Product
case object Net30DayDerivativeReceivables extends Product
case object PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities extends Product
case object OtherCashInflows extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(DerivativeReceivables)
    case 2 => Some(CollateralCalledForReceipt)
    case 3 => Some(TBASales)
    case 4 => Some(UndrawnCommittedFacilitiesPurchased)
    case 5 => Some(LockUpBalance)
    case 6 => Some(InterestAndDividendsReceivable)
    case 7 => Some(Net30DayDerivativeReceivables)
    case 8 => Some(PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities)
    case 9 => Some(OtherCashInflows)
    case _ => None
  }
}
