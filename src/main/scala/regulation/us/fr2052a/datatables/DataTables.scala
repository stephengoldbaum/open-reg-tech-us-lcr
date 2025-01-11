package regulation.us.fr2052a.datatables

import regulation.us.fr2052a.datatables.inflows.assets.Assets
import regulation.us.fr2052a.datatables.inflows.other.Other
import regulation.us.fr2052a.datatables.inflows.secured.Secured
import regulation.us.fr2052a.datatables.inflows.unsecured.Unsecured
import regulation.us.fr2052a.datatables.outflows.deposits.Deposits
import regulation.us.fr2052a.datatables.outflows.other.Other
import regulation.us.fr2052a.datatables.outflows.secured.Secured
import regulation.us.fr2052a.datatables.outflows.wholesale.Wholesale
import regulation.us.fr2052a.datatables.supplemental.balancesheet.BalanceSheet
import regulation.us.fr2052a.datatables.supplemental.derivativescollateral.DerivativesCollateral
import regulation.us.fr2052a.datatables.supplemental.foreignexchange.ForeignExchange
import regulation.us.fr2052a.datatables.supplemental.informational.Informational
import regulation.us.fr2052a.datatables.supplemental.liquidityriskmeasurement.LiquidityRiskMeasurement

case class DataTables(
  inflows: Inflows,
  outflows: Outflows,
  supplemental: Supplemental
)

case class Inflows(
  assets: List[Assets],
  unsecured: List[Unsecured],
  secured: List[Secured],
  other: List[Other]
)

case class Outflows(
  deposits: List[Deposits],
  wholesale: List[Wholesale],
  secured: List[Secured],
  other: List[Other]
)

case class Supplemental(
  informational: List[Informational],
  derivativesCollateral: List[DerivativesCollateral],
  liquidityRiskMeasurement: List[LiquidityRiskMeasurement],
  balanceSheet: List[BalanceSheet],
  foreignExchange: List[ForeignExchange]
)
