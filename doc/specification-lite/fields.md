# Fields

## **Currency**
Represents the currency denomination of the cash flow instance. 

The acceptable values for this field are USD, EUR, GBP, CHF, JPY, AUD, and CAD.
All other currencies should be converted to USD along with their  respective [Market Value] and [Maturity Amount] fields.

The following firms may report all assets, liabilities, and other informational data elements in
USD millions: 
- U.S. firms that are identified as Category III banking organizations with average weighted short-term wholesale funding of less than $75 billion
- U.S. firms that are identified as Category IV banking organizations
- FBOs that are identified as Category III foreign banking organizations with average weighted short-term wholesale funding of less than $75 billion
- FBOs that are identified as Category IV foreign banking organizations. 

For all other firms, each numerical field (e.g., [Market Value], [Maturity Amount], etc.) has an associated currency attribute, which should be used to identify the currency denomination of all assets, liabilities, and other informational data elements. All currency-denominated values should be reported in millions (e.g., U.S. dollar-denominated transactions in USD millions, sterling-denominated transactions in GBP millions). Use the following currency codes: USD, EUR, GBP, CHF, JPY, AUD, and CAD. For all other currencies, convert to USD according to the closing exchange rate (i.e., 6:30pm EST) on the as-of date (T) using the same currency conversion convention. 

## **Converted**
Report this field as True if the data element values have been converted to USD-equivalent
values.

## **Product**
Refer to the product definitions section for specific guidance on the classification of inflows,
outflows, and supplemental items. Unless otherwise specified, do not report the same
transaction more than one time for each reporting entity.

## **Sub-Product**
The sub-product field is used in conjunction with the product field to further differentiate
similar data elements.
- The sub-product is only a required field for certain products.
- For a full listing of acceptable product and sub-product combinations, see Appendix II.

## **Counterparty**
*The following counterparty types are used across all tables except the Inflow-Assets,
Supplemental-Informational, and Comment tables*. The definitions for these types should align
with the classification of the legal counterparty to a given exposure and not the counterpartys
ultimate parent; however two product-specific exceptions to this approach are detailed below
in the definitions of the Debt Issuing SPE and Bank counterparty types.
- **Retail** - Refers to a counterparty who is a natural person. Retail includes a living or testamentary
trust that is solely for the benefit of natural persons, does not have a corporate trustee,
and terminates within 21 years and 10 months after the death of grantors or
beneficiaries of the trust living on the effective date of the trust or within 25 years, if
applicable under state law. Retail does not include other legal entities, sole
proprietorships, or partnerships. Other legal entities, proprietorships and partnerships
should be reported, as appropriate, in one of the sub-products as defined below.
- **Small Business** - Refers to entities managed as retail exposures that exhibit the same liquidity risk
characteristics as retail customers. The total aggregate funding raised from these
entities should not exceed $1.5 million from the perspective of the consolidated reporting entity. Under circumstances where small business entities are affiliated, the
\$1.5 million threshold should be assessed against the aggregate funding exposures of
the affiliated group.
- **Non-Financial Corporate** - Refers to commercial entities that are not owned by central governments, local
governments or local authorities with revenue-raising powers, and that are nonfinancial
in nature (i.e., do not meet the definition of Pension Fund, Bank, Broker-Dealer,
Investment Company or Advisor, Financial Market Utility, Other Supervised Non-Bank
Financial Entity, or Non-Regulated Fund as identified in the sections below).
- **Sovereign** - Refers to a central government or an agency, department or ministry.
- **Central Bank** - Refers to a bank responsible for implementing its jurisdictions monetary policy.
- **Government Sponsored Entity (GSE)** - Refers to entities established or chartered by the Federal government to serve public
purposes specified by the United States Congress, but whose debt obligations are not
explicitly guaranteed by the full faith and credit of the United States government.
- **Public Sector Entity (PSE)** - Refers to a state, local authority, or other governmental subdivision below the sovereign
level.
- **Multilateral Development Bank (MDB)** - Refers to the International Bank for Reconstruction and Development, the Multilateral
Investment Guarantee Agency, the International Finance Corporation, the Inter-
American Development Bank, the Asian Development Bank, the African Development
Bank, the European Bank for Reconstruction and Development, the European
Investment Bank, the European Investment Fund, the Nordic Investment Bank, the
Caribbean Development Bank, the Islamic Development Bank, the Council of Europe
Development Bank, and any other entity that provides financing for national or regional
development in which the U.S. government is a shareholder or contributing member or
which the appropriate Federal banking agency determines poses comparable risk.
- **Other Supranational** - International or regional organizations or subordinate or affiliated agencies thereof,
created by treaty or convention between sovereign states that are not multilateral
development banks, including the International Monetary Fund, the Bank for
International Settlements, and the United Nations.
- **Pension Fund** - Refers to an employee benefit plan as defined in paragraphs (3) and (32) of section 3 of
the Employee Retirement Income and Security Act of 1974 (29 U.S.C. 1001 et seq.), a
governmental plan (as defined in 29 U.S.C. 1002(32)) that complies with the tax
deferral qualification requirements provided in the Internal Revenue Code, or any
similar employee benefit plan established under the laws of a foreign jurisdiction.
- **Bank** - Refers to a depository institution; bank holding company or savings and loan holding
company; foreign bank; credit union; industrial loan company, industrial bank, or other
similar institution described in section 2 of the Bank Holding Company Act of 1956, as
amended (12 U.S.C. 1841 et seq.); national bank, state member bank, or state nonmember
bank that is not a depository institution. This term does not include non-bank
financial entities that have an affiliated banking entity, except for exposures reported in
the Outflows-Other table under products O.O.4: Credit Facilities and O.O.5: Liquidity
Facilities. Any company that is not a bank but is included in the organization chart of a
bank holding company or savings and loan holding company on the Form FR Y-6, as
listed in the hierarchy report of the bank holding company or savings and loan holding
company produced by the National Information Center (NIC) Web site, must be
designated as a Bank for products O.O.4 and O.O.5. This term does not include bridge
financial companies as defined in 12 U.S.C. 5381(a)(3), or new depository institutions or
bridge depository institutions as defined in 12 U.S.C. 1813(i).
- **Broker-Dealer** - Refers to a securities holding company as defined in section 618 of the Dodd-Frank Act
(12 U.S.C. 1850a); broker or dealer registered with the SEC under section 15 of the
Securities Exchange Act (15 U.S.C. 78o); futures commission merchant as defined in
section 1a of the Commodity Exchange Act of 1936 (7 U.S.C. 1 et seq.); swap dealer as
defined in section 1a of the Commodity Exchange Act (7 U.S.C. 1a); security-based swap
dealer as defined in section 3 of the Securities Exchange Act (15 U.S.C. 78c); or any
company not domiciled in the United States (or a political subdivision thereof) that is
supervised and regulated in a manner similar to these entities.
- **Investment Company or Advisor** - Refers to a person or company registered with the SEC under the Investment Company
Act of 1940 (15 U.S.C. 80a-1 et seq.); a company registered with the SEC as an
investment adviser under the Investment Advisers Act of 1940 (15 U.S.C. 80b-1 et seq.);
or foreign equivalents of such persons or companies. An investment company or advisor
does not include small business investment companies, as defined in section 102 of the
Small Business Investment Act of 1958 (15 U.S.C. 661 et seq.).
- **Financial Market Utility** - Refers to a designated financial market utility, as defined in section 803 of the Dodd-
Frank Act (12 U.S.C. 5462) and any company not domiciled in the United States (or a
political subdivision thereof) that is supervised and regulated in a similar manner.
- **Other Supervised Non-Bank Financial Entity**
  1. A company that the Financial Stability Oversight Council has determined under
  section 113 of the Dodd-Frank Act (12 U.S.C. 5323) shall be supervised by the Board
  of Governors of the Federal Reserve System and for which such determination is still
  in effect;
  2. A company that is not a bank, broker-dealer, investment company or advisor or
  financial market utility, but is included in the organization chart of a bank holding
  company or savings and loan holding company on the Form FR Y-6, as listed in the
  hierarchy report of the bank holding company or savings and loan holding company
  produced by the National Information Center (NIC) Web site;
  3. An insurance company; and
  4. Any company not domiciled in the United States (or a political subdivision thereof)
  that is supervised and regulated in a manner similar to entities described in
  paragraphs (1) through (3) of this definition (e.g., a non-bank subsidiary of a foreign
  banking organization, foreign insurance company, etc.).
  5. A supervised non-bank financial entity does not include:
     * U.S. government-sponsored enterprises;
     * Entities designated as Community Development Financial Institutions (CDFIs)
     under 12 U.S.C. 4701 et seq. and 12 CFR part 1805; or
     * Central banks, the Bank for International Settlements, the International
     Monetary Fund, or multilateral development banks.
- **Debt Issuing Special Purpose Entity (SPE)** - Refers to an SPE9 that issues or has issued commercial paper or securities (other than
equity securities issued to a company of which the SPE is a consolidated subsidiary) to
finance its purchases or operations. This counterparty type should only be used to
identify stand-alone SPEs that issue debt and are not consolidated on an affiliated
entitys balance sheet for purposes of financial reporting, except for exposures reported
in the Outflows-Other table under products O.O.4: Credit Facilities and O.O.5: Liquidity
Facilities. All debt issuing SPEs should be identified as Debt Issuing SPEs for products
O.O.4 and O.O.5, regardless of whether they are consolidated by an affiliate for financial
reporting.
- **Non-Regulated Fund** - Refers to a hedge fund or private equity fund whose investment advisor is required to
file SEC Form PF (Reporting Form for Investment Advisers to Private Funds and Certain
Commodity Pool Operators and Commodity Trading Advisors), other than a small
business investment company as defined in section 102 of the Small Business
Investment Act of 1958 (15 U.S.C. 661 et seq.)).
- **Other** - Refers to any counterparty that does not fall into any of the above categories. Consult
with your supervisory team before reporting balances using this counterparty type. Use
the comments table to provide description of the counterparty on at least a
monthly basis and in the event of a material change in reported values.

## **Collateral Class**
Use the asset category table in Appendix III to identify the type of collateral for all relevant inflows, outflows, and informational items. These types are required for the rule code assignment process. In particular, it is important to be able to identify which collateral classes represent Hiqh Quality Liquid Assets (HQLA) and its Cash sub-type.
- For securities that have multiple credit risk profiles, report the transaction or asset based on the lowest quality.
- Use the standardized risk weightings as specified under subpart D of Regulation Q (12 CFR part 217).
- Work with supervisory teams to address questions on the categorization of specific assets.

## **Collateral Value**
Refers to the fair value under GAAP of the referenced asset or pool of collateral, gross of any
haircuts, according to the close-of-business marks on the as-of date. For pledged loans that are
accounted for on an accrual basis, report the most recent available fair valuation.

## **Maturity Bucket**
Report the appropriate maturity time bucket value for each data element, based on the listing
provided in Appendix IV.
* Report all information based on the contractual maturity of each data element.
  - In general, report maturities based upon the actual settlement of cash flows. For
  example, if a payment is scheduled to occur on a weekend or bank holiday, but
  will not actually settle until the next good business day, the maturity bucket
  must correspond to the date on which the payment will actually settle.
  - Do not report based on behavioral or projected assumptions.
* Day buckets refer to the number of calendar days following the as-of date (T). For
example, Day 1 (Calendar Day 1) represents balances on T+1 (maturing the next
calendar day from T).
* Report transactions and balances that do not have a contractual maturity, but could be
contractually realized on demand (e.g., demand deposits) as Open.
* Report transactions and balances as Perpetual to the extent that they do not have a
contractual maturity (or where the maturity is explicitly defined as perpetual), could not
be contractually realized on demand or with notice at the inception of the transaction,
and would not be subject to the maturity acceleration requirements of sections
31(a)(1)(i) or (iii) of the LRM Standards. For example, common equity included in
regulatory capital should be reported with a [Maturity Bucket] value of Perpetual.
* For transactions and balances with embedded optionality, report the maturity in
accordance with sections 31(a)(1) and 31(a)(2) of the LRM Standards. For deferred tax
liabilities, report the maturity in accordance with section 101(d) of the LRM Standards.
  - For transactions and balances with embedded optionality that are executed
  between affiliated reporting entities, where neither reporting entity is subject to
  the LRM Standards on a standalone basis, report the maturity according to the
  earliest possible date the transaction or balance could contractually be repaid.
* In the case of forward starting transactions with an open maturity, report the [Maturity
Bucket] value equal to the [Forward Start Bucket] value until the forward start date
arrives. Do not report the record with a [Maturity Bucket] value of Open until the
forward starting leg actually settles.
* Report all executed transactions, including transactions that have traded but have not
settled.
  - Do not report transactions that are anticipated, but have not yet been executed.
* Further guidance that is only relevant to specific products is provided in the product definitions section.

## **Maturity Amount**
Report the notional amount contractually due to be paid or received at maturity for each data
element.
* All notional currency-denominated values should be reported in millions (e.g., U.S.
dollar-denominated transactions in USD millions, sterling-denominated transactions in
GBP millions).
* This amount represents the aggregate balance of trades, positions or accounts that
share common data characteristics (i.e., common non-numerical field values). If the
aggregate amount rounds to less than ten thousand currency units (i.e., 0.01 for this
report), the record should not be reported.
  - Example: The banking entity has corporate customers with a total of \$2.25 billion
  in operational and non-operational deposits, of which:
    * $1 billion is operational and fully FDIC insured with an open maturity;
    * $500 million is non-operational uninsured with an open maturity; and
    * $750 million is non-operational uninsured maturing on calendar day 5.
  - Table 1 below illustrates how the total operational and non-operational
  corporate deposit balance should be disaggregated and reported across these
  three distinct combinations of fields in the deposit table (O.D).
  
| O.D fields | Reporting Entity | Currency | Converted | PID | Product                          | Counterparty            | Maturity Amount | Maturity Bucket | Insured | Trigger | Internal | Business Line       |
|------------|------------------|----------|-----------|-----|----------------------------------|-------------------------|-----------------|-----------------|---------|---------|----------|---------------------|
| Example 1  | BANK             | USD      | N         | 4   | Operational Account Balances     | Non-financial Corporate | 1000            | Open            | FDIC    | N       | N        | Commercial Banking  |
| Example 2  | BANK             | USD      | N         | 6   | Non-Operational Account Balances | Non-financial Corporate | 500             | Open            | FDIC    | N       | N        | Commercial Banking  |
| Example 3  | BANK             | USD      | N         | 6   | Non-Operational Account Balances | Non-financial Corporate | 750             | Open            | FDIC    | N       | N        | Commercial Banking  |

## **Forward Start Bucket**
*This field is only relevant for data elements with a forward-starting leg (i.e., the trade settles at*
*a future date).* Report the appropriate maturity bucket for the forward-starting settlement date
of each applicable data element, based on the maturity buckets provided in Appendix IV. See
the Supplemental-Foreign Exchange table guidance in the product definitions section for
further instruction on how to report forward-starting foreign exchange transactions.

## **Forward Start Amount**
*This field is only relevant for data elements with a forward-starting leg.* In conjunction with the
forward start bucket, report the notional amount due to be paid or received on the opening
trade settlement date of forward starting transactions. See the Supplemental-Foreign Exchange
table guidance in the product definitions section for further instruction on how to report
forward-starting foreign exchange transactions.

## **Treasury Control**
*This field is only applicable to the Inflows-Assets, Inflows-Secured, Inflows-Other, Outflows-*
*Secured and Supplemental-Derivatives & Collateral tables.* Use this field to flag (Yes) assets, or
transactions secured by assets that meet the operational requirements for eligible HQLA in the
LRM Standards other than the requirement to be unencumbered, which addresses: the
operational capability to monetize; policies that require control by the function of the bank
charged with managing liquidity risk; policies and procedures that determine the composition;
and not being client pool securities or designated to cover operational costs.

Do not set [Treasury Control]=Yes in the Secured-Inflows table where the collateral received
has been rehypothecated and pledged to secure a collateral swap where the collateral that
must be returned at the maturity of the swap transaction does not qualify as HQLA per the FR
2052a Asset Category Table (Appendix III).

## **Market Value**
*This field is only applicable to the Inflows-Assets, Supplemental-Derivatives & Collateral,*
*Supplemental-LRM, Supplemental-Balance sheet and Supplemental-Informational tables.*
Report the fair value under GAAP for each applicable data element.
* In general, report values according to the close-of-business marks on the as-of date. For
loans that are accounted for on an accrual basis, report the most recent available fair
valuation.

## **Rehypothecated**
*This field is only applicable to the Outflows-Secured and Outflows-Deposits tables.* Use this field
to flag (Yes) data elements representing transactions or accounts secured by collateral that
has been rehypothecated. Transactions should not be flagged as rehypothecated if they have
not yet settled.

## **Insured**
*This field is only applicable to the Outflows-Deposits table.* Use this field to identify
balances that are fully insured by the FDIC or other foreign government-sponsored deposit
insurance systems.
- **FDIC**
Refers to deposits fully insured by FDIC deposit insurance.
- **Other**
Refers to deposits that are fully insured by non-US local-jurisdiction government
deposit insurance.
- **Uninsured**
Refers to deposits that are not fully insured by FDIC deposit insurance or other non-
US local-jurisdiction government deposit insurance.

## **Encumbrance Type**
*This field is only applicable to the Inflows-Assets, Inflows-Unsecured, Inflows-Secured and*
*Supplemental-Derivatives & Collateral tables.* Use this field to categorize asset
encumbrances according to the following types:
- **Securities Financing Transaction**
Refers to the encumbrance of assets to transactions reportable in the O.D., O.S and
O.W tables, except for assets pledged to secure Covered Federal Reserve Facility
Funding.
- **Derivative VM**
Refers to the encumbrance of assets delivered to satisfy calls for variation margin in
response to change in the value of derivative positions.
- **Derivative IM and DFC**

Refers to the encumbrance of assets delivered to satisfy initial margin, default fund
contributions or other comparable requirements, where the activity supported by
these encumbrances includes derivatives.
- **Other IM and DFC**
Refers to the encumbrance of assets delivered to satisfy initial margin, default fund
contributions or other comparable requirements, where the activity supported by
these encumbrances does not include derivatives.
- **Segregated for Customer Protection**
Refers to encumbrances due to the segregation of assets held to satisfy customer
protection requirements (e.g., 15c3-3, CFTC residual interest and other customer
money protection requirements).
- **Covered Federal Reserve Facility Funding**
Refers to encumbrance reportable using product O.S.6: Exceptional Central Bank
Operations with a sub-product of Covered Federal Reserve Facility Funding.
- **Other**
Refers to all other types of encumbrance. Use the comments table to provide
additional detail on the underlying type of encumbrance on at least a monthly basis
and in the event of a material change in reported values.

# Appendices
## Appendix II-a: FR 2052a Product/Sub-Product Requirements
The following table displays which products require the reporting of a Sub-Product or Sub-Product 2, along with the corresponding set of acceptable values.

| Table            | PID | Product                       | Sub-Product                       |
|------------------|-----|-------------------------------|-----------------------------------|
| Inflows - Assets | 2   | Capacity                      | Federal Reserve Bank              |
| Inflows - Assets | 2   | Capacity                      | Swiss National Bank               |
| Inflows - Assets | 2   | Capacity                      | Bank of England                   |
| Inflows - Assets | 2   | Capacity                      | European Central Bank             |
| Inflows - Assets | 2   | Capacity                      | Bank of Japan                     |
| Inflows - Assets | 2   | Capacity                      | Reserve Bank of Australia         |
| Inflows - Assets | 2   | Capacity                      | Bank of Canada                    |
| Inflows - Assets | 2   | Capacity                      | Other Central Bank                |
| Inflows - Assets | 2   | Capacity                      | Federal Home Loan Bank            |
| Inflows - Assets | 2   | Capacity                      | Other Government Sponsored Entity |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Federal Reserve Bank              |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Swiss National Bank               |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Bank of England                   |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | European Central Bank             |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Bank of Japan                     |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Reserve Bank of Australia         |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Bank of Canada                    |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Other Central Bank                |
| Inflows - Assets | 3   | Unrestricted Reserve Balances | Currency and Coin                 |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Federal Reserve Bank              |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Swiss National Bank               |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Bank of England                   |
| Inflows - Assets | 4   | Restricted Reserve Balances   | European Central Bank             |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Bank of Japan                     |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Reserve Bank of Australia         |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Bank of Canada                    |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Other Central Bank                |
| Inflows - Assets | 4   | Restricted Reserve Balances   | Currency and Coin                 |

## Appendix II-c: FR 2052a Collateral Class Requirements
The following table displays the applicable reporting requirements for the Collateral Class field by Product:
1. Required: the product by definition requires a collateral class designation
1. Dependent: the product requires a collateral class designation to the extent collateral has been, or would need to be posted or received
1. Not applicable: the product should not be assigned a collateral class

### Inflows - Assets
| PID   | Product                       | Required | 
|-------|-------------------------------|----------|
| I.A.1 | Unencumbered Assets           |         |
| I.A.2 | Capacity                      |         |
| I.A.3 | Unrestricted Reserve Balances |         |
| I.A.4 | Restricted Reserve Balances   |         |
| I.A.5 | Unsettled Asset Purchases     |         |
| I.A.6 | Forward Asset Purchases       |         |
| I.A.7 | Encumbered Assets             |         |

### Outflows - Deposits
| PID    | Product                                       | Required | 
|--------|-----------------------------------------------|----------|
| O.D.1  | Transactional Accounts                        |         |
| O.D.2  | Non-Transactional Relationship Accounts       |         |
| O.D.3  | Non-Transactional Non-Relationship Accounts   |         |
| O.D.4  | Operational Account Balances                  |         |
| O.D.5  | Excess Balances in Operational Accounts       |         |
| O.D.6  | Non-Operational Account Balances              |         |
| O.D.7  | Operational Escrow Accounts                   |         |
| O.D.8  | Non-Reciprocal Brokered Deposits              |         |
| O.D.9  | Stable Affiliated Sweep Account Balances      |         |
| O.D.10 | Less Stable Affiliated Sweep Account Balances |         |
| O.D.11 | Non-Affiliated Sweep Accounts                 |         |
| O.D.12 | Other Product Sweep Accounts                  |         |
| O.D.13 | Reciprocal Accounts                           |         |        
| O.D.14 | Other Third-Party Deposits                    |         |
| O.D.15 | Other Accounts                                |         |

## Appendix III
The following defines the range of acceptable values for the Collateral Class field and categorizes for use in the rule code assigment process. The [Collateral Class] column
is the value. The [Asset Category Description] column is the description of the asset category. The table grouping represents the asset category groupings used in the rule code assignment process.
A Collateral Class is considered HQLA if it's found in the HQLA Level 1 or HQLA Level 2a or HQLA Level 2b tables. 

The rule code assigment process generally needs to know when given a Collateral Class value (found in the first column),
whether it is cash or HQLA and sometimes what level of HQLA it is.

### HQLA Level 1
| Collateral Class | Asset Category Description                                                                                                                                                                                                                 |
|------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| A-0-Q            | Cash                                                                                                                                                                                                                                       |
| A-1-Q            | Debt issued by the U.S. Treasury                                                                                                                                                                                                           |
| A-2-Q            | U.S. Government Agency-issued debt (excluding the US Treasury) with a US Government guarantee                                                                                                                                              |
| A-3-Q            | Vanilla debt (including pass-through MBS) guaranteed by a U.S. Government Agency, where the U.S. Government Agency has a full U.S. Government guarantee                                                                                    |
| A-4-Q            | Structured debt (excluding pass-through MBS) guaranteed by a U.S. Government Agency, where the U.S. Government Agency has a full U.S. Government guarantee                                                                                 |
| A-5-Q            | Other debt with a U.S. Government guarantee                                                                                                                                                                                                |
| S-1-Q            | Debt issued by non-U.S. Sovereigns (excluding central banks) with a 0% RW                                                                                                                                                                  |
| S-2-Q            | Debt issued by multilateral development banks or other supranationals with a 0% RW                                                                                                                                                         |
| S-3-Q            | Debt with a non-U.S. sovereign (excluding central banks) or multilateral development bank or other supranational guarantee, where guaranteeing entity has a 0% RW                                                                          |
| S-4-Q            | Debt issued or guaranteed by a non-U.S. Sovereign (excluding central banks) that does not have a 0% RW, but supports outflows that are in the same jurisdiction of the sovereign and are denominated in the home currency of the sovereign |
| CB-1-Q           | Securities issued or guaranteed by a central bank with a 0% RW                                                                                                                                                                             |                                                                                                                                                                             
| CB-2-Q           | Securities issued or guaranteed by a non-U.S. central bank that does not have a 0% RW, but supports outflows that are in the same jurisdiction of the central bank and are denominated in the home currrency of the central bank           |

### HQLA Level 2a
| Collateral Class | Asset Category Description                                                                                                                                                                 |
|------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| G-1-Q            | Senior to preferred debt issued by a U.S. Government Sponsored Entity (GSE)                                                                                                                |
| G-2-Q            | Vanilla debt (including pass-through MBS) guaranteed by a U.S. GSE                                                                                                                         |
| G-3-Q            | Structured debt (excluding pass-through MBS) guaranteed by a U.S. GSE                                                                                                                      |
| S-5-Q            | Debt issued by non-U.S. Sovereigns (excluding central banks) with a 20% RW, not otherwise included                                                                                         |
| S-6-Q            | Debt issued by multilateral development banks or other supranationals with a 20% RW, not otherwise included                                                                                |
| S-7-Q            | Debt with a non-U.S. sovereign (excluding central banks) or multilateral development bank or other supranational guarantee, where guaranteeing entity has a 20% RW, not otherwise included |
| CB-3-Q           | Securities issued or guaranteed by a non-U.S. central bank with a 20% RW, not otherwise included                                                                                           |

### HQLA Level 2b
| Collateral Class | Asset Category Description                                                                                                                                                                            |
|------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| E-1-Q            | U.S. equities - Russell 1000                                                                                                                                                                          |
| E-2-Q            | Non-U.S. Equities listed on a foreign index designated to by the local supervisor as qualifying for the LCR, and denominated in USD or the currency of outflows that the foreign entity is supporting |
| IG-1-Q           | Investment grade corporate debt                                                                                                                                                                       |
| IG-2-Q           | Investment grade municipal obligations                                                                                                                                                                |


### Non-HQLA Assets that do not meet the asset-specific tests detailed in section 20 of Regulation WW
| Collateral Class | Asset Category Description                                                                                                                                                                                                                 |
|------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| A-2              | U.S. Government Agency-issued debt (excluding the US Treasury) with a US Government guarantee                                                                                                                                              |
| A-3              | Vanilla debt (including pass-through MBS) guaranteed by a U.S. Government Agency, where the U.S. Government Agency has a full U.S. Government guarantee                                                                                    |
| A-4              | Structured debt (excluding pass-through MBS) guaranteed by a U.S. Government Agency, where the U.S. Government Agency has a full U.S. Government guarantee                                                                                 |
| A-5              | Other debt with a U.S. Government guarantee                                                                                                                                                                                                |
| S-1              | Debt issued by non-U.S. Sovereigns (excluding central banks) with a 0% RW                                                                                                                                                                  |
| S-2              | Debt issued by multilateral development banks or other supranationals with a 0% RW                                                                                                                                                         |
| S-3              | Debt with a non-U.S. sovereign (excluding central banks) or multilateral development bank or other supranational guarantee, where guaranteeing entity has a 0% RW                                                                          |
| S-4              | Debt issued or guaranteed by a non-U.S. Sovereign (excluding central banks) that does not have a 0% RW, but supports outflows that are in the same jurisdiction of the sovereign and are denominated in the home currency of the sovereign |
| CB-1             | Securities issued or guaranteed by a central bank with a 0% RW                                                                                                                                                                             |
| CB-2             | Securities issued or guaranteed by a non-U.S. central bank that does not have a 0% RW, but supports outflows that are in the same jurisdiction of the central bank and are denominated in the home currrency of the central bank           |
| G-1              | Senior to preferred debt issued by a U.S. Government Sponsored Entity (GSE)                                                                                                                                                                |
| G-2              | Vanilla debt (including pass-through MBS) guaranteed by a U.S. GSE                                                                                                                                                                         |
| G-3              | Structured debt (excluding pass-through MBS) guaranteed by a U.S. GSE                                                                                                                                                                      |
| S-5              | Debt issued by Non-U.S. Sovereigns with a 20% RW, not otherwise included                                                                                                                                                                   |
| S-6              | Debt issued by multilateral development banks or other supranationals with a 20% RW, not otherwise included                                                                                                                                |
| S-7              | Debt with a non-U.S. sovereign or multilateral development bank or other supranational guarantee, where guaranteeing entity has a 20% RW, not otherwise included                                                                           |
| CB-3             | Securities issued or guaranteed by a non-U.S. central bank with a 20% RW, not otherwise included                                                                                                                                           |
| E-1              | U.S. equities - Russell 1000                                                                                                                                                                                                               |
| E-2              | Non-U.S. Equities listed on a foreign index designated to by the local supervisor as qualifying for the LCR, and denominated in USD or the currency of outflows that the foreign entity is supporting                                      |
| IG-1             | Investment grade corporate debt                                                                                                                                                                                                            |
| IG-2             | Investment grade U.S. municipal general obligations                                                                                                                                                                                        |

| Collateral Class | Asset Category Description                                                                                       |
|------------------|------------------------------------------------------------------------------------------------------------------|
| S-8              | All other debt issued by sovereigns (excluding central banks) and supranational entities, not otherwise included |
| CB-4             | All other securities issued by central banks, not otherwise included                                             |
| G-4              | Debt, other than senior or preferred, issued by a U.S. GSE                                                       |
| E-3              | All other U.S.-listed common equity securities                                                                   |
| E-4              | All other non-US-listed common equity securities                                                                 |
| E-5              | ETFs listed on US exchanges                                                                                      |
| E-6              | ETFs listed on non-US exchanges                                                                                  |
| E-7              | US mutual fund shares                                                                                            |
| E-8              | Non-US mutual fund shares                                                                                        |
| E-9              | All other US equity investments (including preferred shares, warrants and options)                               |
| E-10             | All other non-US equity investments (including preferred shares, warrants and options)                           |
| IG-3             | Investment grade Vanilla ABS                                                                                     |
| IG-4             | Investment grade Structured ABS                                                                                  |
| IG-5             | Investment grade Private label Pass-thru CMBS/RMBS                                                               |
| IG-6             | Investment grade Private label Structured CMBS/RMBS                                                              |
| IG-7             | Investment grade covered bonds                                                                                   |
| IG-8             | Investment grade obligations of municipals/PSEs (excluding U.S. general obligations)                             |
| N-1              | Non-investment grade general obligations issued by U.S. municipals/PSEs                                          |
| N-2              | Non-investment grade corporate debt                                                                              |
| N-3              | Non-investment grade Vanilla ABS                                                                                 |
| N-4              | Non-investment grade structured ABS                                                                              |
| N-5              | Non-investment grade Private label Pass-thru CMBS/RMBS                                                           |
| N-6              | Non-investment grade Private label Structured CMBS/RMBS                                                          |
| N-7              | Non-investment grade covered bonds                                                                               |
| N-8              | Non-investment grade obligations of municipals/PSEs (excluding U.S. general obligations)                         |
| L-1              | GSE-eligible conforming residential mortgages                                                                    |
| L-2              | Other GSE-eligible loans                                                                                         |
| L-3              | Other 1-4 family residential mortgages                                                                           |
| L-4              | Other multi family residential mortgages                                                                         |
| L-5              | Home equity loans                                                                                                |
| L-6              | Credit card loans                                                                                                |
| L-7              | Auto loans and leases                                                                                            |
| L-8              | Other consumer loans and leases                                                                                  |
| L-9              | Commercial real estate loans                                                                                     |
| L-10             | Commercial and industrial loans                                                                                  |
| L-11             | All other loans, except loans guaranteed by U.S. government agencies                                             |
| L-12             | Loans guaranteed by U.S. government agencies                                                                     |
| Y-1              | Debt issued by reporting firm - parent                                                                           |
| Y-2              | Debt issued by reporting firm - bank                                                                             |
| Y-3              | Debt issued by reporting firm - all other (incl. conduits)                                                       |
| Y-4              | Equity investment in affiliates                                                                                  |
| C-1              | Commodities                                                                                                      |
| P-1              | Residential property                                                                                             |
| P-2              | All other physical property                                                                                      |
| LC-1             | Letters of credit issued by a GSE                                                                                |
| LC-2             | All other letters of credit, including bankers' acceptances                                                      |
| Z-1              | All other assets                                                                                                 |

## Appendix IV
The following applies to calculating a Maturity Bucket from a maturity date relative to the reorting date.

### Calculation of Maturity Bucket from Maturity Date against a reporting date
#### Definition of the Maturity Buckets
Day 1
Day 2
Day 3
Day 4
Day 5
Day 6
Day 7
Day 8
Day 9
Day 10
Day 11
Day 12
Day 13
Day 14
Day 15
Day 16
Day 17
Day 18
Day 19
Day 20
Day 21
Day 22
Day 23
Day 24
Day 25
Day 26
Day 27
Day 28
Day 29
Day 30
Day 31
Day 32
Day 33
Day 34
Day 35
Day 36
Day 37
Day 38
Day 39
Day 40
Day 41
Day 42
Day 43
Day 44
Day 45
Day 46
Day 47
Day 48
Day 49
Day 50
Day 51
Day 52
Day 53
Day 54
Day 55
Day 56
Day 57
Day 58
Day 59
Day 60
61 - 67 Days
68 - 74 Days
75 - 82 Days
83 - 90 Days
91 - 120 Days
121 - 150 Days
151 - 179 Days
180 - 270 Days
271 - 364 Days
>= 1 Yr <= 2 Yr
>2 Yr <= 3 Yr
>3 Yr <= 4 Yr
>4 Yr <= 5 Yr
>5 Yr    
Perpetual
