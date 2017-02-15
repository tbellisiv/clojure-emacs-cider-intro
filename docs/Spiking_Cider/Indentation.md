# Turbo-Powered Indentation

[Aggressive-indent-mode](https://github.com/Malabarba/aggressive-indent-mode) is a minor that dynamically updates the indentation of code to adhere to the language (or configured) standards.

## Configuring Paredit

To configure aggressive-indent-mode in Emacs do the following:

1. Install the paredit package: `M-x package-install [RET] aggressive-indent [RET]`
2. Add the following lines to your Emacs init file:

```
;; Enable paredit mode for Clojure buffers, CIDER mode and CIDER REPL buffers
(add-hook 'cider-repl-mode-hook #'paredit-mode)
(add-hook 'cider-mode-hook #'paredit-mode)
(add-hook 'clojure-mode-hook #'paredit-mode)
```

## Additional Resources

