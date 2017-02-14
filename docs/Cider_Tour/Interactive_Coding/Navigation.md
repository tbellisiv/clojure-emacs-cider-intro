# Code Navigation

## Overview

CIDER provides the following commands for jumping to the definition symbols and resources:

| Keybinding | Command               | Description |
| ---------- | -------               | ----------- |
| `M-.`      | `cider-find-var`      | Jumps to the file where the symbol at point is defined |
| `C-c M-.`  | `cider-find-resource` | Jumps to a resource defined on the classpath |
| `M-,`      | `cider-pop-back`      | Jumps back to the previous buffer|

All of the above commands are available on the _Cider Interactions >> Find (jump to)_ menu.

## Hands-On

In Emacs open the file `nav.clj` located in the `code/clj/cider-tour/src/cider-tour` directory of the GitHub project. 

Position point within the `(say-hello)` expression and type `M-. [RET]`. CIDER jumps to the `core.clj` file where `say-hello` is defined.

Now type `M-,`. CIDER jumps back to the `nav.clj` buffer.


