(ns cider-tour.palindrome)

;; 4clojure Problem #27 - Palindrome Detector - https://www.4clojure.com/problem/27
;; Position point within the defn below and type C-M-x to define the function.
(defn is-palindrome?
  "Determines if a sequence or number is a palindrome (https://en.wikipedia.org/wiki/Palindrome).
   Supports strings and collections. Returns true if the sequence is a palindome, false otherwise."
  [s] (if (number? s)
        (is-palindrome? (str s))
        (= (reverse (seq s)) (seq s))))

(defn normalize-seed
  "Normalizes the seed for gen-palidrome-num. If the seed is divisble by 10 return seed + 1.
   Otherwise return seed."
  [seed] (if (= 0 (mod seed 10)) (inc seed) seed))

(defn reverse-digits
  "Reverses the digits of a number"
  [n] (Long/parseLong (apply str (reverse (str n)))))

;; Numeric palindrome generator - http://www.basic-mathematics.com/palindrome.html
(defn gen-palindrome-num
  "Given an initial seed, returns a number that is a palindrome"
  [seed]
  (loop [initial-seed seed]
    (let [normalized-seed (normalize-seed initial-seed)
          reversed-seed (reverse-digits normalized-seed)
          next-palindrome-num (+ normalized-seed reversed-seed)]
      (if (is-palindrome? next-palindrome-num)
        next-palindrome-num
        (recur next-palindrome-num)))))

