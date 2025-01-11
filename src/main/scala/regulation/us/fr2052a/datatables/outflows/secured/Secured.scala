package regulation.us.fr2052a.datatables.outflows.secured

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
  forwardStartAmount: Option[ForwardStartAmount],
  forwardStartBucket: Option[ForwardStartBucket],
  collateralClass: CollateralClass,
  collateralValue: CollateralValue,
  treasuryControl: TreasuryControl,
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  businessLine: BusinessLine,
  settlement: Settlement,
  rehypothecated: Rehypothecated,
  counterparty: Counterparty,
  gSIB: Option[GSIB]
)

sealed trait Product
case object Repo extends Product
case object SecuritiesLending extends Product
case object DollarRolls extends Product
case object CollateralSwaps extends Product
case object FHLBAdvances extends Product
case object ExceptionalCentralBankOperations extends Product
case object CustomerShorts extends Product
case object FirmShorts extends Product
case object SyntheticCustomerShorts extends Product
case object SyntheticFirmFinancing extends Product
case object OtherSecuredFinancingTransactions extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(Repo)
    case 2 => Some(SecuritiesLending)
    case 3 => Some(DollarRolls)
    case 4 => Some(CollateralSwaps)
    case 5 => Some(FHLBAdvances)
    case 6 => Some(ExceptionalCentralBankOperations)
    case 7 => Some(CustomerShorts)
    case 8 => Some(FirmShorts)
    case 9 => Some(SyntheticCustomerShorts)
    case 10 => Some(SyntheticFirmFinancing)
    case 11 => Some(OtherSecuredFinancingTransactions)
    case _ => None
  }
}
