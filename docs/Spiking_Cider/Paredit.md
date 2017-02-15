# Paredit

[Paredit](https://www.emacswiki.org/emacs/ParEdit) is a minor mode that facilitates the structural manipulation and navigation within LISP S-expressions. 

# Configuring Paredit

To configure company-mode in Emacs do the following:

1. Install the paredit package: `M-x package-install [RET] paredit [RET]`
2. Add the following lines to your Emacs init file:

```
;; Enable paredit mode for Clojure buffers, CIDER mode and CIDER REPL buffers
(add-hook 'cider-repl-mode-hook #'paredit-mode)
(add-hook 'cider-mode-hook #'paredit-mode)
(add-hook 'clojure-mode-hook #'paredit-mode)
```

