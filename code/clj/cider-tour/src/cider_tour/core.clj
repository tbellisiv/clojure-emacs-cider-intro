(ns cider-tour.core
  (:gen-class))

(defn say-hello
  "Prints a hello message. With no arguments, prints 'Hello, welcome to the CIDER Tour!'. 
   With one argument prints 'Hello <arg>, welcome to the CIDER Tour!. 
   With two arguments prints 'Hello <arg1>, welcome to the CIDER Tour from <arg2>!"
  ([] (println "Hello, welcome to the CIDER Tour!"))
  ([to] (println (format  "Hello %s, welcome to the CIDER Tour!" to)))
  ([to from] (println (format "Hello %s, welcome to the CIDER tour from %s!" to from))))

(defn -main
  "Main entrypoint"
  [& args]
  (say-hello "fellow Emacs user" "Tellis (@tbellisiv)"))
