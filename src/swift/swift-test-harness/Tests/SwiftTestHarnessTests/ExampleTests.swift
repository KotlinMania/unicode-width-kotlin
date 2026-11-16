#if canImport(Testing)
import Testing
import UnicodeWidth

@Suite("UnicodeWidth Scalar Export Tests")
struct UnicodeWidthScalarExportTests {
    @Test("ASCII and full-width scalar widths")
    func scalarWidths() {
        #expect(unicodeWidth(Int32(0x77)) == 1)
        #expect(unicodeWidthCjk(Int32(0x77)) == 1)
        #expect(unicodeWidth(Int32(0xFF48)) == 2)
        #expect(unicodeWidthCjk(Int32(0xFF48)) == 2)
    }

    @Test("Ambiguous scalar width depends on CJK mode")
    func ambiguousScalarWidths() {
        #expect(unicodeWidth(Int32(0xA1)) == 1)
        #expect(unicodeWidthCjk(Int32(0xA1)) == 2)
    }

    @Test("Control scalars return nil and combining marks have zero width")
    func controlAndCombiningScalarWidths() {
        #expect(unicodeWidth(Int32(0)) == nil)
        #expect(unicodeWidthCjk(Int32(0)) == nil)
        #expect(unicodeWidth(Int32(0xA)) == nil)
        #expect(unicodeWidthCjk(Int32(0xA)) == nil)
        #expect(unicodeWidth(Int32(0x300)) == 0)
        #expect(unicodeWidthCjk(Int32(0x300)) == 0)
    }
}
#elseif canImport(XCTest)
import XCTest
import UnicodeWidth

final class UnicodeWidthScalarExportTests: XCTestCase {
    func testScalarWidths() {
        XCTAssertEqual(unicodeWidth(Int32(0x77)), 1)
        XCTAssertEqual(unicodeWidthCjk(Int32(0x77)), 1)
        XCTAssertEqual(unicodeWidth(Int32(0xFF48)), 2)
        XCTAssertEqual(unicodeWidthCjk(Int32(0xFF48)), 2)
    }

    func testAmbiguousScalarWidths() {
        XCTAssertEqual(unicodeWidth(Int32(0xA1)), 1)
        XCTAssertEqual(unicodeWidthCjk(Int32(0xA1)), 2)
    }

    func testControlAndCombiningScalarWidths() {
        XCTAssertNil(unicodeWidth(Int32(0)))
        XCTAssertNil(unicodeWidthCjk(Int32(0)))
        XCTAssertNil(unicodeWidth(Int32(0xA)))
        XCTAssertNil(unicodeWidthCjk(Int32(0xA)))
        XCTAssertEqual(unicodeWidth(Int32(0x300)), 0)
        XCTAssertEqual(unicodeWidthCjk(Int32(0x300)), 0)
    }
}
#endif
