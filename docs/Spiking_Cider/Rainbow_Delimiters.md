# Rainbow Delimiters 

[Rainbow Delimiters](https://www.emacswiki.org/emacs/RainbowDelimiters) is a minor mode that colors parenthesis, brackets and braces based on depth.

# Configuring Rainbow Delimiters

1. Install the rainbow-delimiters package: `M-x package-install [RET] rainbow-delimiters [RET]`
2. Add the following lines to your Emacs init file:

```
;; Enable rainbow delimiters for Clojure buffers, CIDER mode and CIDER REPL buffers
(add-hook 'cider-repl-mode-hook 'rainbow-delimiters-mode) 
(add-hook 'cider-mode-hook 'rainbow-delimiters-mode)
(add-hook 'clojure-mode-hook #'rainbow-delimiters-mode)
```