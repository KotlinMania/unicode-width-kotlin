# port-lint Proposed Changes

**Generated:** 2026-05-23
**Source:** tmp/unicode-width/src
**Target:** src/commonMain/kotlin/io/github/kotlinmania/unicodewidth

These are review proposals only. They are emitted when a Rust -> Kotlin pair matches only after fallback normalization, so the existing `port-lint` header is not an exact provenance match.

| Target file | Current header | Proposed header | Source path | Reason |
|-------------|----------------|-----------------|-------------|--------|
| `src/commonMain/kotlin/io/github/kotlinmania/unicodewidth/Tables.kt` | `// port-lint: source src/tables.rs` | `// port-lint: source tables.rs` | `tables.rs` | `port-lint provenance header matched only after fallback normalization: 'src/tables.rs' vs expected 'tables.rs'` |
