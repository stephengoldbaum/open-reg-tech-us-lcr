package regulation.us.lcr

import regulation.us.fr2052a.fields.{CollateralClass, CollateralValue, MarketValue}
import regulation.us.lcr.Basics.Haircut

object HQLAAmountValues {

  case class HQLAAmountValues(
      hqla1: Double,
      hqla2a: Double,
      hqla2b: Double
  )

  def calculateHQLAAmountValues(
      collateralClass: Option[CollateralClass],
      collateralValue: Option[CollateralValue],
      marketValue: Option[MarketValue],
      haircut: Option[Haircut]
  ): HQLAAmountValues = {
    (collateralClass, collateralValue, marketValue, haircut) match {
      case (Some(cClass), Some(cValue), Some(mValue), Some(hcut)) =>
        if (CollateralClass.isHQLALevel1(cClass)) {
          HQLAAmountValues(cValue, 0, 0)
        } else if (CollateralClass.isHQLALevel2A(cClass)) {
          HQLAAmountValues(0, cValue * 0.85, 0)
        } else if (CollateralClass.isHQLALevel2B(cClass)) {
          HQLAAmountValues(0, 0, cValue * 0.5)
        } else {
          HQLAAmountValues(0, 0, 0)
        }
      case _ => HQLAAmountValues(0, 0, 0)
    }
  }
}
