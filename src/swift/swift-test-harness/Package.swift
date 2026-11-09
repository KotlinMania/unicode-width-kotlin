// swift-tools-version: 6.0
import Foundation
import PackageDescription

let swiftExportConfiguration: String = {
    let raw =
        ProcessInfo.processInfo.environment["SWIFT_EXPORT_CONFIGURATION"]
        ?? ProcessInfo.processInfo.environment["CONFIGURATION"]
        ?? "Debug"
    return raw.lowercased() == "release" ? "Release" : "Debug"
}()

let package = Package(
    name: "SwiftTestHarness",
    platforms: [
        .macOS(.v15),
    ],
    dependencies: [
        .package(name: "UnicodeWidth", path: "../../../build/SPMPackage/macosArm64/\(swiftExportConfiguration)"),
    ],
    targets: [
        .testTarget(
            name: "SwiftTestHarnessTests",
            dependencies: [
                .product(name: "UnicodeWidthLibrary", package: "UnicodeWidth"),
            ],
            linkerSettings: [
                .unsafeFlags(
                    [
                        "-L", "../../../build/swift-test/Debug",
                        "-lUnicodeWidth",
                    ],
                    .when(configuration: .debug)
                ),
                .unsafeFlags(
                    [
                        "-L", "../../../build/swift-test/Release",
                        "-lUnicodeWidth",
                    ],
                    .when(configuration: .release)
                ),
            ]
        ),
    ],
    swiftLanguageModes: [.v6]
)
