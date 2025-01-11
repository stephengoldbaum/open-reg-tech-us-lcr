package regulation.us.lcr.Inflows

import regulation.us.fr2052a.datatables.inflows.assets.Assets
import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.MaturityBucket
import regulation.us.fr2052a.fields.SubProduct
import regulation.us.lcr.Rules.RuleBalance

object Assets {

  def toRuleBalances(fromDate: MaturityBucket.FromDate, assetsList: List[Assets]): List[RuleBalance] = {
    assetsList
      .map { asset =>
        val rule = if (rule_1_section_20_a_1_C(asset).isDefined) {
          "20(a)(1)-C"
        } else if (rule_1_section_20_a_1(asset).isDefined) {
          "20(a)(1)"
        } else if (rule_1_section_20_b_1(asset).isDefined) {
          "20(b)(1)"
        } else if (rule_1_section_20_c_1(asset).isDefined) {
          "20(c)(1)"
        } else if (rule_107_section_33_d_1(fromDate, asset).isDefined) {
          "33(d)(1)"
        } else {
          ""
        }

        RuleBalance(rule, asset.marketValue)
      }
      .filter(_.rule.nonEmpty)
  }

  def rule_1_section_20_a_1_C(flow: Assets): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Assets.i_A_3) &&
      flow.subProduct != Some(SubProduct.currency_and_coin) &&
      MaturityBucket.isOpen(flow.maturityBucket) &&
      CollateralClass.isCash(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.encumbranceType.isEmpty &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(a)(1)-C", flow.marketValue))
    } else {
      None
    }
  }

  def rule_1_section_20_a_1(flow: Assets): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Assets.i_A_1) ||
      List(flow.product).contains(Assets.i_A_2) &&
      flow.subProduct != Some(SubProduct.currency_and_coin) &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      !CollateralClass.isCash(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.encumbranceType.isEmpty &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(a)(1)", flow.marketValue))
    } else {
      None
    }
  }

  def rule_1_section_20_b_1(flow: Assets): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Assets.i_A_1) ||
      List(flow.product).contains(Assets.i_A_2) &&
      flow.subProduct != Some(SubProduct.currency_and_coin) &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.encumbranceType.isEmpty &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(b)(1)", flow.marketValue))
    } else {
      None
    }
  }

  def rule_1_section_20_c_1(flow: Assets): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Assets.i_A_1) ||
      List(flow.product).contains(Assets.i_A_2) &&
      flow.subProduct != Some(SubProduct.currency_and_coin) &&
      CollateralClass.isHQLALevel2B(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.encumbranceType.isEmpty &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(c)(1)", flow.marketValue))
    } else {
      None
    }
  }

  def rule_107_section_33_d_1(fromDate: MaturityBucket.FromDate, flow: Assets): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Assets.i_A_3) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.maturityBucket != MaturityBucket.Open &&
      CollateralClass.isCash(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("20(d)(1)", flow.marketValue))
    } else {
      None
    }
  }
}
