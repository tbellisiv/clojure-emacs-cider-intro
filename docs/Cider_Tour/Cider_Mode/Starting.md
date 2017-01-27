# Starting CIDER

Let's start a REPL session on the cider-tour project.

In Emacs open the `core.clj` file in the  `src/cider-tour` directory:

![Clojure source - core.clj](images/core_clj.jpg)

and do one of the following:

1. Select 'Start a REPL' from the 'CIDER' menu
2. Type `M-x cider-jack-in`
3. Type `C-c M-j`

In response, CIDER performs the following actions:

* Invokes Leiningen to start a new REPL background process
* Evaluates the `core.clj` file in the REPL.
* Opens a buffer window for user interaction with the REPL.

![CIDER REPL Buffer Window](images/cider_start_repl.jpg)

