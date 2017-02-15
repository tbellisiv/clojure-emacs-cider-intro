# Eldoc

CIDER provides support for Emacs [Eldoc](https://www.emacswiki.org/emacs/ElDoc) minor mode. Eldoc dynamically displays the function signature as source code is being edited.

# Configuring Eldoc

To enable Eldoc for CIDER, add the following to your init.el:

```
;; Enable Eldoc in CIDER Mode buffers:
(add-hook 'cider-mode-hook #'eldoc-mode)
(add-hook 'cider-repl-mode-hook #'eldoc-mode)
```