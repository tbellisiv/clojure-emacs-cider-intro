# Configuration

### Leiningen

CIDER launches a Clojure REPL through your Clojure project's build tool (Leiningen for this tutorial). CIDER provides "middleware" (in the form of a Clojure library) to enhance the Clojure REPL with additional functionality. 

There are two primary methods for adding CIDER's middleware to Leiningen:

1. (Recommended) Update the global ```profiles.clj``` file. The global ```profiles.clj``` specifies Leiningen configuration settings that are available across all Clojure Leiningen projects. On Linux and Mac OS X, ```profiles.clj``` resides in the ```~/.lein``` directory. On Windows the directory is typically ```%USERPROFILE%\.lein``` (i.e. ```C:\Users\<username>\.lein```.
    
    Add the following to the global ```profiles.clj``` to inject CIDER's middleware:
    
    ```
    {:repl {:plugins [[cider/cider-nrepl <version>]]}}
    ```
    
    where ```version``` is the CIDER version (e.g. "0.14.0"). Example:
    
    ```
    {:repl {:plugins [[cider/cider-nrepl "0.14.0"]]}}
    ```


