package regulation.us.fr2052a.datatables.supplemental.balancesheet

import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.CollateralValue
import regulation.us.fr2052a.fields.CollectionReference
import regulation.us.fr2052a.fields.Converted
import regulation.us.fr2052a.fields.Counterparty
import regulation.us.fr2052a.fields.Currency
import regulation.us.fr2052a.fields.EffectiveMaturityBucket
import regulation.us.fr2052a.fields.EncumbranceType
import regulation.us.fr2052a.fields.GSIB
import regulation.us.fr2052a.fields.Internal
import regulation.us.fr2052a.fields.InternalCounterparty
import regulation.us.fr2052a.fields.MarketValue
import regulation.us.fr2052a.fields.MaturityAmount
import regulation.us.fr2052a.fields.MaturityBucket
import regulation.us.fr2052a.fields.ProductReference
import regulation.us.fr2052a.fields.ReportingEntity
import regulation.us.fr2052a.fields.RiskWeight
import regulation.us.fr2052a.fields.SubProductReference

case class BalanceSheet(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  collectionReference: Option[CollectionReference],
  product: Product,
  productReference: Option[ProductReference],
  subProductReference: Option[SubProductReference],
  collateralClass: Option[CollateralClass],
  maturityBucket: MaturityBucket,
  effectiveMaturityBucket: Option[EffectiveMaturityBucket],
  encumbranceType: Option[EncumbranceType],
  marketValue: Option[MarketValue],
  maturityAmount: Option[MaturityAmount],
  collateralValue: Option[CollateralValue],
  counterparty: Option[Counterparty],
  gSIB: Option[GSIB],
  riskWeight: Option[RiskWeight],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty]
)

sealed trait Product
case object RegulatoryCapitalElement extends Product
case object OtherLiabilities extends Product
case object NonPerformingAssets extends Product
case object OtherAssets extends Product
case object CounterpartyNetting extends Product
case object CarryingValueAdjustment extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(RegulatoryCapitalElement)
    case 2 => Some(OtherLiabilities)
    case 3 => Some(NonPerformingAssets)
    case 4 => Some(OtherAssets)
    case 5 => Some(CounterpartyNetting)
    case 6 => Some(CarryingValueAdjustment)
    case _ => None
  }
}
