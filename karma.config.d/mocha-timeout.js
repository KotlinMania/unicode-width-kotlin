// Mocha's 2 s default times out heavy browser test suites; match the 120 s Node test timeout.
config.client = config.client || {};
config.client.mocha = Object.assign({}, config.client.mocha, { timeout: 120000 });

// Full Unicode corpus checks can keep the browser busy between Socket.IO heartbeats.
// Allow 60 s for a pong; test deadlines and disconnect/no-activity limits stay unchanged.
config.pingTimeout = 60000;
