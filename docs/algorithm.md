# Algorithm

This describes, at the level covered by the paper's public abstract, how
the morphological synthesizer works. It is a summary for orientation —
refer to the paper itself for the full linguistic and evaluation detail:
https://aclanthology.org/2024.rail-1.11/

## Approach

The synthesizer is **rule-based**: it generates a Ge'ez surface word form
from a root by applying the language's morphological patterns (templatic
and affixal), rather than using a statistical or neural model. At a high
level, synthesis works as:

1. Take a root (radical consonants) and a target pattern / grammatical
   feature set (e.g. verb class, person, number, gender, tense/aspect).
2. Look up the affixation rule(s) that apply for that pattern and feature
   set (see `data/raw/affixes.tsv`).
3. Apply the rule to the root to produce the surface form — regular verbs
   follow the general affixation rules directly; irregular verbs require
   verb-specific handling (see `data/raw/irregular_verbs.tsv`).

## Evaluation

The paper evaluates the synthesizer on 1,102 sample verbs, covering all
verb morphological structures, reporting 97.4% accuracy against a
baseline model.

## Scope of this repository

This repository provides the **data** (affix inventory and verb samples)
and this **algorithm description**, matching what the paper itself
presents — it is not a packaged software library. If you implement the
rules above in code, consider contributing it back here alongside the
data it was built from.
