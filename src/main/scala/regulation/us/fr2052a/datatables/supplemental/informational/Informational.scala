package regulation.us.fr2052a.datatables.supplemental.informational

import regulation.us.fr2052a.fields.BusinessLine
import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.Converted
import regulation.us.fr2052a.fields.Currency
import regulation.us.fr2052a.fields.Internal
import regulation.us.fr2052a.fields.InternalCounterparty
import regulation.us.fr2052a.fields.MarketValue
import regulation.us.fr2052a.fields.ReportingEntity

case class Informational(
  currency: Currency,
  converted: Converted,
  reportingEntity: ReportingEntity,
  product: Product,
  marketValue: MarketValue,
  collateralClass: Option[CollateralClass],
  internal: Internal,
  internalCounterparty: Option[InternalCounterparty],
  businessLine: BusinessLine
)

sealed trait Product
case object LongMarketValueClientAssets extends Product
case object ShortMarketValueClientAssets extends Product
case object GrossClientWiresReceived extends Product
case object GrossClientWiresPaid extends Product
case object FRB23ACapacity extends Product
case object SubsidiaryLiquidityNotTransferrable extends Product

object Product {
  def fromID(id: Int): Option[Product] = id match {
    case 1 => Some(LongMarketValueClientAssets)
    case 2 => Some(ShortMarketValueClientAssets)
    case 3 => Some(GrossClientWiresReceived)
    case 4 => Some(GrossClientWiresPaid)
    case 5 => Some(FRB23ACapacity)
    case 6 => Some(SubsidiaryLiquidityNotTransferrable)
    case _ => None
  }
}
