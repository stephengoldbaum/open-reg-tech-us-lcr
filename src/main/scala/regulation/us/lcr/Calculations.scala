package regulation.us.lcr

import regulation.us.fr2052a.fields.{CollateralClass, CollateralValue, MarketValue}
import regulation.us.lcr.Basics.{Balance, Haircut, Ratio}
import regulation.us.lcr.FieldType.{FieldType, HQLA, Inflow, Outflow, Supplemental}
import regulation.us.lcr.HQLAAmountValues.{HQLAAmountValues, calculateHQLAAmountValues}
import regulation.us.lcr.Rules.{Rule, RuleBalance}
import regulation.us.lcr.Weights.{Weights, calculateWeights}

object Calculations {

  def calculateHQLAAmountValues(
      fieldType: FieldType,
      collateralClass: Option[CollateralClass],
      collateralValue: Option[CollateralValue],
      marketValue: Option[MarketValue],
      haircut: Option[Haircut]
  ): HQLAAmountValues = {
    fieldType match {
      case HQLA => calculateHQLAAmountValues(collateralClass, collateralValue, marketValue, haircut)
      case _    => HQLAAmountValues(0, 0, 0)
    }
  }

  def calculateWeights(
      fieldType: FieldType,
      rule: Rule,
      balance: Balance,
      ratio: Option[Ratio]
  ): Weights = {
    fieldType match {
      case Inflow | Outflow | Supplemental => calculateWeights(rule, balance, ratio)
      case _                               => Weights(0, 0, 0)
    }
  }

  def calculateRuleBalance(
      fieldType: FieldType,
      rule: Rule,
      balance: Balance,
      ratio: Option[Ratio]
  ): RuleBalance = {
    val weights = calculateWeights(fieldType, rule, balance, ratio)
    RuleBalance(rule, weights.weightedBalance)
  }
}
