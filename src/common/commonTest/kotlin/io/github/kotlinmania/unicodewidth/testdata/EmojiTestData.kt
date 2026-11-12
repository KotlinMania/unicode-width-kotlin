// port-lint: tests tests/tests.rs
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

// Exact checked-in Unicode 16.0 emoji-test.txt lines, without runtime filesystem access.
internal fun emojiTestLines(): Sequence<String> =
    sequenceOf(
        ::emojiTestLinesPart01,
        ::emojiTestLinesPart02,
        ::emojiTestLinesPart03,
        ::emojiTestLinesPart04,
        ::emojiTestLinesPart05,
        ::emojiTestLinesPart06,
    ).flatMap { it().asSequence() }
