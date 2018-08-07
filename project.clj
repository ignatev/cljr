(defproject cljr "0.1.0-SNAPSHOT"
  :description "algorythms and data structures implementation"
  :url "https://github.com/ignatev/cljr"
  :license {:name "GPL v3"
            :url "https://www.gnu.org/licenses/gpl.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot cljr.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
