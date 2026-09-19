# Data

Input data for the rule-based morphological synthesizer described in the paper.

## `raw/affixes.tsv`

Columns: `name`, `prefix`, `suffix`, `conditions`.
One row per affixation rule (prefix and/or suffix applied to a root/stem,
with the conditions under which it applies — verb class, person, number,
gender, tense/aspect, etc.).

## `raw/regular_verbs.tsv`

Columns: `root`, `pattern`, `surface_form`, `features`.
Regular-verb roots paired with their correct surface forms.

## `raw/irregular_verbs.tsv`

Columns: `root`, `pattern`, `surface_form`, `features`, `irregularity_note`.
Same as above, for verbs that deviate from the regular rules.

## Status

These files currently hold only header rows and `TODO` markers — populate
them with the actual dataset used in the paper (it reports **1,102 sample
verbs** covering all verb morphological structures, evaluated at 97.4%
accuracy). If any part of the data has licensing or community-consent
restrictions on public release, keep it out of version control and note
how to request it instead.
