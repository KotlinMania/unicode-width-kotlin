// port-lint: tests src/tables.rs
// Copyright 2012-2025 The Rust Project Developers. See the COPYRIGHT
// file at the top-level directory of this distribution and at
// http://rust-lang.org/COPYRIGHT.
//
// Licensed under the Apache License, Version 2.0 <LICENSE-APACHE or
// http://www.apache.org/licenses/LICENSE-2.0> or the MIT license
// <LICENSE-MIT or http://opensource.org/licenses/MIT>, at your
// option. This file may not be copied, modified, or distributed
// except according to those terms.

package io.github.kotlinmania.unicodewidth.testdata

// All 19,965 original tuples, in source order. No normalization is computed here.
internal fun normalizationTestData(): Sequence<List<String>> =
    sequenceOf(
        ::normalizationTestPart01,
        ::normalizationTestPart02,
        ::normalizationTestPart03,
        ::normalizationTestPart04,
        ::normalizationTestPart05,
        ::normalizationTestPart06,
        ::normalizationTestPart07,
        ::normalizationTestPart08,
        ::normalizationTestPart09,
        ::normalizationTestPart10,
        ::normalizationTestPart11,
        ::normalizationTestPart12,
        ::normalizationTestPart13,
        ::normalizationTestPart14,
        ::normalizationTestPart15,
        ::normalizationTestPart16,
        ::normalizationTestPart17,
        ::normalizationTestPart18,
        ::normalizationTestPart19,
        ::normalizationTestPart20,
    ).flatMap { it().asSequence() }
