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

package io.github.kotlinmania.unicodewidth

import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart01Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart01Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart01Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart01Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart02Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart02Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart02Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart02Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart03Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart03Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart03Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart03Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart04Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart04Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart04Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart04Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart05Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart05Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart05Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart05Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart06Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart06Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart06Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart06Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart07Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart07Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart07Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart07Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart08Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart08Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart08Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart08Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart09Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart09Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart09Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart09Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart10Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart10Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart10Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart10Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart11Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart11Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart11Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart11Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart12Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart12Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart12Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart12Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart13Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart13Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart13Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart13Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart14Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart14Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart14Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart14Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart15Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart15Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart15Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart15Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart16Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart16Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart16Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart16Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart17Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart17Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart17Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart17Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart18Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart18Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart18Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart18Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart19Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart19Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart19Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart19Chunk4
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart20Chunk1
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart20Chunk2
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart20Chunk3
import io.github.kotlinmania.unicodewidth.testdata.normalizationTestPart20Chunk4
import kotlin.test.Test
import kotlin.test.assertEquals

// The upstream loop is partitioned only to let browser test runners service heartbeats.
// Each original tuple and its 41 normal / 42 CJK states is checked exactly once.
class TablesTestPart01 {
    // Original NORMALIZATION_TEST rows 1..250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart01Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 251..500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart01Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 501..750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart01Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 751..1000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart01Chunk4(), 250)
    }
}

class TablesTestPart02 {
    // Original NORMALIZATION_TEST rows 1001..1250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart02Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 1251..1500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart02Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 1501..1750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart02Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 1751..2000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart02Chunk4(), 250)
    }
}

class TablesTestPart03 {
    // Original NORMALIZATION_TEST rows 2001..2250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart03Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 2251..2500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart03Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 2501..2750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart03Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 2751..3000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart03Chunk4(), 250)
    }
}

class TablesTestPart04 {
    // Original NORMALIZATION_TEST rows 3001..3250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart04Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 3251..3500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart04Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 3501..3750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart04Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 3751..4000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart04Chunk4(), 250)
    }
}

class TablesTestPart05 {
    // Original NORMALIZATION_TEST rows 4001..4250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart05Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 4251..4500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart05Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 4501..4750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart05Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 4751..5000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart05Chunk4(), 250)
    }
}

class TablesTestPart06 {
    // Original NORMALIZATION_TEST rows 5001..5250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart06Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 5251..5500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart06Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 5501..5750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart06Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 5751..6000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart06Chunk4(), 250)
    }
}

class TablesTestPart07 {
    // Original NORMALIZATION_TEST rows 6001..6250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart07Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 6251..6500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart07Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 6501..6750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart07Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 6751..7000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart07Chunk4(), 250)
    }
}

class TablesTestPart08 {
    // Original NORMALIZATION_TEST rows 7001..7250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart08Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 7251..7500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart08Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 7501..7750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart08Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 7751..8000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart08Chunk4(), 250)
    }
}

class TablesTestPart09 {
    // Original NORMALIZATION_TEST rows 8001..8250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart09Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 8251..8500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart09Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 8501..8750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart09Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 8751..9000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart09Chunk4(), 250)
    }
}

class TablesTestPart10 {
    // Original NORMALIZATION_TEST rows 9001..9250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart10Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 9251..9500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart10Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 9501..9750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart10Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 9751..10000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart10Chunk4(), 250)
    }
}

class TablesTestPart11 {
    // Original NORMALIZATION_TEST rows 10001..10250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart11Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 10251..10500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart11Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 10501..10750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart11Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 10751..11000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart11Chunk4(), 250)
    }
}

class TablesTestPart12 {
    // Original NORMALIZATION_TEST rows 11001..11250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart12Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 11251..11500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart12Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 11501..11750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart12Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 11751..12000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart12Chunk4(), 250)
    }
}

class TablesTestPart13 {
    // Original NORMALIZATION_TEST rows 12001..12250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart13Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 12251..12500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart13Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 12501..12750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart13Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 12751..13000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart13Chunk4(), 250)
    }
}

class TablesTestPart14 {
    // Original NORMALIZATION_TEST rows 13001..13250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart14Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 13251..13500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart14Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 13501..13750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart14Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 13751..14000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart14Chunk4(), 250)
    }
}

class TablesTestPart15 {
    // Original NORMALIZATION_TEST rows 14001..14250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart15Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 14251..14500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart15Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 14501..14750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart15Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 14751..15000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart15Chunk4(), 250)
    }
}

class TablesTestPart16 {
    // Original NORMALIZATION_TEST rows 15001..15250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart16Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 15251..15500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart16Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 15501..15750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart16Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 15751..16000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart16Chunk4(), 250)
    }
}

class TablesTestPart17 {
    // Original NORMALIZATION_TEST rows 16001..16250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart17Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 16251..16500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart17Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 16501..16750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart17Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 16751..17000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart17Chunk4(), 250)
    }
}

class TablesTestPart18 {
    // Original NORMALIZATION_TEST rows 17001..17250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart18Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 17251..17500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart18Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 17501..17750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart18Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 17751..18000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart18Chunk4(), 250)
    }
}

class TablesTestPart19 {
    // Original NORMALIZATION_TEST rows 18001..18250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart19Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 18251..18500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart19Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 18501..18750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart19Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 18751..19000.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart19Chunk4(), 250)
    }
}

class TablesTestPart20 {
    // Original NORMALIZATION_TEST rows 19001..19250.
    @Test
    fun testNormalizationChunk1() {
        assertNormalizationPartition(normalizationTestPart20Chunk1(), 250)
    }

    // Original NORMALIZATION_TEST rows 19251..19500.
    @Test
    fun testNormalizationChunk2() {
        assertNormalizationPartition(normalizationTestPart20Chunk2(), 250)
    }

    // Original NORMALIZATION_TEST rows 19501..19750.
    @Test
    fun testNormalizationChunk3() {
        assertNormalizationPartition(normalizationTestPart20Chunk3(), 250)
    }

    // Original NORMALIZATION_TEST rows 19751..19965.
    @Test
    fun testNormalizationChunk4() {
        assertNormalizationPartition(normalizationTestPart20Chunk4(), 215)
    }
}

// Like Rust assert_eq!, format diagnostics only on failure; every comparison still executes.
private fun assertNormalizationPartition(entries: List<List<String>>, expectedCases: Int) {
    var cases = 0
    for (entry in entries) {
        val orig = entry[0]
        val nfc = entry[1]
        val nfd = entry[2]
        val nfkc = entry[3]
        val nfkd = entry[4]
        for (init in normalizationTestWidths) {
            val expectedWidth1 = strWidthTest(orig, init)
            val actualWidth1 = strWidthTest(nfc, init)
            assertEquals(
                expectedWidth1,
                actualWidth1,
                if (expectedWidth1 != actualWidth1) "width of X = $orig differs from toNFC(X) = $nfc with mode $init" else null,
            )
            val expectedWidth2 = strWidthTest(orig, init)
            val actualWidth2 = strWidthTest(nfd, init)
            assertEquals(
                expectedWidth2,
                actualWidth2,
                if (expectedWidth2 != actualWidth2) "width of X = $orig differs from toNFD(X) = $nfd with mode $init" else null,
            )
            val expectedWidth3 = strWidthTest(nfkc, init)
            val actualWidth3 = strWidthTest(nfkd, init)
            assertEquals(
                expectedWidth3,
                actualWidth3,
                if (expectedWidth3 != actualWidth3) "width of toNFKC(X) = $nfkc differs from toNFKD(X) = $nfkd with mode $init" else null,
            )
        }
        for (init in normalizationTestWidthsCjk) {
            val expectedWidth4 = strWidthTestCjk(orig, init)
            val actualWidth4 = strWidthTestCjk(nfc, init)
            assertEquals(
                expectedWidth4,
                actualWidth4,
                if (expectedWidth4 != actualWidth4) "CJK width of X = $orig differs from toNFC(X) = $nfc with mode $init" else null,
            )
            val expectedWidth5 = strWidthTestCjk(orig, init)
            val actualWidth5 = strWidthTestCjk(nfd, init)
            assertEquals(
                expectedWidth5,
                actualWidth5,
                if (expectedWidth5 != actualWidth5) "CJK width of X = $orig differs from toNFD(X) = $nfd with mode $init" else null,
            )
            val expectedWidth6 = strWidthTestCjk(nfkc, init)
            val actualWidth6 = strWidthTestCjk(nfkd, init)
            assertEquals(
                expectedWidth6,
                actualWidth6,
                if (expectedWidth6 != actualWidth6) "CJK width of toNFKC(X) = $nfkc differs from toNFKD(X) = $nfkd with mode $init" else null,
            )
        }
        cases++
    }
    assertEquals(expectedCases, cases)
}

// Original initial states, independently retained in source order. The existing
// reverse scalar folds are safe for this corpus: each input has at most 18 scalars.
private val normalizationTestWidths: List<WidthInfo> =
    listOf(
        WidthInfo.DEFAULT,
        WidthInfo.LINE_FEED,
        WidthInfo.EMOJI_MODIFIER,
        WidthInfo.REGIONAL_INDICATOR,
        WidthInfo.SEVERAL_REGIONAL_INDICATOR,
        WidthInfo.EMOJI_PRESENTATION,
        WidthInfo.ZWJ_EMOJI_PRESENTATION,
        WidthInfo.VS16_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.KEYCAP_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.VS16_KEYCAP_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.REGIONAL_INDICATOR_ZWJ_PRESENTATION,
        WidthInfo.EVEN_REGIONAL_INDICATOR_ZWJ_PRESENTATION,
        WidthInfo.ODD_REGIONAL_INDICATOR_ZWJ_PRESENTATION,
        WidthInfo.TAG_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_D1_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_D2_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_D3_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A1_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A2_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A3_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A4_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A5_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A6_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.KIRAT_RAI_VOWEL_SIGN_E,
        WidthInfo.KIRAT_RAI_VOWEL_SIGN_AI,
        WidthInfo.VARIATION_SELECTOR_1_OR_2,
        WidthInfo.VARIATION_SELECTOR_15,
        WidthInfo.VARIATION_SELECTOR_16,
        WidthInfo.JOINING_GROUP_ALEF,
        WidthInfo.HEBREW_LETTER_LAMED,
        WidthInfo.ZWJ_HEBREW_LETTER_LAMED,
        WidthInfo.BUGINESE_LETTER_YA,
        WidthInfo.ZWJ_BUGINESE_LETTER_YA,
        WidthInfo.BUGINESE_VOWEL_SIGN_I_ZWJ_LETTER_YA,
        WidthInfo.TIFINAGH_CONSONANT,
        WidthInfo.ZWJ_TIFINAGH_CONSONANT,
        WidthInfo.TIFINAGH_JOINER_CONSONANT,
        WidthInfo.LISU_TONE_LETTER_MYA_NA_JEU,
        WidthInfo.OLD_TURKIC_LETTER_ORKHON_I,
        WidthInfo.ZWJ_OLD_TURKIC_LETTER_ORKHON_I,
        WidthInfo.KHMER_COENG_ELIGIBLE_LETTER,
    )

private val normalizationTestWidthsCjk: List<WidthInfo> =
    listOf(
        WidthInfo.DEFAULT,
        WidthInfo.LINE_FEED,
        WidthInfo.EMOJI_MODIFIER,
        WidthInfo.REGIONAL_INDICATOR,
        WidthInfo.SEVERAL_REGIONAL_INDICATOR,
        WidthInfo.EMOJI_PRESENTATION,
        WidthInfo.ZWJ_EMOJI_PRESENTATION,
        WidthInfo.VS16_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.KEYCAP_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.VS16_KEYCAP_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.REGIONAL_INDICATOR_ZWJ_PRESENTATION,
        WidthInfo.EVEN_REGIONAL_INDICATOR_ZWJ_PRESENTATION,
        WidthInfo.ODD_REGIONAL_INDICATOR_ZWJ_PRESENTATION,
        WidthInfo.TAG_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_D1_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_D2_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_D3_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A1_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A2_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A3_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A4_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A5_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.TAG_A6_END_ZWJ_EMOJI_PRESENTATION,
        WidthInfo.KIRAT_RAI_VOWEL_SIGN_E,
        WidthInfo.KIRAT_RAI_VOWEL_SIGN_AI,
        WidthInfo.VARIATION_SELECTOR_1_OR_2,
        WidthInfo.VARIATION_SELECTOR_16,
        WidthInfo.JOINING_GROUP_ALEF,
        WidthInfo.COMBINING_LONG_SOLIDUS_OVERLAY,
        WidthInfo.SOLIDUS_OVERLAY_ALEF,
        WidthInfo.HEBREW_LETTER_LAMED,
        WidthInfo.ZWJ_HEBREW_LETTER_LAMED,
        WidthInfo.BUGINESE_LETTER_YA,
        WidthInfo.ZWJ_BUGINESE_LETTER_YA,
        WidthInfo.BUGINESE_VOWEL_SIGN_I_ZWJ_LETTER_YA,
        WidthInfo.TIFINAGH_CONSONANT,
        WidthInfo.ZWJ_TIFINAGH_CONSONANT,
        WidthInfo.TIFINAGH_JOINER_CONSONANT,
        WidthInfo.LISU_TONE_LETTER_MYA_NA_JEU,
        WidthInfo.OLD_TURKIC_LETTER_ORKHON_I,
        WidthInfo.ZWJ_OLD_TURKIC_LETTER_ORKHON_I,
        WidthInfo.KHMER_COENG_ELIGIBLE_LETTER,
    )
