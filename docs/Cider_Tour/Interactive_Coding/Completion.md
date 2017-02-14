# Code Completion

CIDER provides support for code completion by leveraging the code completion provided by Emacs.

The keybinding `C-M-i` (`complete-symbol`) invokes CIDER's code completion.

In Emacs open the file `compl.clj` located in the `code/clj/cider-tour/src/cider-tour` directory of the GitHub project.

Type `C-c C-v C-n`. This evaluates the `(ns cider-tour.compl ....)` form which imports the `say-hello` function defined in the `core.clj` file.

Now, on a blank line type:

(say-

and then type `C-M-i`.

CIDER expands "say-" to "say-hello" because there is only matching symbol.






