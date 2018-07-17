(ns user
  (:require [shadow.cljs.devtools.api :as dapi]))

;; cider-connect-cljs localhost:8230 => :browser
(defn cljs-repl []
  (dapi/nrepl-select :browser))
