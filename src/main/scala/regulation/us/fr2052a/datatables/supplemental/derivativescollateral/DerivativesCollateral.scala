package regulation.us.fr2052a.datatables.supplemental.derivativescollateral

import regulation.us.fr2052a.fields.BusinessLine
import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.CollateralLevel
import regulation.us.fr2052a.fields.Converted
import regulation.us.fr2052a.fields.Counterparty
import regulation.us.fr2052a.fields.Currency
import regulation.us.fr2052a.fields.EffectiveMaturityBucket
import regulation.us.fr2052a.fields.EncumbranceType
import regulation.us.fr2052a.fields.GSIB
import regulation.us.fr2052a.fields.Internal
import regulation.us.fr2052a.fields.InternalCounterparty
import regulation.us.fr2052a.fields.MarketValue
import regulation.us.fr2052a.fields.NettingEligible
import regulation.us.fr2052a.fields.ReportingEntity
import regulation.us.fr2052a.fields.SubProduct
import regulation.us.fr2052a.fields.SubProduct2
import regulation.us.fr2052a.fields.TreasuryControl

case class DerivativesCollateral(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  subProduct: Option[SubProduct],
  subProduct2: Option[SubProduct2],
  marketValue: MarketValue,
  collateralClass: Option[CollateralClass],
  collateralLevel: Option[CollateralLevel],
  counterparty: Option[Counterparty],
  gSIB: Option[GSIB],
  effectiveMaturityBucket: Option[EffectiveMaturityBucket],
  encumbranceType: Option[EncumbranceType],
  nettingEligible: Option[NettingEligible],
  treasuryControl: Option[TreasuryControl],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  businessLine: BusinessLine
)

sealed trait Product
case object GrossDerivativeAssetValues extends Product
case object GrossDerivativeLiabilityValues extends Product
case object DerivativeSettlementPaymentsDelivered extends Product
case object DerivativeSettlementPaymentsReceived extends Product
case object InitialMarginPostedHouse extends Product
case object InitialMarginPostedCustomer extends Product
case object InitialMarginReceived extends Product
case object VariationMarginPostedHouse extends Product
case object VariationMarginPostedCustomer extends Product
case object VariationMarginReceived extends Product
case object DerivativeCCPDefaultFundContribution extends Product
case object OtherCCPPledgesAndContributions extends Product
case object CollateralDisputesDeliverables extends Product
case object CollateralDisputesReceivables extends Product
case object SleeperCollateralDeliverables extends Product
case object RequiredCollateralDeliverables extends Product
case object SleeperCollateralReceivables extends Product
case object DerivativeCollateralSubstitutionRisk extends Product
case object DerivativeCollateralSubstitutionCapacity extends Product
case object OtherCollateralSubstitutionRisk extends Product
case object OtherCollateralSubstitutionCapacity extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(GrossDerivativeAssetValues)
    case 2 => Some(GrossDerivativeLiabilityValues)
    case 3 => Some(DerivativeSettlementPaymentsDelivered)
    case 4 => Some(DerivativeSettlementPaymentsReceived)
    case 5 => Some(InitialMarginPostedHouse)
    case 6 => Some(InitialMarginPostedCustomer)
    case 7 => Some(InitialMarginReceived)
    case 8 => Some(VariationMarginPostedHouse)
    case 9 => Some(VariationMarginPostedCustomer)
    case 10 => Some(VariationMarginReceived)
    case 11 => Some(DerivativeCCPDefaultFundContribution)
    case 12 => Some(OtherCCPPledgesAndContributions)
    case 13 => Some(CollateralDisputesDeliverables)
    case 14 => Some(CollateralDisputesReceivables)
    case 15 => Some(SleeperCollateralDeliverables)
    case 16 => Some(RequiredCollateralDeliverables)
    case 17 => Some(SleeperCollateralReceivables)
    case 18 => Some(DerivativeCollateralSubstitutionRisk)
    case 19 => Some(DerivativeCollateralSubstitutionCapacity)
    case 20 => Some(OtherCollateralSubstitutionRisk)
    case 21 => Some(OtherCollateralSubstitutionCapacity)
    case _ => None
  }
}
