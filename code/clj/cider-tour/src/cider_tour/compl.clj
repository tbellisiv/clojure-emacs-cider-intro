(ns cider-tour.compl
  (:require [cider-tour.core :refer [say-hello]]))

;; Type `C-c C-v C-n` to evaluate the above (ns ...) expression

;; On a new line type the string "(say-" (without quotes) and then type `C-M-i`.
;; CIDER will expand "say-" to "say-hello" because there is only matching symbol.


;; On a new line type the string "(ran" (without-quotes) and then type `C-M-i`.
;; Since there are multiple possible matches, CIDER displays all possible matches in a popup buffer
