# Immediate Actions - High-Value Files

Based on AST analysis, here are the concrete next steps.

## Summary

- **Files Present:** 2/2 (100.0%)
- **Function parity:** 24/30 matched (target 36) — 80.0%
- **Class/type parity:** 1/7 matched (target 1) — 14.3%
- **Combined symbol parity:** 25/37 matched (target 37) — 67.6%
- **Average inline-code cosine:** 0.00 (function body across 1 matched files)
- **Average documentation cosine:** 0.94 (doc text across 1 matched files)
- **Cheat-zeroed Files:** 1
- **Critical Issues:** 2 files with <0.60 function similarity

## Priority 1: Fix Incomplete High-Dependency Files

No incomplete high-dependency files detected.

## Priority 2: Port Missing High-Value Files

Critical missing files (>10 dependencies):

No missing high-value files detected.

## Detailed Work Items

Every matched file is listed below with function and type symbol parity.

### 1. tables

- **Target:** `unicodewidth.Tables [ZERO] [PROVENANCE-FALLBACK]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 93210.0
- **Functions:** 22/28 matched
- **Missing functions:** `is_vs1_2`, `set_vs1_2`, `unset_vs1_2`, `str_width_test`, `str_width_test_cjk`, `test_normalization`
- **Types:** 1/4 matched (target 1)
- **Missing types:** `Align32`, `Align64`, `Align128`
- **Tests:** 0/3 matched
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `src/tables.rs` vs expected `tables.rs`
- **Proposed provenance header:** `// port-lint: source tables.rs` (current: `// port-lint: source src/tables.rs`)
- **Lint issues:** 1

### 2. lib

- **Target:** `unicodewidth.CrateDoc [STUB]`
- **Similarity:** 0.27
- **Dependents:** 0
- **Priority Score:** 30507.3
- **Functions:** 2/2 matched (target 8)
- **Missing functions:** _none_
- **Types:** 0/3 matched (target 0)
- **Missing types:** `Sealed`, `UnicodeWidthChar`, `UnicodeWidthStr`

## Success Criteria

For each file to be considered "complete":
- **Similarity ≥ 0.85** (Excellent threshold)
- All public APIs ported
- All tests ported
- Documentation ported
- port-lint header present
