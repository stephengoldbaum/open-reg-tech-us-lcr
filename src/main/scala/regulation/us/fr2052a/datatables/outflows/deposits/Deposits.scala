package regulation.us.fr2052a.datatables.outflows.deposits

import regulation.us.fr2052a.fields._

case class Deposits(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  counterparty: Counterparty,
  gSIB: Option[GSIB],
  maturityAmount: MaturityAmount,
  maturityBucket: MaturityBucket,
  maturityOptionality: Option[MaturityOptionality],
  collateralClass: Option[CollateralClass],
  collateralValue: Option[CollateralValue],
  insured: Insured,
  trigger: Trigger,
  rehypothecated: Option[Rehypothecated],
  businessLine: BusinessLine,
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty]
)

sealed trait Product
case object TransactionalAccounts extends Product
case object NonTransactionalRelationshipAccounts extends Product
case object NonTransactionalNonRelationshipAccounts extends Product
case object OperationalAccountBalances extends Product
case object ExcessBalancesInOperationalAccounts extends Product
case object NonOperationalAccountBalances extends Product
case object OperationalEscrowAccounts extends Product
case object NonReciprocalBrokeredAccounts extends Product
case object StableAffiliatedSweepAccountBalances extends Product
case object LessStableAffiliatedSweepAccountBalances extends Product
case object NonAffiliatedSweepAccounts extends Product
case object OtherProductSweepAccounts extends Product
case object ReciprocalAccounts extends Product
case object OtherThirdPartyDeposits extends Product
case object OtherAccounts extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(TransactionalAccounts)
    case 2 => Some(NonTransactionalRelationshipAccounts)
    case 3 => Some(NonTransactionalNonRelationshipAccounts)
    case 4 => Some(OperationalAccountBalances)
    case 5 => Some(ExcessBalancesInOperationalAccounts)
    case 6 => Some(NonOperationalAccountBalances)
    case 7 => Some(OperationalEscrowAccounts)
    case 8 => Some(NonReciprocalBrokeredAccounts)
    case 9 => Some(StableAffiliatedSweepAccountBalances)
    case 10 => Some(LessStableAffiliatedSweepAccountBalances)
    case 11 => Some(NonAffiliatedSweepAccounts)
    case 12 => Some(OtherProductSweepAccounts)
    case 13 => Some(ReciprocalAccounts)
    case 14 => Some(OtherThirdPartyDeposits)
    case 15 => Some(OtherAccounts)
    case _ => None
  }
}
