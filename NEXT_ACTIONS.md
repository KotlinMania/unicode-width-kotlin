# Immediate Actions - High-Value Files

Based on AST analysis, here are the concrete next steps.

## Summary

- **Files Present:** 2/2 (100.0%)
- **Function parity:** 27/30 matched (target 39) — 90.0%
- **Class/type parity:** 7/7 matched (target 7) — 100.0%
- **Combined symbol parity:** 34/37 matched (target 46) — 91.9%
- **Average inline-code cosine:** 0.55 (function body across 1 matched files)
- **Average documentation cosine:** 0.93 (doc text across 1 matched files)
- **Cheat-zeroed Files:** 0
- **Critical Issues:** 2 files with <0.60 function similarity

## Priority 1: Fix Incomplete High-Dependency Files

No incomplete high-dependency files detected.

## Priority 2: Port Missing High-Value Files

Critical missing files (>10 dependencies):

No missing high-value files detected.

## Detailed Work Items

Every matched file is listed below with function and type symbol parity.

### 1. tables

- **Target:** `unicodewidth.Tables`
- **Similarity:** 0.55
- **Dependents:** 0
- **Priority Score:** 33204.5
- **Functions:** 25/28 matched (target 31)
- **Missing functions:** `str_width_test`, `str_width_test_cjk`, `test_normalization`
- **Types:** 4/4 matched
- **Missing types:** _none_
- **Tests:** 0/3 matched

### 2. lib

- **Target:** `unicodewidth.CrateDoc [STUB]`
- **Similarity:** 0.27
- **Dependents:** 0
- **Priority Score:** 507.3
- **Functions:** 2/2 matched (target 8)
- **Missing functions:** _none_
- **Types:** 3/3 matched
- **Missing types:** _none_

## Success Criteria

For each file to be considered "complete":
- **Similarity ≥ 0.85** (Excellent threshold)
- All public APIs ported
- All tests ported
- Documentation ported
- port-lint header present

