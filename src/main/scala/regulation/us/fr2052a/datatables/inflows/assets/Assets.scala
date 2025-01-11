package regulation.us.fr2052a.datatables.inflows.assets

import regulation.us.fr2052a.fields._

case class Assets(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  subProduct: Option[SubProduct],
  marketValue: MarketValue,
  lendableValue: LendableValue,
  maturityBucket: MaturityBucket,
  forwardStartAmount: Option[ForwardStartAmount],
  forwardStartBucket: Option[ForwardStartBucket],
  collateralClass: CollateralClass,
  treasuryControl: TreasuryControl,
  accountingDesignation: AccountingDesignation,
  effectiveMaturityBucket: Option[EffectiveMaturityBucket],
  encumbranceType: Option[EncumbranceType],
  internalCounterparty: Option[InternalCounterparty],
  businessLine: BusinessLine
)

sealed trait Product
case object UnencumberedAssets extends Product
case object Capacity extends Product
case object UnrestrictedReserveBalances extends Product
case object RestrictedReserveBalances extends Product
case object UnsettledAssetPurchases extends Product
case object ForwardAssetPurchases extends Product
case object EncumberedAssets extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(UnencumberedAssets)
    case 2 => Some(Capacity)
    case 3 => Some(UnrestrictedReserveBalances)
    case 4 => Some(RestrictedReserveBalances)
    case 5 => Some(UnsettledAssetPurchases)
    case 6 => Some(ForwardAssetPurchases)
    case 7 => Some(EncumberedAssets)
    case _ => None
  }
}
