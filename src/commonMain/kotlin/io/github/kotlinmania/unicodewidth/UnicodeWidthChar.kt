// Copyright 2012-2025 The Rust Project Developers. See the COPYRIGHT
// file at the top-level directory of this distribution and at
// http://rust-lang.org/COPYRIGHT.
//
// Licensed under the Apache License, Version 2.0 <LICENSE-APACHE or
// http://www.apache.org/licenses/LICENSE-2.0> or the MIT license
// <LICENSE-MIT or http://opensource.org/licenses/MIT>, at your
// option. This file may not be copied, modified, or distributed
// except according to those terms.
package io.github.kotlinmania.unicodewidth

/**
 * Methods for determining displayed width of Unicode characters.
 */
public interface UnicodeWidthChar {
    /**
     * Returns the character's displayed width in columns, or `null` if the
     * character is a control character.
     *
     * This function treats characters in the Ambiguous category according
     * to [Unicode Standard Annex #11](http://www.unicode.org/reports/tr11/)
     * as 1 column wide. This is consistent with the recommendations for non-CJK
     * contexts, or when the context cannot be reliably determined.
     */
    public fun width(): Int?

    /**
     * Returns the character's displayed width in columns, or `null` if the
     * character is a control character.
     *
     * This function treats characters in the Ambiguous category according
     * to [Unicode Standard Annex #11](http://www.unicode.org/reports/tr11/)
     * as 2 columns wide. This is consistent with the recommendations for
     * CJK contexts.
     */
    public fun widthCjk(): Int?
}

/**
 * Returns the code point's displayed width in columns, or `null` if the
 * code point is a control character.
 *
 * This function treats characters in the Ambiguous category according
 * to [Unicode Standard Annex #11](http://www.unicode.org/reports/tr11/)
 * as 1 column wide. This is consistent with the recommendations for non-CJK
 * contexts, or when the context cannot be reliably determined.
 */
public fun Int.unicodeWidth(): Int? = singleCharWidth(this)

/**
 * Returns the code point's displayed width in columns, or `null` if the
 * code point is a control character.
 *
 * This function treats characters in the Ambiguous category according
 * to [Unicode Standard Annex #11](http://www.unicode.org/reports/tr11/)
 * as 2 columns wide. This is consistent with the recommendations for
 * CJK contexts.
 */
public fun Int.unicodeWidthCjk(): Int? = singleCharWidthCjk(this)
