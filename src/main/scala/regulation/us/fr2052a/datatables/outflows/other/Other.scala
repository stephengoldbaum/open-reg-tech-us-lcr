package regulation.us.fr2052a.datatables.outflows.other

import regulation.us.fr2052a.fields._

case class Other(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  counterparty: Option[Counterparty],
  gSIB: Option[GSIB],
  maturityAmount: MaturityAmount,
  maturityBucket: MaturityBucket,
  forwardStartAmount: Option[ForwardStartAmount],
  forwardStartBucket: Option[ForwardStartBucket],
  collateralClass: Option[CollateralClass],
  collateralValue: Option[CollateralValue],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  businessLine: BusinessLine
)

sealed trait Product
case object DerivativePayables extends Product
case object CollateralCalledForDelivery extends Product
case object TBAPurchases extends Product
case object CreditFacilities extends Product
case object LiquidityFacilities extends Product
case object RetailMortgageCommitments extends Product
case object TradeFinanceInstruments extends Product
case object MTMImpactOnDerivativePositions extends Product
case object LossOfRehypothecationRightsDueToA1NotchDowngrade extends Product
case object LossOfRehypothecationRightsDueToA2NotchDowngrade extends Product
case object LossOfRehypothecationRightsDueToA3NotchDowngrade extends Product
case object LossOfRehypothecationRightsDueToAChangeInFinancialCondition extends Product
case object TotalCollateralRequiredDueToA1NotchDowngrade extends Product
case object TotalCollateralRequiredDueToA2NotchDowngrade extends Product
case object TotalCollateralRequiredDueToA3NotchDowngrade extends Product
case object TotalCollateralRequiredDueToAChangeInFinancialCondition extends Product
case object ExcessMargin extends Product
case object UnfundedTermMargin extends Product
case object InterestDividendsPayable extends Product
case object Net30DayDerivativePayables extends Product
case object OtherOutflowsRelatedToStructuredTransactions extends Product
case object OtherCashOutflows extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(DerivativePayables)
    case 2 => Some(CollateralCalledForDelivery)
    case 3 => Some(TBAPurchases)
    case 4 => Some(CreditFacilities)
    case 5 => Some(LiquidityFacilities)
    case 6 => Some(RetailMortgageCommitments)
    case 7 => Some(TradeFinanceInstruments)
    case 8 => Some(MTMImpactOnDerivativePositions)
    case 9 => Some(LossOfRehypothecationRightsDueToA1NotchDowngrade)
    case 10 => Some(LossOfRehypothecationRightsDueToA2NotchDowngrade)
    case 11 => Some(LossOfRehypothecationRightsDueToA3NotchDowngrade)
    case 12 => Some(LossOfRehypothecationRightsDueToAChangeInFinancialCondition)
    case 13 => Some(TotalCollateralRequiredDueToA1NotchDowngrade)
    case 14 => Some(TotalCollateralRequiredDueToA2NotchDowngrade)
    case 15 => Some(TotalCollateralRequiredDueToA3NotchDowngrade)
    case 16 => Some(TotalCollateralRequiredDueToAChangeInFinancialCondition)
    case 17 => Some(ExcessMargin)
    case 18 => Some(UnfundedTermMargin)
    case 19 => Some(InterestDividendsPayable)
    case 20 => Some(Net30DayDerivativePayables)
    case 21 => Some(OtherOutflowsRelatedToStructuredTransactions)
    case 22 => Some(OtherCashOutflows)
    case _ => None
  }
}
