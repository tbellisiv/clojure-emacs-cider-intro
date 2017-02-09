(ns cider-tour.eval)

;; Generate a sequence of integers from 1 to 5
;;
;; Position point at the end of the expression below and type: C-x C-e
;; or
;; Position point within the expression and type: C-M-x
(range 1 6)

;; Calculate 5!
;; Position point immediately after the end of the '(range 1 (inc 5))' expression below and
;;   type: C-x C-e
;;   type: C-M-x
(reduce * (range 1 (inc 5)))

;; Define a function to calculate n!
;; Position point within the defn expression below and type: C-M-x
(defn my-factorial
  "Calculates n! where n is a non-negative integer"
  [n]
  (reduce * (range 1 (inc n))))

;; Evaluate 10!
;; Position point at the end of the expression below and
;;   type: C-x C-e
;;   type: C-c M-n
;;   type: C-c M-p [RET]
(my-factorial 10)

;; Evaluate a println function
;; Position point within the expression below and type: C-M-x
(println "End of code")

;; To evaluate (or re-evaluate) the entire buffer type: C-c C-k
;; When the entire buffer is evaluated, CIDER displays the return value of the last expression in the minibuffer.
;; The last expresssion is the above println function call. println always returns nil so the result of evaluating the buffer is nil









