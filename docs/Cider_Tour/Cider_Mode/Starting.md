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
* Sets the current namespace of the REPL to the namespace of the `core.clj` file (as indicated by the <span style="font-weight: bold; color:#ff00ff">cider-tour.core&gt;</span> prompt).
* Opens a buffer window for user interaction with the REPL.

CIDER displays a banner message in the REPL buffer that provides helpful information for new users:

![CIDER REPL Buffer Window](images/cider_start_repl.jpg)

