// Disable Mocha's per-test timeout for both jsBrowserTest and (hopefully)
// wasmJsBrowserTest. Kotlin compiles the tests and is the authority on
// whether each @Test passed; Mocha is only present as Karma's framework
// wrapper around the runtime's emitted it() calls. Setting `timeout: 0`
// removes Mocha's 2000ms-default veto.
config.set({
    client: {
        mocha: {
            timeout: 0,
        },
    },
});
