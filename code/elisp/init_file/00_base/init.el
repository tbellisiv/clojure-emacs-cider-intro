;; Minimal base Emacs config for installing packages

;; BEGIN ========= Emacs Package Config =========

(require 'package)

(add-to-list 'package-archives
             '("melpa-stable" . "http://stable.melpa.org/packages/") t)


(package-initialize)

;; END =========== Emacs Package Config =========

