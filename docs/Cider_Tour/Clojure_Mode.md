# Clojure Mode

Note that the mode line for the project.clj buffer in the screenshot below displays `(Clojure)` indicating that the [`clojure-mode`](https://github.com/clojure-emacs/clojure-mode) major mode is enabled. When a file with an extension of `.clj` is opened, Emacs sets the major mode of the buffer to clojure-mode.

**project.clj**
 
![project.clj for cider-tour project](images/project_clj.jpg)

[`clojure-mode`](https://github.com/clojure-emacs/clojure-mode) provides the core Clojure language support. This includes:

* Syntax Highlighting (a.k.a. "font locking" in Emacs-speak)
* Indentation
* Refactoring
* REPL Integration

> **FYI**

> * clojure-mode and CIDER are distributed as separate Emacs packages but are maintained by the same author. The clojure-mode package is a dependency of CIDER but may be used independent of CIDER (e.g. to use in conjuction with the [inf-clojure](https://github.com/clojure-emacs/inf-clojure) Clojure REPL package).


> * CIDER appends entries to the Emacs `auto-mode-alist` variable to enable `clojure-mode` for supported Clojure file types. The main Clojure file extensions are:

>  | Extension | Content |
| --- | --- |
| .clj | Clojure Code |
| .cljs | ClojureScript Code |
| .edn | [EDN](https://github.com/edn-format/edn) data (similar in concept to JSON)|



