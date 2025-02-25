# Rule Code Codification
This specification defines rules for categorizing instances of cash flows into "rule codes",
which are used to group and aggregate cash flows into categories for reporting purposes. In addition,
it defines which field should be used in the aggregtion. So the result of applying this
logic is a combination of the Rule Code and the value of the specified field.

**Interpreting the Rule Tables**
The rules are written in a short-hand notation created by business users.
* The Header2 (##) sections state direction of the cash flow (Inflow, Outflow, etc).
* The Header3 (###) sections state the type of cash flow (Assets, Deposits, etc). There are multiple rules per type.
* The Rule Code identifier is denoted by the Header4 (####) line.
* The field to fetch the value from is denoted by "*".
* The "#" denotes a field that can be ignored.
* Everything else is a pattern match as per usual rule tables, though look out 
for non-technical writers taking shortcuts (like "I.A.1, 2, and 3" means any of "I.A.1", "I.A.2", or "I.A.3").

## Inflow Values
### Assets 
There are three rule codes pertaining to Inflows Assets.

#### (§.20(a)(1))
##### HQLA Additive Values
| Field                | Value                         |
|----------------------|-------------------------------|
| Product              | I.A.1 and 2                   |
| Sub-Product          | Not Currency and Coin         |
| Market Value         | *                             |
| Maturity Bucket      | #                             |
| Forward Start Amount | NULL                          |
| Forward Start Bucket | NULL                          |
| Collateral Class     | HQLA (except A-0-Q for I.A.2) |
| Treasury Control     | Y                             |
| Encumbrance Type     | NULL                          |

#### (§.20(a)(1)-C)
##### HQLA Additive Values
| Field                | Value                 |
|----------------------|-----------------------|
| Product              | I.A.3                 |
| Sub-Product          | Not Currency and Coin |
| Market Value         | *                     |
| Maturity Bucket      | Open                  |
| Forward Start Amount | NULL                  |
| Forward Start Bucket | NULL                  |
| Collateral Class     | A-0-Q                 |
| Treasury Control     | Y                     |
| Encumbrance Type     | NULL                  |


#### (§.33(d)(1))
##### Financial and Central Bank Cash Inflow Amount (§.33(d)(1))
| Field                     | Value                            |
|---------------------------|----------------------------------|
| Product                   | I.A.3                            |
| Sub-Product               | #                                |
| Market Value              | *                                |
| Maturity Bucket           | <= 30 calendar days but not Open |
| Forward Start Amount      | NULL                             |
| Forward Start Bucket      | NULL                             |
| Collateral Class          | A-0-Q                            |
| Treasury Control          | #                                |
| Encumbrance Type          | #                                |

                                                                                                                                                                                                                                                                                         |