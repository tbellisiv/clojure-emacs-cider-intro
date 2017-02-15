# Turbo-Powered Indentation

[Aggressive-indent-mode](https://github.com/Malabarba/aggressive-indent-mode) is a minor that dynamically updates the indentation of code to adhere to the language (or configured) standards.

## Configuring Paredit

To configure aggressive-indent-mode in Emacs do the following:

1. Install the paredit package: `M-x package-install [RET] aggressive-indent [RET]`
2. Add the following lines to your Emacs init file:

```
;; Enable aggressive indent mode for CIDER mode
(add-hook 'cider-mode-hook #'aggressive-indent)
```


