// port-lint: ignore
// Empty marker for the tvosMain intermediate source set so the Kotlin
// Multiplatform metadata compile task has input. All actual implementation
// lives in commonMain — this file exists purely so the build graph never
// reports NO-SOURCE on this source set. Do not add behavior here.
package io.github.kotlinmania.unicodewidth

internal object TvosMainSourceSetMarker
