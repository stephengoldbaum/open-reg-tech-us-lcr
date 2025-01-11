package regulation.us.fr2052a.fields

type CollateralClass = String

sealed trait AssetCategory
case object Agency extends AssetCategory
case object Sovereigns extends AssetCategory
case object CentralBank extends AssetCategory
case object GovernmentSponsoredEntity extends AssetCategory
case object Equity extends AssetCategory
case object InvestmentGrade extends AssetCategory
case object NonInvestmentGrade extends AssetCategory
case object Loan extends AssetCategory
case object Debt extends AssetCategory
case object Commodities extends AssetCategory
case object Property extends AssetCategory
case object LetterOfCredit extends AssetCategory
case object Other extends AssetCategory

object AssetCategory {
  def fromString(assetString: String): Option[AssetCategory] = assetString match {
    case "A" => Some(Agency)
    case "S" => Some(Sovereigns)
    case "CB" => Some(CentralBank)
    case "G" => Some(GovernmentSponsoredEntity)
    case "E" => Some(Equity)
    case "IG" => Some(InvestmentGrade)
    case "N" => Some(NonInvestmentGrade)
    case "L" => Some(Loan)
    case "D" => Some(Debt)
    case "C" => Some(Commodities)
    case "P" => Some(Property)
    case "LC" => Some(LetterOfCredit)
    case "Z" => Some(Other)
    case _ => None
  }

  def toString(assetCategory: AssetCategory): String = assetCategory match {
    case Agency => "A"
    case Sovereigns => "S"
    case CentralBank => "CB"
    case GovernmentSponsoredEntity => "G"
    case Equity => "E"
    case InvestmentGrade => "IG"
    case NonInvestmentGrade => "N"
    case Loan => "L"
    case Debt => "D"
    case Commodities => "C"
    case Property => "P"
    case LetterOfCredit => "LC"
    case Other => "Z"
  }
}

object CollateralClass {
  def toString(collateralClass: CollateralClass): String = collateralClass

  def fromString(string: String): Option[CollateralClass] = Some(string)

  def isCash(collateralClass: CollateralClass): Boolean = collateralClass == "A-0-Q"

  def isHQLALevel1(collateralClass: CollateralClass): Boolean = List(
    "A-0-Q", "A-1-Q", "A-2-Q", "A-3-Q", "A-4-Q", "A-5-Q",
    "S-1-Q", "S-2-Q", "S-3-Q", "S-4-Q", "CB-1-Q", "CB-2-Q"
  ).contains(collateralClass)

  def isHQLALevel2A(collateralClass: CollateralClass): Boolean = List(
    "G-1-Q", "G-2-Q", "G-3-Q", "S-5-Q", "S-6-Q", "S-7-Q", "CB-3-Q"
  ).contains(collateralClass)

  def isHQLALevel2B(collateralClass: CollateralClass): Boolean = List(
    "E-1-Q", "E-2-Q", "IG-1-Q", "IG-2-Q"
  ).contains(collateralClass)

  def isHQLA(collateralClass: CollateralClass): Boolean =
    isHQLALevel1(collateralClass) || isHQLALevel2A(collateralClass) || isHQLALevel2B(collateralClass)

  def allClasses: List[CollateralClass] = List(
    "A-0-Q", "A-1-Q", "A-2-Q", "A-3-Q", "A-4-Q", "A-5-Q",
    "S-1-Q", "S-2-Q", "S-3-Q", "S-4-Q", "S-5-Q", "S-6-Q", "S-7-Q",
    "CB-1-Q", "CB-2-Q", "CB-3-Q", "G-1-Q", "G-2-Q", "G-3-Q",
    "E-1-Q", "E-2-Q", "IG-1-Q", "IG-2-Q", "A-2", "A-3", "A-4", "A-5",
    "S-1", "S-2", "S-3", "S-4", "CB-1", "CB-2", "G-1", "G-2", "G-3",
    "S-5", "S-6", "S-7", "CB-3", "E-1", "E-2", "IG-1", "IG-2", "S-8",
    "G-4", "E-3", "E-4", "E-5", "E-6", "E-7", "E-8", "E-9", "E-10",
    "N-1", "N-2", "N-3", "N-4", "N-5", "N-6", "N-7", "N-8", "L-1",
    "L-2", "L-3", "L-4", "L-5", "L-6", "L-7", "L-8", "L-9", "L-10",
    "L-11", "L-12", "Y-1", "Y-2", "Y-3", "Y-4", "C-1", "P-1", "P-2",
    "Z-1", "IG-3", "IG-4", "IG-5", "IG-6", "IG-7", "IG-8", "LC-1",
    "LC-2", "CB-4"
  )

  def isOther(collateralClass: CollateralClass): Boolean =
    !allClasses.contains(collateralClass)
}
