package regulation.us.fr2052a.datatables.inflows.unsecured

import regulation.us.fr2052a.fields._

case class Unsecured(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  counterparty: Option[Counterparty],
  gSIB: Option[GSIB],
  maturityAmount: MaturityAmount,
  maturityBucket: MaturityBucket,
  maturityOptionality: Option[MaturityOptionality],
  effectiveMaturityBucket: Option[EffectiveMaturityBucket],
  encumbranceType: Option[EncumbranceType],
  forwardStartAmount: Option[ForwardStartAmount],
  forwardStartBucket: Option[ForwardStartBucket],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  riskWeight: Option[RiskWeight],
  businessLine: BusinessLine
)

sealed trait Product
case object OnshorePlacements extends Product
case object OffshorePlacements extends Product
case object RequiredOperationalBalances extends Product
case object ExcessOperationalBalances extends Product
case object OutstandingDrawsOnUnsecuredRevolvingFacilities extends Product
case object OtherLoans extends Product
case object CashItemsInTheProcessOfCollection extends Product
case object ShortTermInvestments extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(OnshorePlacements)
    case 2 => Some(OffshorePlacements)
    case 3 => Some(RequiredOperationalBalances)
    case 4 => Some(ExcessOperationalBalances)
    case 5 => Some(OutstandingDrawsOnUnsecuredRevolvingFacilities)
    case 6 => Some(OtherLoans)
    case 7 => Some(CashItemsInTheProcessOfCollection)
    case 8 => Some(ShortTermInvestments)
    case _ => None
  }
}
