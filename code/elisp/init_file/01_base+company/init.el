;; Base Emacs config for installing packages + Company Mode

;; BEGIN ========= Emacs Package Config =========

(require 'package)

(add-to-list 'package-archives
             '("melpa-stable" . "http://stable.melpa.org/packages/") t)


(package-initialize)

;; END =========== Emacs Package Config =========


;; BEGIN ========= Company Mode Config =========

;; Enable company-mode globally
(add-hook 'after-init-hook 'global-company-mode)

;; Enable company-mode inside for Clojure source, CIDER mode and CIDER REPL buffers
(add-hook 'cider-repl-mode-hook #'company-mode)
(add-hook 'cider-mode-hook #'company-mode)
(add-hook 'clojure-mode-hook #'company-mode)

;;To make tab complete, without losing the ability to manually indent
(global-set-key (kbd "TAB") #'company-indent-or-complete-common)
(global-set-key (kbd "M-TAB") #'company-indent-or-complete-common)
(global-set-key (kbd "<C-return>") #'company-indent-or-complete-common)
(global-set-key (kbd "<C-tab>") #'company-indent-or-complete-common)

;; END ========= Company Mode Config =========
