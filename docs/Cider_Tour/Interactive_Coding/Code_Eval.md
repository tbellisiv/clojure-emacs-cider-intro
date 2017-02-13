# Code Evaluation

In this section we will explore CIDER's support for evaluation of Clojure code. 

>**FYI**

> A semicolon character is used to indicate the start of comment text in Clojure.
> Any text that appears after a semicolon is ignored.

Open the file `eval.clj` located in the `code/clj/cider-tour/src/cider-tour` directory of the GitHub project:

**Screenshot - eval.clj**

![Clojure Source - eval.clj](images/eval_clj_code.jpg)

## Evaluating Expressions

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

The result of the evaluation is the association of the symbol `my-factorial` with a Clojure var that points to the function. CIDER displays the namespace-qualified symbol as the result.

Now let's evaluate the `my-factorial` function. Position point at the end of the `(my-factorial 10)` line and type `C-x C-e`:

**Output**

![Output](images/eval_my_factorial_10_01.jpg)

This evaluates the preceding expression.

Next, type the following:

`C-c M-n`
`C-c M-p [RET]`

`C-c M-n` executes the CIDER function `cider-repl-set-ns` which changes the default namespace of the CIDER REPL buffer to the namespace of the Clojure eval.clj file:

** REPL Output (1/2) **

![Output](images/eval_my_factorial_10_02.jpg)

`C-c M-p` copies the expression preceding point in our eval.clj buffer to the REPL buffer. CIDER switches focus to the REPL buffer. Pressing `[RET]` evaluates the expression:

** REPL Output (2/2) **

![Output](images/eval_my_factorial_10_03.jpg)


>**FYI**

>The use of `C-c M-n` to change the namespace in the REPL was necessary for two reasons:
> 1. The function `my-factorial` is defined in the `cider-tour.eval` namespace and our default namespace in the CIDER REPL buffer was set to `cider-tour.core`.
> 2. The symbol `my-factorial` in the expression `(my-factorial 10)` is not namespace-qualified. The REPL assumes all symbols that are not namespace-qualified reside in the default namespace. Evaluation of the expression in the REPL buffer with `cider-tour.core` as the default namespace would therefore fail.

## Evaluating Code Blocks

Up to this point we have evaluated individual expressions. CIDER also provides support for evaluating code blocks (i.e. sequences of expressions): buffers, files and regions.

Switch back to the `eval.clj` buffer and type `C-c C-k` to evaluate the entire buffer:

![Output](images/eval_buffer.jpg)

When the entire buffer is evaluated, CIDER displays the return value of the last expression in the minibuffer. The last expresssion  in the buffer is `(println ...)` function call. println always returns nil so the result of evaluating the buffer is nil.

To evaluate a region select a region of expressions and type `C-c C-v C-r`.

To load and evaluate a Clojure file type `C-c C-l` and provide the path to the file.

# Summary

We used the following commands for evaluating expressions in CIDER:

| Keybinding | Command                   | Summary |
| ---------- | ------------------------- | ------- |
| C-x C-e    | cider-eval-last-sexp      | Evaluate the expression preceeding point |
| C-M-x      | cider-eval-defun-at-point | Evaluate the top-level expression containing point | 
| C-c M-p    | cider-insert-last-sexp-in-repl | Copies the expression preceding point to REPL buffer input line |
| C-c C-k    | cider-load-buffer | Evaluates the current buffer |
| C-c C-l    | cider-load-file | Loads the file into a new buffer and evaluates the buffer |

The above commands are indispensable tools in the CIDER toolbox. CIDER provides a wealth of commands for evaluation. The `CIDER Eval` menu list the available commands for code evaluation. 









