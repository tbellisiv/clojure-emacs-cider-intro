# Configuration

### Leiningen

CIDER launches the Clojure REPL through your Clojure project's build tool (Leiningen for this tutorial). CIDER provides "middleware" (in the form of a Clojure library) to enhance the Clojure REPL with additional functionality. The middleware is is injected into the REPL via one of the following methods:

There are two primary methods for adding CIDER's middleware to Leiningen:

1. (Recommended) The user's global ```profiles.clj``` file. The global ```profiles.clj``` file specifies Leiningen configuration settings that are shared across all Clojure projects.

