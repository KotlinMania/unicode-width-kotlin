// Disable Mocha's default 2000ms per-test timeout for wasmJs browser tests.
//
// Kotlin compiles both the Wasm and the tests; the Kotlin test runtime is what
// decides whether a test passed or failed. Mocha is only present because Karma
// uses it as a framework to enumerate the runtime's emitted `it()` calls — it
// has no business killing a passing Kotlin test that takes longer than two
// seconds. Setting `timeout: 0` disables Mocha's per-test timer so the only
// authority on test outcome is the Kotlin code under test. Wrapped in
// parentheses per RUNBOOK karma DefinePlugin guidance to avoid the
// unparenthesised-{} statement-start parse error.
(config.set({
    client: {
        mocha: {
            timeout: 0,
        },
    },
}));
