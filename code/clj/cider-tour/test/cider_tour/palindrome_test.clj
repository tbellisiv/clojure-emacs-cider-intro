(ns cider-tour.palindrome-test
  (:require [clojure.test :refer :all]
            [cider-tour.palindrome :refer :all]))

(deftest string-palindrome-test-pos
  (testing "Positive test for string palindrome"
    (is (is-palindrome? "racecar"))))

(deftest string-palindrome-test-neg
  (testing "Negative test for string palindrome"
    (is (not (is-palindrome? "oreo")))))

(deftest int-palindrome-test-pos
  (testing "Positive test for integer palindrome"
    (is (is-palindrome? 101))))

(deftest int-palindrome-test-neg
  (testing "Negative test for integer palindrome"
    (is (not (is-palindrome? 2012)))))

(deftest vec-palindrome-test-pos
  (testing "Positive test for vec collection palindrome"
    (is (is-palindrome? [:a :b :b :a]))))

(deftest vec-palindrome-test-neg
  (testing "Negative test for integer palindrome"
    (is (not (is-palindrome? 2012)))))

(deftest gen-palidrome-num-pos
  (testing "Positive test for gen-palindrome-num"
    (is (is-palindrome? (gen-palindrome-num 100)))))

