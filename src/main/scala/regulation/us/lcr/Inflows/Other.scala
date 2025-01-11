package regulation.us.lcr.Inflows

import regulation.us.fr2052a.datatables.inflows.other.Other
import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.MaturityBucket
import regulation.us.lcr.Rules.RuleBalance

object Other {

  def toRuleBalances(fromDate: MaturityBucket.FromDate, otherList: List[Other]): List[RuleBalance] = {
    otherList
      .flatMap { flow =>
        rule_33_b(flow)
          .orElse(rule_111_x_33_e(fromDate, flow))
          .orElse(rule_112_x_33_e(fromDate, flow))
          .orElse(rule_33_g(fromDate, flow))
          .orElse(rule_33_h(fromDate, flow))
          .toList
      }
  }

  def rule_33_b(flow: Other): Option[RuleBalance] = {
    if (List(flow.product).contains(Other.i_O_7)) {
      Some(RuleBalance("33(b)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_111_x_33_e(fromDate: MaturityBucket.FromDate, flow: Other): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Other.i_O_6) ||
      List(flow.product).contains(Other.i_O_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.maturityBucket != MaturityBucket.Open &&
      flow.collateralClass.exists(class => !CollateralClass.isHQLA(class)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(e)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_112_x_33_e(fromDate: MaturityBucket.FromDate, flow: Other): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Other.i_O_6) ||
      List(flow.product).contains(Other.i_O_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.maturityBucket != MaturityBucket.Open &&
      flow.collateralClass.exists(CollateralClass.isHQLA) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      !flow.treasuryControl
    ) {
      Some(RuleBalance("33(3)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_33_g(fromDate: MaturityBucket.FromDate, flow: Other): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Other.i_O_5) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket)
    ) {
      Some(RuleBalance("33(g)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_33_h(fromDate: MaturityBucket.FromDate, flow: Other): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Other.i_O_9) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.maturityBucket != MaturityBucket.Open &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(h)", flow.maturityAmount))
    } else {
      None
    }
  }
}
