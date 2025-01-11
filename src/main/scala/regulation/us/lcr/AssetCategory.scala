package regulation.us.lcr

object AssetCategory {

  sealed trait Category
  case object Agency extends Category
  case object Sovereigns extends Category
  case object CentralBank extends Category
  case object GovernmentSponsoredEntity extends Category
  case object Equity extends Category
  case object InvestmentGrade extends Category
  case object NonInvestmentGrade extends Category
  case object Loan extends Category
  case object Debt extends Category
  case object Commodities extends Category
  case object Property extends Category
  case object LetterOfCredit extends Category
  case object Other extends Category

  case class AssetCategory(category: Category, index: Int, hqla: Boolean)

  def memberOf(list: List[AssetCategory], item: AssetCategory): Boolean =
    list.contains(item)

  val hQLALevel1: List[AssetCategory] = List(
    a_0_Q, a_1_Q, a_2_Q, a_3_Q, a_4_Q, a_5_Q, s_1_Q, s_2_Q, s_3_Q, s_4_Q, cB_1_Q, cB_2_Q
  )

  val hQLALevel1ExcludingCash: List[AssetCategory] =
    hQLALevel1.filter(_ != a_0_Q)

  val hQLALevel2A: List[AssetCategory] = List(
    g_1_Q, g_2_Q, g_3_Q, s_5_Q, s_6_Q, s_7_Q, cB_3_Q
  )

  val hQLALevel2B: List[AssetCategory] = List(
    e_1_Q, e_2_Q, iG_1_Q, iG_2_Q
  )

  val hQLAUnwindTransactions: List[AssetCategory] =
    hQLALevel1 ++ hQLALevel2A ++ hQLALevel2B

  val a_0_Q: AssetCategory = AssetCategory(Agency, 0, true)
  val a_1_Q: AssetCategory = AssetCategory(Agency, 1, true)
  val a_2_Q: AssetCategory = AssetCategory(Agency, 2, true)
  val a_3_Q: AssetCategory = AssetCategory(Agency, 3, true)
  val a_4_Q: AssetCategory = AssetCategory(Agency, 4, true)
  val a_5_Q: AssetCategory = AssetCategory(Agency, 5, true)
  val s_1_Q: AssetCategory = AssetCategory(Sovereigns, 1, true)
  val s_2_Q: AssetCategory = AssetCategory(Sovereigns, 2, true)
  val s_3_Q: AssetCategory = AssetCategory(Sovereigns, 3, true)
  val s_4_Q: AssetCategory = AssetCategory(Sovereigns, 4, true)
  val s_5_Q: AssetCategory = AssetCategory(Sovereigns, 5, true)
  val s_6_Q: AssetCategory = AssetCategory(Sovereigns, 6, true)
  val s_7_Q: AssetCategory = AssetCategory(Sovereigns, 7, true)
  val cB_1_Q: AssetCategory = AssetCategory(CentralBank, 1, true)
  val cB_2_Q: AssetCategory = AssetCategory(CentralBank, 2, true)
  val cB_3_Q: AssetCategory = AssetCategory(CentralBank, 3, true)
  val g_1_Q: AssetCategory = AssetCategory(GovernmentSponsoredEntity, 1, true)
  val g_2_Q: AssetCategory = AssetCategory(GovernmentSponsoredEntity, 2, true)
  val g_3_Q: AssetCategory = AssetCategory(GovernmentSponsoredEntity, 3, true)
  val e_1_Q: AssetCategory = AssetCategory(Equity, 1, true)
  val e_2_Q: AssetCategory = AssetCategory(Equity, 2, true)
  val iG_1_Q: AssetCategory = AssetCategory(InvestmentGrade, 1, true)
  val iG_2_Q: AssetCategory = AssetCategory(InvestmentGrade, 2, true)
  val a_2: AssetCategory = AssetCategory(Agency, 2, false)
  val a_3: AssetCategory = AssetCategory(Agency, 3, false)
  val a_4: AssetCategory = AssetCategory(Agency, 4, false)
  val a_5: AssetCategory = AssetCategory(Agency, 5, false)
  val s_1: AssetCategory = AssetCategory(Sovereigns, 1, false)
  val s_2: AssetCategory = AssetCategory(Sovereigns, 2, false)
  val s_3: AssetCategory = AssetCategory(Sovereigns, 3, false)
  val s_4: AssetCategory = AssetCategory(Sovereigns, 4, false)
  val cB_1: AssetCategory = AssetCategory(CentralBank, 1, false)
  val cB_2: AssetCategory = AssetCategory(CentralBank, 2, false)
  val g_1: AssetCategory = AssetCategory(GovernmentSponsoredEntity, 1, false)
  val g_2: AssetCategory = AssetCategory(GovernmentSponsoredEntity, 2, false)
  val g_3: AssetCategory = AssetCategory(GovernmentSponsoredEntity, 3, false)
  val s_5: AssetCategory = AssetCategory(Sovereigns, 5, false)
  val s_6: AssetCategory = AssetCategory(Sovereigns, 6, false)
  val s_7: AssetCategory = AssetCategory(Sovereigns, 7, false)
  val cB_3: AssetCategory = AssetCategory(CentralBank, 3, false)
  val e_1: AssetCategory = AssetCategory(Equity, 1, false)
  val e_2: AssetCategory = AssetCategory(Equity, 2, false)
  val iG_1: AssetCategory = AssetCategory(InvestmentGrade, 1, false)
  val iG_2: AssetCategory = AssetCategory(InvestmentGrade, 2, false)
  val s_8: AssetCategory = AssetCategory(Sovereigns, 8, false)
  val g_4: AssetCategory = AssetCategory(GovernmentSponsoredEntity, 4, false)
  val e_3: AssetCategory = AssetCategory(Equity, 3, false)
  val e_4: AssetCategory = AssetCategory(Equity, 4, false)
  val e_5: AssetCategory = AssetCategory(Equity, 5, false)
  val e_6: AssetCategory = AssetCategory(Equity, 6, false)
  val e_7: AssetCategory = AssetCategory(Equity, 7, false)
  val e_8: AssetCategory = AssetCategory(Equity, 8, false)
  val e_9: AssetCategory = AssetCategory(Equity, 9, false)
  val e_10: AssetCategory = AssetCategory(Equity, 10, false)
  val n_1: AssetCategory = AssetCategory(NonInvestmentGrade, 1, false)
  val n_2: AssetCategory = AssetCategory(NonInvestmentGrade, 2, false)
  val n_3: AssetCategory = AssetCategory(NonInvestmentGrade, 3, false)
  val n_4: AssetCategory = AssetCategory(NonInvestmentGrade, 4, false)
  val n_5: AssetCategory = AssetCategory(NonInvestmentGrade, 5, false)
  val n_6: AssetCategory = AssetCategory(NonInvestmentGrade, 6, false)
  val n_7: AssetCategory = AssetCategory(NonInvestmentGrade, 7, false)
  val n_8: AssetCategory = AssetCategory(NonInvestmentGrade, 8, false)
  val l_1: AssetCategory = AssetCategory(Loan, 1, false)
  val l_2: AssetCategory = AssetCategory(Loan, 2, false)
  val l_3: AssetCategory = AssetCategory(Loan, 3, false)
  val l_4: AssetCategory = AssetCategory(Loan, 4, false)
  val l_5: AssetCategory = AssetCategory(Loan, 5, false)
  val l_6: AssetCategory = AssetCategory(Loan, 6, false)
  val l_7: AssetCategory = AssetCategory(Loan, 7, false)
  val l_8: AssetCategory = AssetCategory(Loan, 8, false)
  val l_9: AssetCategory = AssetCategory(Loan, 9, false)
  val l_10: AssetCategory = AssetCategory(Loan, 10, false)
  val l_11: AssetCategory = AssetCategory(Loan, 11, false)
  val l_12: AssetCategory = AssetCategory(Loan, 12, false)
  val y_1: AssetCategory = AssetCategory(Debt, 1, false)
  val y_2: AssetCategory = AssetCategory(Debt, 2, false)
  val y_3: AssetCategory = AssetCategory(Debt, 3, false)
  val y_4: AssetCategory = AssetCategory(Debt, 4, false)
  val c_1: AssetCategory = AssetCategory(Commodities, 1, false)
  val p_1: AssetCategory = AssetCategory(Property, 1, false)
  val p_2: AssetCategory = AssetCategory(Property, 2, false)
  val z_1: AssetCategory = AssetCategory(Other, 1, false)
  val iG_3: AssetCategory = AssetCategory(InvestmentGrade, 3, false)
  val iG_4: AssetCategory = AssetCategory(InvestmentGrade, 4, false)
  val iG_5: AssetCategory = AssetCategory(InvestmentGrade, 5, false)
  val iG_6: AssetCategory = AssetCategory(InvestmentGrade, 6, false)
  val iG_7: AssetCategory = AssetCategory(InvestmentGrade, 7, false)
  val iG_8: AssetCategory = AssetCategory(InvestmentGrade, 8, false)
  val lC_1: AssetCategory = AssetCategory(LetterOfCredit, 1, false)
  val lC_2: AssetCategory = AssetCategory(LetterOfCredit, 2, false)
  val cB_4: AssetCategory = AssetCategory(CentralBank, 4, false)
}
