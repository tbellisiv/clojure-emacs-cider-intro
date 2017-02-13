(ns cider-tour.doc)

;; Position point to println and type 'C-c C-d C-d [RET]' to view documentation for println
(print "I'm here just for documentation\n.")



;; 4clojure Problem #27 - Palindrome Detector - https://www.4clojure.com/problem/27
;; Position point within the defn below and type C-M-x to define the function.
(defn is-palindrome?
  "Determines if a sequence is a palindrome (i.e. the reverse of the sequence is identical to the input sequence).
   Supports strings and collections. Returns true if the sequence is a palindome, false otherwise."
  [s] (= (reverse (seq s)) (seq s)))

;; Position point within 'is-palindrome?' below and type 'C-c C-d C-d [RET]' to view documentation.
(is-palindrome? "racecar")


