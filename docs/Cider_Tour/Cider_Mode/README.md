# Cider Mode

The [`clojure-mode`](https://github.com/clojure-emacs/clojure-mode) major mode provides the core language support for Clojure in Emacs however, the advanced features of CIDER such as code completion, interactive code evaluation, debugging and test execution require live interaction with the Clojure application running within a REPL. The `cider-mode` minor mode provides access to this functionality. `cider-mode` is the "meat" of CIDER.

`cider-mode` is automatically added as a minor mode to all buffers opened on Clojure source files within a project when a CIDER REPL session is started. `cider-mode` is removed from the buffers when the REPL session is terminated.

> **FYI**

> * Starting a CIDER REPL session is commonly referred to as "starting" CIDER".
> * Terminating a CIDER REPL session is commonly referred to as "stopping CIDER" (or "quitting CIDER").

# Starting CIDER

Let's start a REPL session on the cider-tour project.

In Emacs switch to the `project.clj` that you opened earlier:

**Screenshot - project.clj**


![Clojure source - core.clj](images/project_clj.jpg)

and do one of the following:

1. Select 'Start a REPL' from the 'CIDER' menu
2. Type `M-x cider-jack-in [RET]`
3. Type `C-c M-j`

In response, CIDER performs the following actions:

* Invokes Leiningen to start a new REPL background process.
* Sets the default namespace of the REPL to `cider-tour.core` file (as indicated by the <span style="font-weight: bold; color:#d83da3">cider-tour.core&gt;</span> prompt). This namespace maps to a Clojure source file `core.clj` in the `src/cider-tour` sub-directory.
* Evaluates the `core.clj` file in the REPL.
* Opens a buffer window for user interaction with the REPL. CIDER displays a helpful banner message in the buffer that provides tips for new users.

![CIDER REPL Buffer Window](images/cider_start_repl.jpg)

# REPL Mode

The mode-line in the above screenshot displays `(REPL)` indicating that `cider-repl-mode` is the major mode. `cider-repl-mode` provides a rich set of functionality for interacting with the REPL including:

* Navigating to source definitions of symbols/functions (M-.)
* Documentation lookup of symbols/functions from online references (C-c C-d f)
* Test execution
* Browsing classpath and namespaces

Type `C-h m [RET]` to view all keybindings for the the mode. The `REPL` menu on the menubar provides access to the most commonly commands.




