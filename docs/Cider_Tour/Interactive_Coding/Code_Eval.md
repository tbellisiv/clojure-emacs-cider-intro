# Code Evaluation

In this section we will explore CIDER's support for evaluation of Clojure code. 

>**FYI**

> A semicolon character is used to indicate the start of comment text in Clojure.
> Any text that appears after a semicolon is ignored.

Open the file `eval.clj` located in the `code/clj/cider-tour/src/cider-tour` directory of the GitHub project:

**Screenshot - eval.clj**

![Clojure Source - eval.clj](images/eval_clj_code.jpg)

Position the cursor (i.e. "point") at the end of the `(range 1 6)` statement and type `C-x C-e`:

**Output**

![Output - Range](images/eval_range_one_to_six.jpg)

CIDER evaluates the `range` statement and displays the result as a temporary overlay within the buffer. The overlay is removed on any subsequent input to Emacs.

The keybinding `C-x C-e` executes the command `cider-eval-last-sexp` which evaluates the expression preceding point. 

Now let's evaluate a more interesting expression. In the next line of code, position point immediately after the end of the `(range 1 (inc 5))` expression and type `C-x C-e`. 

**Output**

![Output](images/eval_range_5_fact_01.jpg)

Note that only that `range` statement is evaluated because it is the expression that precedes point. 

>**FYI**

>`C-x C-e` is useful when for evaluating nested expressions and inspecting the value of vars.

Now, without moving the cursor, type `C-M-x`:

**Output**

![Output](images/eval_range_5_fact_02.jpg)


The keybinding `C-M-x` invokes the `cider-eval-defun-at-point` command which parses the expression at point to find the top-level expression and then evaluates the top-level expression. In this cause the top-level expression is the `(reduce ...)` function call.

>**FYI**

> `C-M-x` is useful for evaluating (or re-evaluating) top-level expressions such as var (`def`) and function (`defn`) definitions. As long as the point lies somewhere within the top-level expression, the top-level expression will be evaluated.


Now, position the cursor within the `(defn my-factorial ...)` expression and type `C-M-x` to evaluate the function definition:

![Output](images/eval_my_factorial.jpg)



