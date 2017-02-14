(ns cider-tour.doc)

;; Position point to "print" below and type 'C-c C-d C-d [RET]' to view the "docstring" documentation for print.
;; Now, without moving point, type 'C-c C-d C-r [RET]' to view the Grimoire documentation in a buffer.
;; Finally, type `C-c C-d C-w [RET]` to view the Grimoire documentation in a browser.
(print "I'm here just for documentation\n.")

;; 4clojure Problem #27 - Palindrome Detector - https://www.4clojure.com/problem/27
;; Position point within the defn below and type C-M-x to define the function.
(defn is-palindrome?
  "Determines if a sequence is a palindrome (i.e. the reverse of the sequence is identical to the input sequence).
   Supports strings and collections. Returns true if the sequence is a palindome, false otherwise."
  [s] (= (reverse (seq s)) (seq s)))

;; Position point within 'is-palindrome?' below and type 'C-c C-d C-d [RET]' to view documentation.
(is-palindrome? "racecar")

;; Position point within the string 'System/getProperty' below and type 'C-c C-d C-j' to view JavaDoc for System.getProperty()
(System/getProperty "java.version")
