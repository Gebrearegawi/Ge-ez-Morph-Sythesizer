# Ge'ez Morphological Synthesizer

Data and algorithm description for:

> **Morphological Synthesizer for Ge'ez Language: Addressing Morphological Complexity and Resource Limitations**
> Gebrearegawi Gebremariam Gidey, Hailay Kidu Teklehaymanot, Gebregewergs Mezgebe Atsbha
> *Proceedings of the Fifth Workshop on Resources for African Indigenous Languages @ LREC-COLING 2024*, pages 94–106, Torino, Italia. ELRA and ICCL.
> [Paper (ACL Anthology)](https://aclanthology.org/2024.rail-1.11/) · [PDF](https://aclanthology.org/2024.rail-1.11.pdf)

## About

Ge'ez is a Semitic language with rich inflectional and derivational
morphology that has historically lacked functional NLP systems due to
scarce annotated data and resources. This work presents a **rule-based
morphological synthesizer**: it generates surface word forms from root
words by applying the language's morphological (templatic/affixal)
patterns. The system was evaluated on 1,102 sample verbs covering the
language's verb morphological structures, reaching 97.4% accuracy.

This repository holds the **affix inventory and verb data** used for
the synthesizer, together with a plain-language description of how the
algorithm works — matching what the paper itself provides. It is not a
packaged software library.

## How it works

See [`docs/algorithm.md`](docs/algorithm.md) for a summary of the
rule-based synthesis approach (root + pattern → surface form via
affixation rules, with separate handling for regular and irregular
verbs).

## Repository structure

```
.
├── data/
│   ├── README.md                 # Schema for each data file
│   └── raw/
│       ├── affixes.tsv           # Affix inventory used by the rules
│       ├── regular_verbs.tsv     # Regular-verb root/pattern samples
│       └── irregular_verbs.tsv   # Irregular-verb root/pattern samples
├── docs/
│   ├── paper.md                  # Paper metadata, abstract, citation
│   └── algorithm.md              # How the synthesizer works
├── CITATION.cff
├── LICENSE
└── README.md
```

## Data

`data/raw/` currently contains header rows only, describing the schema
each file expects. Populate them with the actual affix rules and the
1,102 sample verbs (regular and irregular) used in the paper. See
[`data/README.md`](data/README.md) for column definitions.

## Citation

If you use this data, please cite the paper:

```bibtex
@inproceedings{gidey-etal-2024-morphological,
    title = "Morphological Synthesizer for {G}e{'}ez Language: Addressing Morphological Complexity and Resource Limitations",
    author = "Gidey, Gebrearegawi Gebremariam  and
      Teklehaymanot, Hailay Kidu  and
      Atsbha, Gebregewergs Mezgebe",
    editor = "Mabuya, Rooweither  and
      Matfunjwa, Muzi  and
      Setaka, Mmasibidi  and
      van Zaanen, Menno",
    booktitle = "Proceedings of the Fifth Workshop on Resources for African Indigenous Languages @ LREC-COLING 2024",
    month = may,
    year = "2024",
    address = "Torino, Italia",
    publisher = "ELRA and ICCL",
    url = "https://aclanthology.org/2024.rail-1.11/",
    pages = "94--106"
}
```

## License

Released under the MIT License (see `LICENSE`). If the underlying data
has different reuse terms, update this section before publishing.

## Contact

- Gebrearegawi Gebremariam Gidey
- Hailay Kidu Teklehaymanot — teklehaymanot@l3s.de
- Gebregewergs Mezgebe Atsbha
