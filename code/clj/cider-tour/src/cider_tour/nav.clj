(ns cider-tour.nav
  (:require [cider-tour.core :refer [say-hello]])
  (:require [clojure.java.io :as io]))

;; Position point within the expression below and type 'M-. [RET]' to jump to the defintion of 'say-hello'.
(say-hello)

;; Reads the content of the classpath resource file my_res.txt.
;; Position point on the string "my_res.txt" and type 'C-c M-. [RET]' to jump to the resource file
(def res-data
  (-> "my_res.txt"
    (io/resource)
    (io/file)
    (slurp)))

