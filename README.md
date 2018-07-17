# Starter Template

Simple Shadow CLJS Template Project

## Getting Started

```
yarn
yarn watch
open http://localhost:8280
```

## Testing

Interactive:

```
yarn watch-test
open http://localhost:8290
```

CI Server:

```
yarn test
```


### ClojureScript Repl

```
cider-connect
localhost:8230

(cljs-repl)
```

### Log

```bash

➜  shadow-cljs-reframe-template git:(master) ✗ yarn watch
yarn run v1.3.2
warning package.json: No license field
$ shadow-cljs watch browser
shadow-cljs - config: /Users/stevechan/CljsNodePro/shadow-cljs-reframe-template/shadow-cljs.edn  cli version: 2.4.21  node: v9.4.0
shadow-cljs - updating dependencies
shadow-cljs - dependencies updated
shadow-cljs - starting ...
shadow-cljs - HTTP server for :browser available at http://localhost:8280
shadow-cljs - HTTP server for :browser-test available at http://localhost:8290
shadow-cljs - server version: 2.4.21
shadow-cljs - server running at http://localhost:9630
shadow-cljs - socket REPL running on port 52908
shadow-cljs - nREPL server started on port 8230
shadow-cljs - watching build :browser
[:browser] Configuring build.
[:browser] Compiling ...
[:browser] Build completed. (279 files, 153 compiled, 0 warnings, 33.67s)
;;;;;;;;
JS runtime connected.
JS runtime disconnected.

```
