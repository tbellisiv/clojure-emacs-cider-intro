# Cider Mode

The [`clojure-mode`](https://github.com/clojure-emacs/clojure-mode) major mode provides the core language support for Clojure in Emacs however, the advanced features of CIDER such as code completion, interactive code evaluation, debugging and test execution require live interaction with the Clojure application running within a REPL. The `cider-mode` minor mode provides access to this functionality.

`cider-mode` is automatically added as a minor mode to all buffers opened on Clojure source files within a project when a CIDER REPL session is started. cider-mode is removed when the REPL session is terminated.

> **FYI**

> * Starting a CIDER REPL session is commonly referred to as "starting" CIDER".
> * Terminating a CIDER REPL session is commonly referred to as "stopping" (or "quitting") CIDER.

### [Starting CIDER](Starting.md)
