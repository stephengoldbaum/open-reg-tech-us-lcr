package regulation.us.fr2052a.datatables.supplemental.liquidityriskmeasurement

import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.Converted
import regulation.us.fr2052a.fields.Currency
import regulation.us.fr2052a.fields.Internal
import regulation.us.fr2052a.fields.InternalCounterparty
import regulation.us.fr2052a.fields.MarketValue
import regulation.us.fr2052a.fields.ReportingEntity

case class LiquidityRiskMeasurement(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  marketValue: MarketValue,
  collateralClass: Option[CollateralClass],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty]
)

sealed trait Product
case object SubsidiaryLiquidityThatCannotBeTransferred extends Product
case object SubsidiaryLiquidityAvailableForTransfer extends Product
case object UnencumberedAssetHedgesEarlyTerminationOutflows extends Product
case object NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker extends Product
case object StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker extends Product
case object LiquidityCoverageRatio extends Product
case object SubsidiaryFundingThatCannotBeTransferred extends Product
case object SubsidiaryFundingAvailableForTransfer extends Product
case object AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets extends Product
case object NetStableFundingRatio extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(SubsidiaryLiquidityThatCannotBeTransferred)
    case 2 => Some(SubsidiaryLiquidityAvailableForTransfer)
    case 3 => Some(UnencumberedAssetHedgesEarlyTerminationOutflows)
    case 4 => Some(NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker)
    case 5 => Some(StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker)
    case 6 => Some(LiquidityCoverageRatio)
    case 7 => Some(SubsidiaryFundingThatCannotBeTransferred)
    case 8 => Some(SubsidiaryFundingAvailableForTransfer)
    case 9 => Some(AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets)
    case 10 => Some(NetStableFundingRatio)
    case _ => None
  }
}
