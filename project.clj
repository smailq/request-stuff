(defproject request-stuff "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.89"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-ring "0.9.7"]]

  :cljsbuild {
              :builds [{
                        ; The path to the top-level ClojureScript source directory:
                        :source-paths ["src-cljs"]
                        ; The standard ClojureScript compiler options:
                        ; (See the ClojureScript compiler documentation for details.)
                        :compiler     {:optimizations :whitespace
                                       :output-to "resources/public/js/main.js"
                                       :pretty-print  true}}]}


  :ring {:handler request-stuff.routes/app}

  )
