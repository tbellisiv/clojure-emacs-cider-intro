(defproject sample-clj-proj "0.1.0-SNAPSHOT"
  :description "Sample Clojure Code for 'Emacs Coder Intro' presentation - https://www.gitbook.com/book/tbellisiv/clojure-emacs-cider-intro"
  :url "https://github.com/tbellisiv/clojure-emacs-cider-intro/tree/master/code/sample-clj-proj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot sample-clj-proj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
