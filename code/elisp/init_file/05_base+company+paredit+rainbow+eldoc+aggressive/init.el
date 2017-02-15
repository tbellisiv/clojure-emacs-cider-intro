;; Base Emacs config for installing packages + Company Mode + Paredit + Rainbow + Eldoc + Aggressive

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


;; BEGIN ========= Paredit Config =========

(add-hook 'cider-repl-mode-hook #'paredit-mode)
(add-hook 'cider-mode-hook #'paredit-mode)
(add-hook 'clojure-mode-hook #'paredit-mode)

;; END ========= Paredit Config =========


;; BEGIN ========= Rainbow Delimiters Mode Config =========

; Enable rainbow delimiters for Clojure buffers, CIDER mode and CIDER REPL buffers
(add-hook 'cider-repl-mode-hook 'rainbow-delimiters-mode) 
(add-hook 'cider-mode-hook 'rainbow-delimiters-mode)
(add-hook 'clojure-mode-hook 'rainbow-delimiters-mode)

;; END  ========= Rainbow Delimiters Mode Config =========


;; BEGIN  ========= Eldoc Mode Config =========

;;Enable eldoc in CIDER Mode buffers:
(add-hook 'cider-mode-hook #'eldoc-mode)
(add-hook 'cider-repl-mode-hook #'eldoc-mode)

;; END  ========= Eldoc Mode Config =========


;; BEGIN  ========= Aggressive Indent Mode Config =========

;; Enable aggressive indent mode for CIDER mode and Clojure Mode
(add-hook 'cider-mode-hook #'aggressive-indent-mode)
(add-hook 'clojure-mode-hook #'aggressive-indent-mode)

;; BEGIN  ========= Aggressive Indent Mode Config =========
