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

## Outflow Values
### Deposits
#### (§.32(a)(1))
##### Stable Retail Deposits 
| Field                 | Value                    |
|-----------------------|--------------------------|
| Product               | O.D.1 and 2              |
| Counterparty          | Retail or Small Business |
| Maturity Amount       | *                        |
| Maturity Bucket       | #                        |
| Collateral Class      | #                        |
| Collateral Value      | #                        |
| Insured               | FDIC                     |
| Rehypothecated        | #                        |

#### Other Retail Deposits 
#### (§.32(a)(2))
| Field            | Value                                         |
|------------------|-----------------------------------------------|
| Product          | O.D.1, 2, and 3                               |
| Counterparty     | Retail or Small Business                      |
| Maturity Amount  | *                                             |
| Maturity Bucket  | #                                             |
| Collateral Class | #                                             |
| Collateral Value | #                                             |
| Insured          | Not FDIC for PID = 1 and 2, and # for PID = 3 |
| Rehypothecated   | #                                             |

#### Insured Placed Retail Deposits 
#### (§.32(a)(3))
| Field                 | Value                    |
|-----------------------|--------------------------|
| Product               | O.D.14                   |
| Counterparty          | Retail or Small Business |
| Maturity Amount       | *                        |
| Maturity Bucket       | #                        |
| Collateral Class      | #                        |
| Collateral Value      | #                        |
| Insured               | FDIC                     |
| Rehypothecated        | #                        |

#### Non-Insured Placed Retail Deposits
#### (§.32(a)(4))
| Field                 | Value                    |
|-----------------------|--------------------------|
| Product               | O.D.14                   |
| Counterparty          | Retail or Small Business |
| Maturity Amount       | *                        |
| Maturity Bucket       | #                        |
| Collateral Class      | #                        |
| Collateral Value      | #                        |
| Insured               | Not FDIC                 |
| Rehypothecated        | #                        |

#### Other Retail Funding 
#### (§.32(a)(5))
| Field                 | Value                    |
|-----------------------|--------------------------|
| Product               | O.D.15                   |
| Counterparty          | Retail or Small Business |
| Maturity Amount       | *                        |
| Maturity Bucket       | #                        |
| Collateral Class      | #                        |
| Collateral Value      | #                        |
| Insured               | #                        |
| Rehypothecated        | NULL                     |

#### (§.32(h)(1)(i))
##### Insured Unsecured Wholesale Non-Operational Non-Financial 
| Field                 | Value                                                                                                         |
|-----------------------|---------------------------------------------------------------------------------------------------------------|
| Product               | O.D.5 and 6                                                                                                   |
| Counterparty          | Non-Financial Corporate, Sovereign, Central Bank, GSE, PSE, MDB, Other Supranational, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                                                             |
| Maturity Bucket       | <= 30 calendar days                                                                                           |
| Collateral Class      | NULL or Other                                                                                                 |
| Collateral Value      | NULL                                                                                                          |
| Insured               | FDIC                                                                                                          |
| Rehypothecated        | #                                                                                                             |

#### (§.32(h)(1)(ii)(A))
##### Not Fully Insured Unsecured Wholesale Non-Operational Non-Financial 
| Field                 | Value                                                                                                         |
|-----------------------|---------------------------------------------------------------------------------------------------------------|
| Product               | O.D.5 and 6                                                                                                   |
| Counterparty          | Non-Financial Corporate, Sovereign, Central Bank, GSE, PSE, MDB, Other Supranational, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                                                             |
| Maturity Bucket       | <= 30 calendar days                                                                                           |
| Collateral Class      | NULL or Other                                                                                                 |
| Collateral Value      | NULL                                                                                                          |
| Insured               | Not FDIC                                                                                                      |
| Rehypothecated        | #                                                                                                             |

#### (§.32(j)(1)(i))
##### Secured Funding L1 
| Field                 | Value                                                                                                                                                                                                                                                                                                                                                                |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.4, 5, 6 and 7                                                                                                                                                                                                                                                                                                                                                    |
| Counterparty          | Non-Financial Corporate, Sovereign, Central Bank (FRB and other central banks where the sovereign has not established its own outflow rate), GSE, PSE, MDB, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                                                                                                                                                                                                                                                                                                                    |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                                                                                                                                                  |
| Collateral Class      | Level 1 HQLA                                                                                                                                                                                                                                                                                                                                                         |
| Collateral Value      | To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral Value amount as unsecured wholesale funding under .32(h)                                                                                                                                                                                          |
| Insured               | #                                                                                                                                                                                                                                                                                                                                                                    |
| Rehypothecated        | #                                                                                                                                                                                                                                                                                                                                                                    |

#### (§.32(j)(1)(ii))
##### Secured Funding L2A 
| Field                 | Value                                                                                                                                                                                                                                                                                                                                                                |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.4 (not FDIC insured), 5, 6 and 7                                                                                                                                                                                                                                                                                                                                 |
| Counterparty          | Non-Financial Corporate, Sovereign, Central Bank (FRB and other central banks where the sovereign has not established its own outflow rate), GSE, PSE, MDB, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                                                                                                                                                                                                                                                                                                                    |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                                                                                                                                                  |
| Collateral Class      | Level 2A HQLA                                                                                                                                                                                                                                                                                                                                                        |
| Collateral Value      | To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral Value amount as unsecured wholesale funding under .32(h)                                                                                                                                                                                          |
| Insured               | If O.D.4 then not FDIC, otherwise #                                                                                                                                                                                                                                                                                                                                  |
| Rehypothecated        | #                                                                                                                                                                                                                                                                                                                                                                    |

#### (§.32(j)(1)(iii))
##### Secured Funding from Governmental Entities not L1 or L2A 
| Field                 | Value                                                                                                                                                                       |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.4, 5 and 6 (if not FDIC insured) and 7                                                                                                                                  |
| Counterparty          | Sovereign, Central Bank (FRB and other central banks where the sovereign has not established its own outflow rate), GSE, or MDB                                             |
| Maturity Amount       | *                                                                                                                                                                           |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                         |
| Collateral Class      | Level 2B HQLA or Non-HQLA                                                                                                                                                   |
| Collateral Value      | To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral Value amount as unsecured wholesale funding under .32(h) |
| Insured               | Not FDIC for O.D.4-6, # for O.D.7                                                                                                                                           |
| Rehypothecated        | #                                                                                                                                                                           |

#### (§.32(j)(1)(iv))
##### Secured Funding L2B 
| Field                 | Value                                                                                                                                                                                                                                  |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.4 and 7 (only collateralized deposits)                                                                                                                                                                                             |
| Counterparty          | Non-Financial Corporate, PSE, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                                                                                                                                                                                      |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                    |
| Collateral Class      | Level 2B HQLA                                                                                                                                                                                                                          |
| Collateral Value      | To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral Value amount as unsecured wholesale funding under .32(h)                                                            |
| Insured               | #                                                                                                                                                                                                                                      |
| Rehypothecated        | Y                                                                                                                                                                                                                                      |

#### (§.32(j)(1)(iv))
##### Secured Funding L2B 
| Field                 | Value                                                                                                                                                                                                                                              |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.5 and 6                                                                                                                                                                                                                                        |
| Counterparty          | Non-Financial Corporate, PSE, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other             |
| Maturity Amount       | *                                                                                                                                                                                                                                                  |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                                |
| Collateral Class      | Level 2B HQLA                                                                                                                                                                                                                                      |
| Collateral Value      | To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral Value amount as unsecured wholesale funding under .32(h)                                                                        |
| Insured               | #                                                                                                                                                                                                                                                  |
| Rehypothecated        | Y for Non-Financial Corporate, PSE, Other Supranational, Debt Issuing SPE, Other; # for Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund |

#### (§.32(j)(1)(vi))
##### Secured Funding Non-HQLA 
| Field                 | Value                                                                                                                                                                                                                                  |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.4 and 7 (only collateralized deposits)                                                                                                                                                                                             |
| Counterparty          | Non-Financial Corporate, PSE, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                                                                                                                                                                                      |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                    |
| Collateral Class      | Non-HQLA                                                                                                                                                                                                                               |
| Collateral Value      | To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral Value amount as unsecured wholesale funding under .32(h)                                                            |
| Insured               | #                                                                                                                                                                                                                                      |
| Rehypothecated        | Y                                                                                                                                                                                                                                      |

#### (§.32(j)(1)(vi))
##### Secured Funding Non-HQLA 
| Field                 | Value                                                                                                                                                                                                                                              |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.5 and 6                                                                                                                                                                                                                                        |
| Counterparty          | Non-Financial Corporate, PSE, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other             |
| Maturity Amount       | *                                                                                                                                                                                                                                                  |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                                |
| Collateral Class      | Non-HQLA                                                                                                                                                                                                                                           |
| Collateral Value      | To the extent the Collateral Value is less than the Maturity Amount, treat the Maturity Amount less the Collateral Value amount as unsecured wholesale funding under .32(h)                                                                        |
| Insured               | #                                                                                                                                                                                                                                                  |
| Rehypothecated        | Y for Non-Financial Corporate, PSE, Other Supranational, Debt Issuing SPE, Other; # for Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund |

#### (§.32(j)(2))
##### Secured but Lower Unsecured Rate 
| Field                 | Value                                                                      |
|-----------------------|----------------------------------------------------------------------------|
| Product               | O.D.5 and 6                                                                |
| Counterparty          | Non-Financial Corporate, PSE, Other Supranational, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                          |
| Maturity Bucket       | <= 30 calendar days                                                        |
| Collateral Class      | Level 2B HQLA or Non-HQLA                                                  |
| Collateral Value      | #                                                                          |
| Insured               | *                                                                          |
| Rehypothecated        | N                                                                          |

#### (§.32(j)(2))
##### Secured but Lower Unsecured Rate 
| Field                 | Value                                                                                                                                                                                                                                                                                                                                                                                    |
|-----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.4 (only collateralized deposits)                                                                                                                                                                                                                                                                                                                                                     |
| Counterparty          | Non-Financial Corporate, PSE, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other; if FDIC insured: Sovereigns, GSEs, MDBs, Central Bank (FRB and other central banks where the sovereign has not established its own outflow rate) |
| Maturity Amount       | *                                                                                                                                                                                                                                                                                                                                                                                        |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                                                                                                                                                                      |
| Collateral Class      | If FDIC insured: Not Level 1; if not FDIC insured: Level 2B or Non-HQLA                                                                                                                                                                                                                                                                                                                  |
| Collateral Value      | #                                                                                                                                                                                                                                                                                                                                                                                        |
| Insured               | *                                                                                                                                                                                                                                                                                                                                                                                        |
| Rehypothecated        | N                                                                                                                                                                                                                                                                                                                                                                                        |

#### (§.32(j)(2))
##### Secured but Lower Unsecured Rate 
| Field                 | Value                                                                                                                                                                                                                                  |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.7 (only collateralized deposits)                                                                                                                                                                                                   |
| Counterparty          | Non-Financial Corporate, PSE, Other Supranational, Pension Fund, Bank, Broker-Dealer, Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank Financial Entity, Non-Regulated Fund, Debt Issuing SPE, Other |
| Maturity Amount       | *                                                                                                                                                                                                                                      |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                    |
| Collateral Class      | Level 2B or Non-HQLA                                                                                                                                                                                                                   |
| Collateral Value      | #                                                                                                                                                                                                                                      |
| Insured               | #                                                                                                                                                                                                                                      |
| Rehypothecated        | N                                                                                                                                                                                                                                      |

#### (§.32(k))
##### Foreign Central Banking Borrowing 
| Field                 | Value                                                                                                                                                                                                                                                                                                        |
|-----------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product               | O.D.4, 5, 6, 7 (only collateralized deposits) (foreign central banks where the sovereign has established an LCR outflow rate; if the foreign central bank has not established an outflow rate, then the outflow should be calculated through the secured funding tables above, see relevant footnotes above) |
| Counterparty          | Central Bank                                                                                                                                                                                                                                                                                                 |
| Maturity Amount       | *                                                                                                                                                                                                                                                                                                            |
| Maturity Bucket       | <= 30 calendar days                                                                                                                                                                                                                                                                                          |
| Collateral Class      | *                                                                                                                                                                                                                                                                                                            |
| Collateral Value      | *                                                                                                                                                                                                                                                                                                            |
| Insured               | #                                                                                                                                                                                                                                                                                                            |
| Rehypothecated        | #                                                                                                                                                                                                                                                                                                            |
| Internal Counterparty | #                                                                                                                                                                                                                                                                                                            |