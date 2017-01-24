# Installation

## Prerequsites

CIDER 0.14 (the version current at the writing of this presentation) has the following prerequisites:

* [Emacs](https://www.gnu.org/software/emacs/) 24.4 or later
* Java: [Oracle Java](http://www.oracle.com/technetwork/indexes/downloads/index.html#java) or [Open JDK](http://openjdk.java.net/install/index.html) 1.7 or later
* [Clojure/ClojureScript](https://clojure.org/) 1.7 or later
* Clojure Project Build Tool: [Leiningen](https://leiningen.org/), [Boot](https://github.com/boot-clj/boot) or [Gradle](https://gradle.org/). This presentation will use Leiningen- the defacto Clojure project build tool.

#### Emacs

As noted in the [Introduction](../../README.md), this presentation assumes the reader is an active Emacs user and therefore has Emacs installed. If the reader has not used Emacs, the tutorial [How to Use Emacs, an Excellent Clojure Editor](http://www.braveclojure.com/basic-emacs/) on the [Brave Clojure](http://www.braveclojure.com/) site is recommended.

#### Java

Clojure is a JVM-based language and therefore requires an installation of Java.

If you do not Java 1.7 or later installed, install the version of Java appropriate for your OS:

* OS X (Oracle Java): [Instructions](https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html)
| [Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

* Windows (Oracle Java): [Instructions](https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html)
| [Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

* Linux:

    Users of the popular Linux distributions and their derivatives have the choice of either OpenJDK or Oracle Java. In terms of the licensing model and ease of installation (installation via your Linux package manager), OpenJDK is recommended. In terms of support and stability, Oracle Java is
recommended. For this presentation, OpenJDK is recommended.

    * OpenJDK: [Instructions](http://openjdk.java.net/install/index.html)
    * Oracle Java:
        * Linux (Generic):
            * Instructions: [64-bit](https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html#BJFJJEFG) | [32-bit](https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html#BJFCDAIB)
            * [Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
        * Debian 8: [Instructions](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-get-on-debian-8)
        * Unbuntu 16.04: [Instructions](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-get-on-ubuntu-16-04)
        * RHEL/CentOS/Fedora: [Instructions](http://tecadmin.net/install-java-8-on-centos-rhel-and-fedora/)

After you have installed Java, ensure that:

* JAVA_HOME points to the root of the Java install directory.
* The Java 'bin' directory is on your PATH.
* The command ```java -version``` returns the correct version of Java.

#### Leiningen

[Leiningen](https://leiningen.org/) is the standard Clojure project build/automation tool. For Leiningen-based Clojure projects, CIDER uses Leiningen to launch a Clojure REPL from Emacs. CIDER also supports [Boot](https://github.com/boot-clj/boot) and [Gradle](https://gradle.org/) but this tutorial will cover Leiningen.

The standard installation method for Leiningen varies depending on the OS:

* Linux and Mac OS X:

    1. Download the lein [script](https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein)
        * ```curl -O https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein```
    2. Make the script executable:
        * ```chmod a+x lein```
    3. Ensure that the directory containing the ```lein``` script is on your PATH
    

* Windows:

    1. Download the lein.bat [script](https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein.bat)

    2. Ensure that the directory containing the ```lein.bat``` script is on your PATH

Alternative installation methods:

* Mac OS X:
    * Homebrew: ```brew install leiningen```
    * [SDKMAN](http://sdkman.io/): ```sdk install leiningen```
* Windows:
    * [Windows Installer](https://bitbucket.org/djpowell/leiningen-win-installer/downloads/leiningen-installer-1.0.exe)
    * Chocolatey: ```choco install lein```
* Linux:
    * [SDKMAN](http://sdkman.io/): ```sdk install leiningen```
* Other OS's - [https://github.com/technomancy/leiningen/wiki/Packaging](https://github.com/technomancy/leiningen/wiki/Packaging)


Finally, validate your Leiningen install:

* Run ```lein version``` to display the Leiningen version.
* Run ```lein repl``` to launch a Clojure REPL. Type ```(exit)``` to exit the REPL.


## CIDER

CIDER is installed via Emacs' builtin-in package management facility, package.el (also known as ELPA- Emacs Lisp Package Archive). CIDER is available in the MELPA package repository. 

Ensure that you have the following in your Emacs init file (.emacs/.emacs.el/init.el):

```
(require 'package)

(add-to-list 'package-archives
             '("melpa-stable" . "http://stable.melpa.org/packages/") t)

(package-initialize)
```

Now install the CIDER package and it's dependencies:

```
M-x package-install [RET] cider [RET]
```

Verify CIDER is installed by executing the following:

```
M-x cider-version [RET]
```

