import Testing
import UnicodeWidth

// Smoke test for the Kotlin → Swift Export → SPM → swift test pipeline.
@Suite("UnicodeWidth Swift Export Tests")
struct UnicodeWidthExportTests {
    @Test("Empty strings have zero width")
    func emptyStringWidths() {
        #expect(unicodeWidth("") == 0)
        #expect(unicodeWidthCjk("") == 0)
    }

    @Test("Full-width strings retain their displayed columns")
    func fullWidthStringWidths() {
        #expect(unicodeWidth("ｈｅｌｌｏ") == 10)
        #expect(unicodeWidthCjk("ｈｅｌｌｏ") == 10)
    }

    @Test("Ambiguous string widths depend on CJK mode")
    func ambiguousStringWidths() {
        #expect(unicodeWidth("₁₂₃₄") == 4)
        #expect(unicodeWidthCjk("₁₂₃₄") == 8)
    }

    @Test("Joined emoji retain their grapheme width")
    func emojiStringWidths() {
        #expect(unicodeWidth("👩") == 2)
        #expect(unicodeWidthCjk("👩") == 2)
        #expect(unicodeWidth("🔬") == 2)
        #expect(unicodeWidthCjk("🔬") == 2)
        #expect(unicodeWidth("👩‍🔬") == 2)
        #expect(unicodeWidthCjk("👩‍🔬") == 2)
    }
}
