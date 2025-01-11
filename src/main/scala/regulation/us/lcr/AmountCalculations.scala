package regulation.us.lcr

import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.CollateralValue
import regulation.us.fr2052a.fields.MarketValue

object AmountCalculations {

  /** For the purpose of all tables mapped to commitment outflow amounts in section .32(e), the Collateral Value field
    * should be used to identify the amount of Level 1 or Level 2A HQLA securing the commitment exposure in accordance with
    * sections .32(e)(2) and (3).
    */
  def note_4(maybeCollateralClass: Option[CollateralClass], maybeCollateralValue: Option[CollateralValue], amount: Double): Double =
    (maybeCollateralClass, maybeCollateralValue) match {
      case (Some(collateralClass), Some(collateralValue)) => applyNote4(collateralClass, collateralValue, amount)
      case _ => amount
    }

  def applyNote4(collateralClass: CollateralClass, collateralValue: CollateralValue, amount: Double): Double =
    if (collateralClass == CollateralClass.g_2_Q) {
      amount - (collateralValue * 0.85)
    } else if (collateralClass == CollateralClass.s_1_Q) {
      amount - collateralValue
    } else {
      amount
    }

  /** To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral
    * Value amount as unsecured wholesale lending under .33(d)
    */
  def excludeUnsecuredWholesaleLending(amount: Double, collateralValue: CollateralValue): Double =
    Math.min(amount, collateralValue)

  /** To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral
    * Value amount as unsecured wholesale lending under .33(d)
    */
  def unsecuredWholesaleLending(amount: Double, collateralValue: CollateralValue): Double =
    if (amount > collateralValue) {
      amount - collateralValue
    } else {
      0
    }
}
