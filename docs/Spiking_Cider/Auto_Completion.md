# Auto-Completion

Out of the box, CIDER provides support for code completion by leveraging Emacs' standard completion facility. CIDER also supports the popular [Company Mode](http://company-mode.github.io/) which provides a more interactive and integrated code completion mechanism.

## Configuring Company Mode

To configure company-mode in Emacs do the following:

1. Install the company-mode package: `M-x package-install [RET] company [RET]`
2. Add the following lines to your Emacs init file:

```
;; Enable company-mode globally
(add-hook 'after-init-hook 'global-company-mode)

;; Enable company-mode inside for Clojure source, CIDER mode and CIDER REPL buffers
(add-hook 'cider-repl-mode-hook #'company-mode)
(add-hook 'cider-mode-hook #'company-mode)
(add-hook 'clojure-mode-hook #'company-mode)

;; To make tab complete, without losing the ability to manually indent
(global-set-key (kbd "TAB") #'company-indent-or-complete-common)
(global-set-key (kbd "M-TAB") #'company-indent-or-complete-common)
(global-set-key (kbd "<C-return>") #'company-indent-or-complete-common)
(global-set-key (kbd "<C-tab>") #'company-indent-or-complete-common)
```











