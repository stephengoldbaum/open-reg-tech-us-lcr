package regulation.us.fr2052a.datatables.supplemental.foreignexchange

import regulation.us.fr2052a.fields.BusinessLine
import regulation.us.fr2052a.fields.Converted
import regulation.us.fr2052a.fields.Counterparty
import regulation.us.fr2052a.fields.Currency
import regulation.us.fr2052a.fields.ForeignExchangeOptionDirection
import regulation.us.fr2052a.fields.ForwardStartAmountCurrency1
import regulation.us.fr2052a.fields.ForwardStartAmountCurrency2
import regulation.us.fr2052a.fields.ForwardStartBucket
import regulation.us.fr2052a.fields.GSIB
import regulation.us.fr2052a.fields.Internal
import regulation.us.fr2052a.fields.InternalCounterparty
import regulation.us.fr2052a.fields.MaturityAmountCurrency1
import regulation.us.fr2052a.fields.MaturityAmountCurrency2
import regulation.us.fr2052a.fields.MaturityBucket
import regulation.us.fr2052a.fields.ReportingEntity
import regulation.us.fr2052a.fields.Settlement

case class ForeignExchange(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  maturityAmountCurrency1: MaturityAmountCurrency1,
  maturityAmountCurrency2: MaturityAmountCurrency2,
  maturityBucket: MaturityBucket,
  foreignExchangeOptionDirection: Option[ForeignExchangeOptionDirection],
  forwardStartAmountCurrency1: Option[ForwardStartAmountCurrency1],
  forwardStartAmountCurrency2: Option[ForwardStartAmountCurrency2],
  forwardStartBucket: Option[ForwardStartBucket],
  counterparty: Counterparty,
  gSIB: Option[GSIB],
  settlement: Settlement,
  businessLine: BusinessLine,
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty]
)

sealed trait Product
case object Spot extends Product
case object ForwardsAndFutures extends Product
case object Swaps extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(Spot)
    case 2 => Some(ForwardsAndFutures)
    case 3 => Some(Swaps)
    case _ => None
  }
}
