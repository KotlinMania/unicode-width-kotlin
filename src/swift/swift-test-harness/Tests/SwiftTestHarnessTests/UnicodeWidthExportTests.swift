import Testing
import UnicodeWidth

// Smoke test for the Kotlin → Swift Export → SPM → swift test pipeline.
@Suite("UnicodeWidth Swift Export Tests")
struct UnicodeWidthExportTests {
    @Test("Swift module loads cleanly")
    func swiftModuleLoads() throws {
        #expect(Bool(true))
    }
}
