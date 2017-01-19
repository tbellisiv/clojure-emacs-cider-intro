# Installation

## Prerequsites

#### Emacs

As noted in the [Introduction](../../README.md), this presentation assumes the reader is an active Emacs user and therefore has Emacs installed. You will want to ensure that your version of Emacs meets the minimal version of Cider (see [Prerequisites](../../Prerequisites/README.md)). This presentation uses Emacs 25.1. 

#### Java 

Clojure is a JVM-based language and therefore requires an installation of Java. 

If you do not have the minimal version of Java required for CIDER installed ([Prerequisites](../../Prerequisites/README.md)), install the version appropriate for your OS:

* OS X (Oracle Java): [Instructions](https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html)
 | [Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
 
* Windows (Oracle Java):  [Instructions](https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html)
 | [Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

* Linux:

 Linux users have the choice of either OpenJDK or Oracle Java. In terms of the licensing model and ease of installation (installation via your Linux package manager), OpenJDK is recommended. In terms of support/stability, Oracle Java is recommended. For this presentation, OpenJDK is recommended.

 * OpenJDK: [Instructions](http://openjdk.java.net/install/index.html) 
 * Oracle Java:
   * Linux (Generic): 
     * Instructions: [64-bit](https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html#BJFJJEFG) | [32-bit](https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html#BJFCDAIB)
     * [Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
   * Debian 8: [Instructions](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-get-on-debian-8)
   * Unbuntu 16.04: [Instructions](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-get-on-ubuntu-16-04)
   * RHEL/CentOS/Fedora: [Instructions](http://tecadmin.net/install-java-8-on-centos-rhel-and-fedora/)

After you have installed Java, ensure that:

 * JAVA_HOME points to the root of the Java install directory
 * The Java 'bin' directory is on your PATH
 * The command 'java -version' returns the correct version of Java

#### Leiningen



## CIDER



