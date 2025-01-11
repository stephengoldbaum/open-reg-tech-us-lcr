package regulation.us.fr2052a.datatables.inflows.secured

import regulation.us.fr2052a.fields._

case class Secured(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  subProduct: Option[SubProduct],
  maturityAmount: MaturityAmount,
  maturityBucket: MaturityBucket,
  maturityOptionality: Option[MaturityOptionality],
  effectiveMaturityBucket: Option[EffectiveMaturityBucket],
  encumbranceType: Option[EncumbranceType],
  forwardStartAmount: Option[ForwardStartAmount],
  forwardStartBucket: Option[ForwardStartBucket],
  collateralClass: CollateralClass,
  collateralValue: CollateralValue,
  unencumbered: Unencumbered,
  treasuryControl: TreasuryControl,
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  riskWeight: Option[RiskWeight],
  businessLine: BusinessLine,
  settlement: Settlement,
  counterparty: Counterparty,
  gSIB: Option[GSIB]
)

sealed trait Product
case object ReverseRepo extends Product
case object SecuritiesBorrowing extends Product
case object DollarRolls extends Product
case object CollateralSwaps extends Product
case object MarginLoans extends Product
case object OtherSecuredLoansRehypothecatable extends Product
case object OutstandingDrawsOnSecuredRevolvingFacilities extends Product
case object OtherSecuredLoansNonRehypothecatable extends Product
case object SyntheticCustomerLongs extends Product
case object SyntheticFirmSourcing extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(ReverseRepo)
    case 2 => Some(SecuritiesBorrowing)
    case 3 => Some(DollarRolls)
    case 4 => Some(CollateralSwaps)
    case 5 => Some(MarginLoans)
    case 6 => Some(OtherSecuredLoansRehypothecatable)
    case 7 => Some(OutstandingDrawsOnSecuredRevolvingFacilities)
    case 8 => Some(OtherSecuredLoansNonRehypothecatable)
    case 9 => Some(SyntheticCustomerLongs)
    case 10 => Some(SyntheticFirmSourcing)
    case _ => None
  }
}
