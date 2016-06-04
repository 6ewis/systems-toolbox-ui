(defproject matthiasn/systems-toolbox-ui "0.5.9"
  :description "UI components for systems-toolbox"
  :url "https://github.com/matthiasn/systems-toolbox"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj" "src/cljs" "src/cljc"]

  :dependencies [[reagent "0.6.0-alpha"]]

  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0-alpha3"]
                                  [org.clojure/clojurescript "1.9.36"]]}}

  :plugins [[lein-codox "0.9.5" :exclusions [org.clojure/clojure]]
            [lein-cljsbuild "1.1.3"]])
