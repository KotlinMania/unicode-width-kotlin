# unicode-width-kotlin in Kotlin

[![GitHub link](https://img.shields.io/badge/GitHub-KotlinMania%2Funicode--width--kotlin-blue.svg)](https://github.com/KotlinMania/unicode-width-kotlin)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.kotlinmania/unicode-width-kotlin)](https://central.sonatype.com/artifact/io.github.kotlinmania/unicode-width-kotlin)
[![Build status](https://img.shields.io/github/actions/workflow/status/KotlinMania/unicode-width-kotlin/ci.yml?branch=main)](https://github.com/KotlinMania/unicode-width-kotlin/actions)

This is a Kotlin Multiplatform line-by-line transliteration port of [`unicode-rs/unicode-width`](https://github.com/unicode-rs/unicode-width).

**Original Project:** This port is based on [`unicode-rs/unicode-width`](https://github.com/unicode-rs/unicode-width). All design credit and project intent belong to the upstream authors; this repository is a faithful port to Kotlin Multiplatform with no behavioural changes intended.

### Porting status

This is an **in-progress port**. The goal is feature parity with the upstream Rust crate while providing a native Kotlin Multiplatform API. Every Kotlin file carries a `// port-lint: source <path>` header naming its upstream Rust counterpart so the AST-distance tool can track provenance.

---

## Upstream README — `unicode-rs/unicode-width`

> The text below is reproduced and lightly edited from [`https://github.com/unicode-rs/unicode-width`](https://github.com/unicode-rs/unicode-width). It is the upstream project's own description and remains under the upstream authors' authorship; links have been rewritten to absolute upstream URLs so they continue to resolve from this repository.

## `unicode-width`

[![Build status](https://github.com/unicode-rs/unicode-width/actions/workflows/rust.yml/badge.svg)](https://github.com/unicode-rs/unicode-width/actions/workflows/rust.yml)
[![crates.io version](https://img.shields.io/crates/v/unicode-width)](https://crates.io/crates/unicode-width)
[![Docs status](https://img.shields.io/docsrs/unicode-width)](https://docs.rs/unicode-width/)

Determine displayed width of `char` and `str` types according to [Unicode Standard Annex #11][UAX11]
and other portions of the Unicode standard.

This crate is `#![no_std]`.

[UAX11]: http://www.unicode.org/reports/tr11/

```rust
use unicode_width::UnicodeWidthStr;

fn main() {
    let teststr = "Ｈｅｌｌｏ, ｗｏｒｌｄ!";
    let width = teststr.width();
    println!("{}", teststr);
    println!("The above string is {} columns wide.", width);
    let width = teststr.width_cjk();
    println!("The above string is {} columns wide (CJK).", width);
}
```

**NOTE:** The computed width values may not match the actual rendered column
width. For example, many Brahmic scripts like Devanagari have complex rendering rules
which this crate does not currently handle (and will never fully handle, because
the exact rendering depends on the font):

```rust
extern crate unicode_width;
use unicode_width::UnicodeWidthStr;

fn main() {
    assert_eq!("क".width(), 1); // Devanagari letter Ka
    assert_eq!("ष".width(), 1); // Devanagari letter Ssa
    assert_eq!("क्ष".width(), 2); // Ka + Virama + Ssa
}
```

Additionally, [defective combining character sequences](https://unicode.org/glossary/#defective_combining_character_sequence)
and nonstandard [Korean jamo](https://unicode.org/glossary/#jamo) sequences may
be rendered with a different width than what this crate says. (This is not an
exhaustive list.) For a list of what this crate *does* handle, see
[docs.rs](https://docs.rs/unicode-width/latest/unicode_width/#rules-for-determining-width).

## crates.io

You can use this package in your project by adding the following
to your `Cargo.toml`:

```toml
[dependencies]
unicode-width = "0.2"
```


## Changelog


### 0.2.0

 - Treat `\n` as width 1 (#60)
 - Treat ambiguous `Modifier_Letter`s as narrow (#63)
 - Support `Grapheme_Cluster_Break=Prepend` (#62)
 - Support lots of ligatures (#53)

Note: If you are using `unicode-width` for linebreaking, the change treating `\n` as width 1 _may cause behavior changes_. It is recommended that in such cases you feed already-line segmented text to `unicode-width`. In other words, please apply higher level control character based line breaking protocols before feeding text to `unicode-width`. Relying on any character producing a stable width in this crate is likely the sign of a bug.

---

## About this Kotlin port

### Installation

```kotlin
dependencies {
    implementation("io.github.kotlinmania:unicode-width-kotlin:0.1.0")
}
```

### Building

```bash
./gradlew build
./gradlew test
```

### Targets

- macOS arm64
- Linux x64
- Windows mingw-x64
- iOS arm64 / simulator-arm64 (Swift export + XCFramework)
- JS (browser + Node.js)
- Wasm-JS (browser + Node.js)
- Android (API 24+)

### Porting guidelines

See [AGENTS.md](AGENTS.md) and [CLAUDE.md](CLAUDE.md) for translator discipline, port-lint header convention, and Rust → Kotlin idiom mapping.

### License

This Kotlin port is distributed under the same MIT license as the upstream [`unicode-rs/unicode-width`](https://github.com/unicode-rs/unicode-width). See [LICENSE](LICENSE) (and any sibling `LICENSE-*` / `NOTICE` files mirrored from upstream) for the full text.

Original work copyrighted by the unicode-width authors.  
Kotlin port: Copyright (c) 2026 Sydney Renee and The Solace Project.

### Acknowledgments

Thanks to the [`unicode-rs/unicode-width`](https://github.com/unicode-rs/unicode-width) maintainers and contributors for the original Rust implementation. This port reproduces their work in Kotlin Multiplatform; bug reports about upstream design or behavior should go to the upstream repository.
