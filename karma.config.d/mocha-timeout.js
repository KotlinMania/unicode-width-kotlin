// Use a large but finite Mocha per-test timeout for both jsBrowserTest and
// (hopefully) wasmJsBrowserTest. Kotlin compiles the tests and is the
// authority on whether each @Test passed; Mocha is only present as Karma's
// framework wrapper around the runtime's emitted it() calls. A long timeout
// avoids Mocha's 2000ms default veto without allowing hung test runs to
// wait forever.
config.set({
    client: {
        mocha: {
            timeout: 600000,
        },
    },
});
