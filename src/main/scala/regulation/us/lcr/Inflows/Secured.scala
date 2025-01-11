package regulation.us.lcr.Inflows

import regulation.us.fr2052a.datatables.inflows.secured.Secured
import regulation.us.fr2052a.fields.CollateralClass
import regulation.us.fr2052a.fields.MaturityBucket
import regulation.us.fr2052a.fields.SubProduct
import regulation.us.lcr.Rules.RuleBalance

object Secured {

  def toRuleBalances(fromDate: MaturityBucket.FromDate, securedList: List[Secured]): List[RuleBalance] = {
    securedList
      .flatMap { flow =>
        rule_2_section_20_a_1(flow)
          .orElse(rule_2_section_20_b_1(flow))
          .orElse(rule_2_section_20_c_1(flow))
          .orElse(rule_7_section_21_a_todo(fromDate, flow))
          .orElse(rule_9_section_21_c_todo(fromDate, flow))
          .orElse(rule_85_section_32_j_3_i(fromDate, flow))
          .orElse(rule_86_section_32_j_3_ii(fromDate, flow))
          .orElse(rule_87_section_32_j_3_iii(fromDate, flow))
          .orElse(rule_88_section_32_j_3_iv(fromDate, flow))
          .orElse(rule_89_section_32_j_3_v(fromDate, flow))
          .orElse(rule_90_section_32_j_3_vi(fromDate, flow))
          .orElse(rule_91_section_32_j_3_vii(fromDate, flow))
          .orElse(rule_92_section_32_j_3_viii(fromDate, flow))
          .orElse(rule_93_section_32_j_3_ix(fromDate, flow))
          .orElse(rule_94_section_32_j_3_x(fromDate, flow))
          .orElse(rule_95_section_32_j_3_xi(fromDate, flow))
          .orElse(rule_96_section_32_j_3_xii(fromDate, flow))
          .orElse(rule_97_section_32_j_3_xiii(fromDate, flow))
          .orElse(rule_105_section_33_c(fromDate, flow))
          .orElse(rule_108_section_33_d_1(fromDate, flow))
          .orElse(rule_110_section_33_d_2(fromDate, flow))
          .orElse(rule_113_section_33_f_1_i(fromDate, flow))
          .orElse(rule_114_section_33_f_1_ii(fromDate, flow))
          .orElse(rule_115_section_33_f_1_ii(fromDate, flow))
          .orElse(rule_116_section_33_f_1_ii(fromDate, flow))
          .orElse(rule_117_section_33_f_1_iii(fromDate, flow))
          .orElse(rule_118_section_33_f_1_iii(fromDate, flow))
          .orElse(rule_119_section_33_f_1_iv(fromDate, flow))
          .orElse(rule_120_section_33_f_1_iv(fromDate, flow))
          .orElse(rule_121_section_33_f_1_v(fromDate, flow))
          .orElse(rule_122_section_33_f_1_v(fromDate, flow))
          .orElse(rule_123_section_33_f_1_vi(fromDate, flow))
          .orElse(rule_124_section_33_f_1_vii(fromDate, flow))
          .orElse(rule_125_section_33_f_2_i(fromDate, flow))
          .orElse(rule_126_section_33_f_2_ii(fromDate, flow))
          .orElse(rule_127_section_33_f_2_iii(fromDate, flow))
          .orElse(rule_128_section_33_f_2_iv(fromDate, flow))
          .orElse(rule_129_section_33_f_2_v(fromDate, flow))
          .orElse(rule_130_section_33_f_2_vi(fromDate, flow))
          .orElse(rule_131_section_33_f_2_vii(fromDate, flow))
          .orElse(rule_132_section_33_f_2_viii(fromDate, flow))
          .orElse(rule_133_section_33_f_2_ix(fromDate, flow))
          .orElse(rule_134_section_33_f_2_x(fromDate, flow))
          .toList
      }
  }

  def rule_2_section_20_a_1(flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_4) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      !CollateralClass.isCash(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.unencumbered &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(a)(1)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_2_section_20_b_1(flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_4) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.unencumbered &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(b)(1)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_2_section_20_c_1(flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_4) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLALevel2B(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.unencumbered &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(c)(1)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_7_section_21_a_todo(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_4) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLA(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      (flow.unencumbered || flow.effectiveMaturityBucket.nonEmpty) &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(b)(todo)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_9_section_21_c_todo(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLA) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLA(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      (flow.unencumbered || flow.effectiveMaturityBucket.nonEmpty) &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("20(c)(todo)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_85_section_32_j_3_i(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel1) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(i)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_86_section_32_j_3_ii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel2A) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(ii)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_87_section_32_j_3_iii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel2B) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(iii)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_88_section_32_j_3_iv(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(subProduct => SubProduct.isNonHQLA(subProduct) || SubProduct.isNoCollateralPledged(subProduct)) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(iv)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_89_section_32_j_3_v(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLA) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(v)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_90_section_32_j_3_vi(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel2B) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(vi)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_91_section_32_j_3_vii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(subProduct => SubProduct.isNonHQLA(subProduct) || SubProduct.isNoCollateralPledged(subProduct)) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(vii)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_92_section_32_j_3_viii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLA) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2B(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(viii)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_93_section_32_j_3_ix(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(subProduct => SubProduct.isNonHQLA(subProduct) || SubProduct.isNoCollateralPledged(subProduct)) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2B(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(ix)", flow.collateralValue))
    } else {
      None
    }
  }

  def rule_94_section_32_j_3_x(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel1) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isGreaterThan30Days(fromDate, bucket) || MaturityBucket.isOpen(bucket)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(x)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_95_section_32_j_3_xi(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel2A) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isGreaterThan30Days(fromDate, bucket) || MaturityBucket.isOpen(bucket)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(xi)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_96_section_32_j_3_xii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel2B) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isGreaterThan30Days(fromDate, bucket) || MaturityBucket.isOpen(bucket)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(xii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_97_section_32_j_3_xiii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(subProduct => SubProduct.isNonHQLA(subProduct) || SubProduct.isNoCollateralPledged(subProduct)) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isGreaterThan30Days(fromDate, bucket) || MaturityBucket.isOpen(bucket)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("32(j)(3)(iii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_105_section_33_c(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.maturityBucket != MaturityBucket.Open &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(c)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_108_section_33_d_1(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      CollateralClass.isOther(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(d)(1)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_110_section_33_d_2(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      CollateralClass.isOther(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(d)(2)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_113_section_33_f_1_i(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isGreaterThan30Days(fromDate, bucket) || MaturityBucket.isOpen(bucket)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      !flow.unencumbered
    ) {
      Some(RuleBalance("33(f)(1)(i)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_114_section_33_f_1_ii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.isEmpty &&
      !CollateralClass.isHQLA(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(1)(ii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_115_section_33_f_1_ii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLA(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      !flow.unencumbered &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("33(f)(1)(ii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_116_section_33_f_1_ii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLA(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      !flow.treasuryControl
    ) {
      Some(RuleBalance("33(f)(1)(ii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_117_section_33_f_1_iii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isLessThanOrEqual30Days(fromDate, bucket) && !MaturityBucket.isOpen(bucket)) &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(1)(iii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_118_section_33_f_1_iii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.unencumbered &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("33(f)(1)(iii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_119_section_33_f_1_iv(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isLessThanOrEqual30Days(fromDate, bucket) && !MaturityBucket.isOpen(bucket)) &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(1)(iv)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_120_section_33_f_1_iv(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.unencumbered &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("33(f)(1)(iv)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_121_section_33_f_1_v(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isLessThanOrEqual30Days(fromDate, bucket) && !MaturityBucket.isOpen(bucket)) &&
      CollateralClass.isHQLALevel2B(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(1)(v)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_122_section_33_f_1_v(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_5) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.isEmpty &&
      CollateralClass.isHQLALevel2B(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty &&
      flow.unencumbered &&
      flow.treasuryControl
    ) {
      Some(RuleBalance("33(f)(1)(v)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_123_section_33_f_1_vi(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_1) ||
      List(flow.product).contains(Secured.i_S_2) ||
      List(flow.product).contains(Secured.i_S_3) ||
      List(flow.product).contains(Secured.i_S_6) ||
      List(flow.product).contains(Secured.i_S_7) ||
      List(flow.product).contains(Secured.i_S_8) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isLessThanOrEqual30Days(fromDate, bucket) && !MaturityBucket.isOpen(bucket)) &&
      !CollateralClass.isHQLA(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(1)(vi)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_124_section_33_f_1_vii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_5) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      !CollateralClass.isHQLA(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(1)(vii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_125_section_33_f_2_i(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      flow.effectiveMaturityBucket.exists(bucket => MaturityBucket.isGreaterThan30Days(fromDate, bucket) || MaturityBucket.isOpen(bucket)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(2)(i)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_126_section_33_f_2_ii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel1) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel1(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(2)(ii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_127_section_33_f_2_iii(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel1) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(2)(iii)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_128_section_33_f_2_iv(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel1) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2B(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(2)(iv)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_129_section_33_f_2_v(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel1) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      (!CollateralClass.isHQLA(flow.collateralClass) || CollateralClass.isOther(flow.collateralClass)) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(2)(v)", flow.maturityAmount))
    } else {
      None
    }
  }

  def rule_130_section_33_f_2_vi(fromDate: MaturityBucket.FromDate, flow: Secured): Option[RuleBalance] = {
    if (
      List(flow.product).contains(Secured.i_S_4) &&
      flow.subProduct.exists(SubProduct.isHQLALevel2A) &&
      MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.maturityBucket) &&
      (flow.effectiveMaturityBucket.isEmpty || (MaturityBucket.isLessThanOrEqual30Days(fromDate, flow.effectiveMaturityBucket.get) && !MaturityBucket.isOpen(flow.effectiveMaturityBucket.get))) &&
      CollateralClass.isHQLALevel2A(flow.collateralClass) &&
      flow.forwardStartAmount.isEmpty &&
      flow.forwardStartBucket.isEmpty
    ) {
      Some(RuleBalance("33(f)(2)(vi)", flow.maturityAmount))
   
