# Running Tests

## Overview

CIDER provides support for running unit tests created using the Clojure [core.test](https://clojure.github.io/clojure/clojure.test-api.html) library. Tests can be executed from buffers containing Clojure application code, unit test code or from the CIDER REPL.

## Hands-On

Open the file `palindrome.clj` located in the `code/clj/cider-tour/src/cider-tour` directory of the GitHub project:

![palindrome_clj.jpg](images/palindrome_clj.jpg)

In another buffer or frame open the file `palindrome_test.clj` located in the `code/clj/cider-tour/test/cider-tour` directory of the GitHub project:

![palindrome_test_clj.jpg](images/palindrome_test_clj.jpg)

`palindrome_test.clj` contains the unit tests for functions defined in the `cider-tour.palindrome` namespace.

Now switch focus back to `palindrome.clj` and run all unit tests for the `cider-tour.palindrome` namespace by typing `C-c C-t C-n`:

CIDER displays a summary of the results in the minibuffer:

![test_result_all_namespace.jpg](images/test_result_all_namespace.jpg)












