# Installation

## Prerequsites

#### Emacs

As noted in the [Introduction](../../README.md), this presentation assumes the reader is an active Emacs user and therefore has Emacs installed. If the reader has not used Emacs, the tutorial [How to Use Emacs, an Excellent Clojure Editor](http://www.braveclojure.com/basic-emacs/) on the [Brave Clojure](http://www.braveclojure.com/) site is recommended.

You will want to ensure that your version of Emacs meets the minimal version of Cider (see [Prerequisites](../../Prerequisites/README.md)). This presentation uses Emacs 25.1. 

#### Java 

Clojure is a JVM-based language and therefore requires an installation of Java. 

If you do not have the minimal version of Java required for CIDER installed ([Prerequisites](../../Prerequisites/README.md)), install the version appropriate for your OS:

* OS X (Oracle Java): [Instructions](https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html)
 | [Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
 
* Windows (Oracle Java):  [Instructions](https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html)
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

The installation method for Leiningen varies depending on the OS:

* Linux and Mac OS X:

 1. Download the lein [script](https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein)
   * ```curl -O https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein```
 2. Make the script executable:
   * ```chmod a+x ~/bin/lein```
 

## CIDER



