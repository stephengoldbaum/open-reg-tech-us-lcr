package regulation.us.lcr

import regulation.us.fr2052a.datatables.{DataTables, Inflows, Outflows, Supplemental}
import regulation.us.fr2052a.fields.MaturityBucket.FromDate
import regulation.us.lcr.Basics.Balance
import regulation.us.lcr.Inflows.{Assets, Other => InOther, Secured => InSecured, Unsecured}
import regulation.us.lcr.Outflows.{Deposits, Other => OutOther, Secured => OutSecured, Wholesale}
import regulation.us.lcr.Rules.RuleBalance
import regulation.us.lcr.Supplemental.{DerivativesCollateral, LiquidityRiskMeasurement}
import regulation.us.lcr.Aggregate

object AggregatedRuleBalances {

  // TODO Apply respective rule rates

  /** The list of all rules pertaining to inflows. */
  def applyInflowRules(fromDate: FromDate, inflows: Inflows): List[RuleBalance] =
    List.concat(
      Assets.toRuleBalances(fromDate, inflows.assets),
      Unsecured.toRuleBalances(fromDate, inflows.unsecured),
      InSecured.toRuleBalances(fromDate, inflows.secured),
      InOther.toRuleBalances(fromDate, inflows.other)
    )

  def inflow_values(fromDate: FromDate, inflows: Inflows): Balance =
    groupAndSum(applyInflowRules(fromDate, inflows))

  /** The list of all rules pertaining to outflows. */
  def applyOutflowRules(fromDate: FromDate, outflows: Outflows): List[RuleBalance] =
    List.concat(
      Deposits.toRuleBalances(fromDate, outflows.deposits),
      OutSecured.toRuleBalances(fromDate, outflows.secured),
      Wholesale.toRuleBalances(fromDate, outflows.wholesale),
      OutOther.toRuleBalances(fromDate, outflows.other)
    )

  def outflow_values(fromDate: FromDate, outflows: Outflows): Balance =
    groupAndSum(applyOutflowRules(fromDate, outflows))

  /** The list of all rules pertaining to supplementals. */
  def applySupplementalRules(supplementals: Supplemental): List[RuleBalance] =
    List.concat(
      supplementals.derivativesCollateral.flatMap(DerivativesCollateral.applyRules),
      supplementals.liquidityRiskMeasurement.flatMap(LiquidityRiskMeasurement.applyRules)
    )

  def supplemental_values(fromDate: FromDate, flows: Supplemental): Balance =
    groupAndSum(applySupplementalRules(flows))

  /** Utilities */

  def aggregateRuleBalances(ruleBalances: List[RuleBalance]): List[RuleBalance] =
    ruleBalances
      .groupBy(_.rule)
      .map { case (key, balances) =>
        RuleBalance(key, balances.map(_.amount).sum)
      }
      .toList

  def sum(ruleBalances: List[RuleBalance]): Balance =
    ruleBalances.map(_.amount).sum

  def groupAndSum(ruleBalances: List[RuleBalance]): Balance =
    sum(aggregateRuleBalances(ruleBalances))
}
