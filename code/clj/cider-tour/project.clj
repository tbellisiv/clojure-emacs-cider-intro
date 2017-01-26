(defproject cider-tour "0.1.0-SNAPSHOT"
  :description "CIDER Tour - Sample Clojure Project  for 'Emacs CIDER Intro' presentation - https://tbellisiv.gitbooks.io/clojure-emacs-cider-intro"
  :url "https://github.com/tbellisiv/clojure-emacs-cider-intro/tree/master/code/clj/cider-tour"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot cider-tour.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
