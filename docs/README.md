# Introduction

[CIDER](https://github.com/clojure-emacs/cider) is an Emacs package that provides a full-featured interactive environment for Clojure and ClojureScript development.

The goal of this presentation is to provide a demonstration of the capabilities of CIDER to members of the Austin, TX "EmacsATX" meetup group - https://www.meetup.com/EmacsATX/.

# Intended Audience

### Emacs Experience

This presentation assumes that the reader:

 * Is an active or experienced [Emacs](https://www.gnu.org/software/emacs/) user.
 * Can install Emacs packages using the [Emacs Lisp Package Archive](https://elpa.gnu.org/) (a.k.a. package.el, ELPA) functionality in Emacs 24.1 and higher.
 * Is comfortable editing the Emacs initialization file (.emacs/.emacs.el/init.el) to add customizations (e.g. keybindings, setting/updating variables). 
 
For users who have no Emacs experience, the tutorial [How to Use Emacs, an Excellent Clojure Editor](http://www.braveclojure.com/basic-emacs/) on the excellent [Brave Clojure](http://www.braveclojure.com/) site is recommended instead.

### Git Experience

* The presentation assumes the reader has [Git](https://git-scm.com/) installed and is comfortable with cloning Git repositories. The sample Clojure code for this presentation is maintained in a [GitHub](https://github.com/tbellisiv/clojure-emacs-cider-intro) repository and will require the reader to clone the repository in order to work through the exercises.

### Development Experience

* The presentation assumes the user has some development experience in a mainstream programming language such as C/C++, C#, Java, Python, PHP, Ruby or JavaScript and is familiar with the concepts of functions, variables and data types. 

* The presentation *does not assume* the user has knowledge of Clojure however experience/familiarity with 
other Lisp-derived languages (e.g. [Emacs Lisp](https://www.emacswiki.org/emacs/EmacsLisp), [Common Lisp](https://www.common-lisp.net/) or [Scheme](https://en.wikipedia.org/wiki/Scheme_(programming_language)) is helpful *but not required*.

* Java development experience/familiarity is helpful *but not required*.

# Disclaimer

### My Background

I am fairly new to Clojure development and the CIDER Emacs package. I would consider myself an "intermediate beginner" at Emacs, having used Emacs from the mid-90's to the early 00's and returned to Emacs after a 13-year hiatus (due to my interest in Clojure and other FP languages).

Creating this presentation is as much a learning exercise for me much as I hope it is for the reader.

### CIDER Version Differences

CIDER 0.14.0 is (or was) the version of the most recent stable release when this presentation was created. The reader will likely encounter differences in requirements (e.g. Emacs, Java sd Clojure versions), functionality and UI in subsequent CIDER versions.

### Emacs Version Differences

GNU Emacs 25.1 on Linux (Fedora 24) was used to create the content (screenshots, exercises) for this presentation. Any version of Emacs that meets the CIDER requirements will suffice. However the Emacs UI and keybindings may vary due to the platform (Mac, Linux, etc.), distribution (e.g. GNU Emacs, Spacemacs, Emacs Live, etc.) and customizations of your Emacs install.



# Acknowledgements

TBD

# Contributions / Questions / Suggestions

The GitBook markdown source, sample Clojure code and Emacs configuration files are available in the GitHub [project](https://github.com/tbellisiv/clojure-emacs-cider-intro). PR's for corrections/enhancements are welcome.

Feel free to hurl any questions or suggestions my way:
* Ping me at twitter [@tbellisiv](https://twitter.com/tbellisiv),
* Create a GitHub project [issue](https://github.com/tbellisiv/clojure-emacs-cider-intro/issues/new)
* Drop me an [email](mailto:tbellisiv@gmail.com).