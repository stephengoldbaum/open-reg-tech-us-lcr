# Tables

## Assets
| Column                    | Type    | Required |
|---------------------------|---------|----------|
| Product                   | text    | yes      | 
| Sub-Product               | text    | no       |
| Market Value              | numeric | yes      |
| Currency                  | text    | yes      |
| Converted Market Value    | text    | yes      |
| Maturity Bucket           | text    | yes      |
| Forward Start Amount      | numeric | no       |
| Forward Start Bucket      | text    | no       |
| Collateral Class          | text    | yes      |
| Treasury Control          | text    | yes      |
| Encumbrance Type          | text    | yes      |

## Deposits
| Column                 | Type    | Required |
|------------------------|---------|----------|
| Product                | text    | yes      |
| Counterparty           | text    | yes      |
| Currency               | text    | yes      |
| Converted Market Value | text    | yes      |
| Maturity Amount        | numeric | yes      |
| Maturity Bucket        | text    | yes      |
| Collateral Class       | text    | no       |
| Collateral Value       | numeric | no       |
| Insured                | text    | yes      |
| Rehypothecated         | text    | no       |
